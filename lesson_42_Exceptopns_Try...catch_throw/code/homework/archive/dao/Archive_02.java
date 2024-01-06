package homework.archive.dao;

import homework.archive.model.Document_02;

import java.time.LocalDate;

public interface Archive_02 {

    boolean addDocument (Document_02 document);
    boolean removeDocument(int folderId, int documentId);
    boolean updateDocument(int folderId, int documentId,String url);
    Document_02 getDocFromFolder (int folderId, int documentId);
    Document_02[] getAllDocFromFolder(int folderId);
    Document_02[] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size(); //quantity
    void viewArchive(); // метод для печати содержимого
}
