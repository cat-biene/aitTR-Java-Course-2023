package homework.dao;

import homework.model.Document_01;

import java.time.LocalDate;

public interface Archive_01 {
    boolean addDocument (Document_01 document);
    boolean removeDocument(int folderId, int documentId);
    boolean updateDocument(int folderId, int documentId,String url);
    Document_01 getDocFromFolder (int folderId, int documentId);
    Document_01[] getAllDocFromFolder(int folderId);
    Document_01[] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    Document_01[] getDocBetweenDateTwo(LocalDate dateFrom, LocalDate dateTo);
    int size(); //quantity
    void viewArchive(); // метод для печати содержимого
}
