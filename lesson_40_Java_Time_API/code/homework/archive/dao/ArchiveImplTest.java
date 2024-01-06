package homework.archive.dao;

import homework.archive.model.Documents;
import homework.archive.dao.ArchiveImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    Archive archive;
    Documents[] document;
    LocalDateTime now = LocalDateTime.now();


    @BeforeEach
    void setUp() {

        archive = new ArchiveImpl(7);
        document = new Documents[6];
        document[0] = new Documents(1, 1, "Salary", "url1", now.minusDays(2));
        document[1] = new Documents(1, 2, "Vacation", "url2", now.minusDays(3));
        document[2] = new Documents(1, 3, "Buying a computer", "url3", now.minusDays(5));
        document[3] = new Documents(2, 4, "Buying a laptop", "url4", now.minusDays(7));
        document[4] = new Documents(2, 5, "Concert", "url5", now.minusDays(7));
        document[5] = new Documents(1, 6, "Concert", "url5", now.minusDays(7));

        for (int i = 0; i < document.length; i++) {
            archive.addDocuments(document[i]);

        }
    }

    @Test
    void addDocumentsTest() {
        // null
        assertFalse(archive.addDocuments(null));
        // not add existing
        assertFalse(archive.addDocuments(document[1]));
        // add document
        Documents documents = new Documents(4, 2, "Concert", "url6", now.minusDays(1));
        assertTrue(archive.addDocuments(documents));
        //cannot be exceeded capacity
        Documents documents1 = new Documents(4, 3, "Concert", "url7", now.minusDays(12));
        assertFalse(archive.addDocuments(documents1));
        // check quantity
        assertEquals(7, archive.size());
    }

    @Test
    void removeDocumentTest() {
        archive.viewArchive(); // до удаления
        // удаление имеющегося фото
        assertTrue(archive.removeDocuments(1, 1)); // это проверка на удаление d[0]
        System.out.println("---------------------");
        archive.viewArchive(); // после удаления
        // удаление отсутствующего фото
        assertFalse(archive.removeDocuments(3, 7)); // такого документа нет в архиве
        // проверка количества
        assertEquals(5, archive.size());
        // не найдем удаленный документ
        assertNull(archive.getDocumentsFromFolder(1, 1));
    }

    @Test
    void updateDocumentsTest() {
        // update existing document
        assertTrue(archive.updateDocuments(1, 1, "newUrl1"));
        // update non-existing document
        assertFalse(archive.updateDocuments(10, 1, "newUrl1"));
    }

    @Test
    void getDocumentsFromFolderTest() {
        // get existing document
        assertNotNull(archive.getDocumentsFromFolder(1, 1));
        // get non-existing document
        assertNull(archive.getDocumentsFromFolder(10, 1));
    }

    @Test
    void getAllDocumentsFromFolderTest() {
        Documents[] expected = {document[4],document[5]};
        Arrays.sort(expected);// сортируем
        Documents[] actual = archive.getAllDocumentsFromFolder(2);//выбрали folderId = 2
        Arrays.sort(actual);// сортируем
        assertArrayEquals(expected,actual);
    }

    @Test
    void getAllDocumentBetweenDateTest() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату
        Documents[] actual = archive.getAllDocumentBetweenDate(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual);
        Documents[] expected = {document[0],document[1],document[2]};
        assertArrayEquals(expected,actual);
    }

    @Test
    void size() {
        assertEquals(6, archive.size());
    }

    @Test
    void viewDocumentsTest() {
        archive.viewArchive(); // до сортировки
        Arrays.sort(document);
        archive.viewArchive(); // после сортировки
    }

}