package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Documents implements Comparable<Documents>{
    private int folderId;
    private int documentId;
    private String name;
    private String url;
    private String annotation;
    private LocalDateTime documentDate;

    public Documents(int folderId, int documentId, String name, String url, String annotation, LocalDateTime documentDate) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.name = name;
        this.url = url;
        this.annotation = annotation;
        this.documentDate = documentDate;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDate = documentDate.format(formatter);

        return "Documents " +
                "folderId = " + folderId +
                ", documentId = " + documentId +
                ", name = " + name +
                ", url = " + url +
                ", annotation = " + annotation +
                ", documentDate = " + formattedDate;
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