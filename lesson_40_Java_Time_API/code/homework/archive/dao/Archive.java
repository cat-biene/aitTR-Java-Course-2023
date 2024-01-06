package homework.archive.dao;
// Document fields:
// folder id
// document id
// Name
// url
// document date
// The archive should allow:
//add a document
//update the document
//get a document by document and folder number
//get all documents from a folder by its number
//receive all documents with dates for the period from and to
//find out the number of documents stored in the archive

import homework.archive.model.Documents;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Archive { // класс интерфейс (с абстрактыми методами)

    boolean addDocuments(Documents documents); // добавление документа
    boolean removeDocuments(int folderId, int documentId); // удаление документа
    boolean updateDocuments(int folderId, int documentId, String url); // обновление документа
    Documents getDocumentsFromFolder(int folderId, int documentId); // получение документа из папки
    Documents[] getAllDocumentsFromFolder(int folderId); // получение всех документов из папки
    Documents[] getAllDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo); // получение документов подате от и до
    int size(); // количество документов
    void viewArchive(); // метод для печати содержимого
}
