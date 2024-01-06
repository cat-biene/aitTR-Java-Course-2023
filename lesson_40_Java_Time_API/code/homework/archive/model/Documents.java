package homework.archive.model;
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

import java.time.LocalDateTime;
import java.util.Objects;

public class Documents implements Comparable<Documents> {

    //fields
    private int folderId;
    private int documentId;
    private String name;
    private String url;
    private LocalDateTime documentDate;

    // constructor
    public Documents(int folderId, int documentId, String name, String url, LocalDateTime documentDate) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.name = name;
        this.url = url;
        this.documentDate = documentDate;
    }

    // getter
    public int getFolderId() {
        return folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDocumentDate() {
        return documentDate;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // method toString
    @Override
    public String toString() {
        return "Documents{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", documentDate='" + documentDate + '\'' +
                '}';
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Documents documents = (Documents) object;
        return folderId == documents.folderId && documentId == documents.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, documentId);
    }

    // method compareTo
    @Override
    public int compareTo(Documents o) {
        int res = Integer.compare(folderId, o.folderId); // сортируем по id папок
        return res != 0 ? res : Integer.compare(documentId, o.documentId); // сортируем по id документов
         // если сортировка папок не равно 0, вернем результат - сортировки папок.
        // если сортировка папок равно 0, значит папки одинаковые, продолжим сортировку по документам
    }
}
