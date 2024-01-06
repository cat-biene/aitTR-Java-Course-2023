package project.group_01.archive.dao;

import project.group_01.archive.model.Documents;

import java.io.Serializable;
import java.time.LocalDate;

    public interface Archive extends Serializable {
        boolean addDocument(Documents doc);

        boolean removeDocument(int folderId, int docId );

        boolean updateDocument(int folderId, int docId, String url);

        Documents getDocFromFolder(int folderId, int docId);

        Iterable<Documents> getAllDocFromFolder(int folderId);

        Iterable<Documents> getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo);

        int size();

        void viewArchive();
}
