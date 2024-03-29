package practice.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reader1 {

    private String fio;
    private String email;
    private boolean subscriber;
    private List<Book1> books;

    public Reader1(String fio, String email, boolean subscriber) {
        this.fio = fio;
        this.email = email;
        this.subscriber = subscriber;
        this.books = new ArrayList<>(); // инициализация списка книг читателя
    }

    public Reader1(String fio, String email) {
        this.fio = fio;
        this.email = email;
    }

    public  boolean isSubscriber(){
        return subscriber;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubscriber(boolean subscriber) {
        this.subscriber = subscriber;
    }

    public String getFio() {
        return fio;
    }

    public String getEmail() {
        return email;
    }

    public List<Book1> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader1 reader = (Reader1) o;
        return Objects.equals(email, reader.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                ", subscriber=" + subscriber +
                ", books=" + books +
                '}';
    }
}
