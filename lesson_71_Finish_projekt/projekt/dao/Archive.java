package dao;

import model.Documents;
import java.time.LocalDate;
import java.util.List;

public interface Archive { // класс интерфейс (с абстрактыми методами)

    boolean addDocuments(Documents documents); // добавление документа
    boolean removeDocuments(int folderId, int documentId); // удаление документа
    void updateDocument(int folderId, int documentId, String annotation, String url);
    Documents getDocumentsFromFolder(int folderId, int documentId); // получение документа из папки
    List<Documents> getAllDocumentsFromFolder(int folderId); // получение всех документов из папки
    List<Documents> getAllDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo); // получение документов подате от и до
    List<Documents> findDocumentByKeyWord(String keyword); // поиск по ключевому слову или анотации
    int size(); // количество документов
    void viewArchive(); // метод для печати содержимого
}