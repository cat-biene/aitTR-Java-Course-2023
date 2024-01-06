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
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive {

    static Comparator<Documents> comparator = (d1, d2) -> { // метод сравнения
        int res = d1.getDocumentDate().compareTo(d2.getDocumentDate()); // сравниваем по id папок
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId()); // сравниваем по id документов
    };

    // fields of class
    private Documents[] documents; // массив для хранения документов
    private int size; // количество документов


    //constructor
    public ArchiveImpl(int capacity) { // массив для хранения документов размером capacity
        documents = new Documents[capacity];
    }

    @Override
    public boolean addDocuments(Documents document) { // метод добавления документа
        if (document == null || size == documents.length || getDocumentsFromFolder(document.getDocumentId(), document.getFolderId()) != null) {
            return false;
        }
        // ищем индекс, куда вставить
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        // обработка индекса
        index = index >= 0 ? index : -index - 1;
        // раздвигаем массив с индекса на 1 место вправо
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }

    @Override
    public boolean removeDocuments(int folderId, int documentId) { //  метод удаления документа
        // ищем фото
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId && documents[i].getFolderId() == folderId) {
                // надвигаем массив на найденную позицию i удаляемого фото
                System.arraycopy(documents, i + 1, documents, i, size - 1 - i);
                // size--;
                documents[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateDocuments(int folderId, int documentId, String url) {
       /* for (int i = 0; i < size; i++) {
            Documents document = documents[i]; // documents are our arrays
            if (document.getDocumentId() == documentId && document.getFolderId() == folderId) {
                document.setUrl(url); // update the document
                return true; // return if update*/
        Documents document = getDocumentsFromFolder(folderId, documentId);
        if (document == null) {
            return false;// return if is not update
        }
        document.setUrl(url); // update the document
        return true; // return if update
    }

    @Override
    public Documents getDocumentsFromFolder(int documentId, int folderId) {
        for (int i = 0; i < size; i++) {
            Documents documents1 = documents[i];
            if (documents1.getDocumentId() == documentId && documents1.getFolderId() == folderId) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Documents[] getAllDocumentsFromFolder(int folderId) {
        /*Documents[] res = new Documents[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Documents documents2 = documents[i];
            if (documents2.getFolderId() == folderId) {
                res[count++] = documents2;
                return res;
            }
        }
        if (count > 0) {
            return Arrays.copyOf(res, count);
        } else {
            return null;
        }*/

        return findByPredicate(p -> p.getFolderId() == folderId); // передаем в метод findByPredicate сам предикат (условие для поиска)
        // p.getFolderId() == folderId
    }

    private Documents[] findByPredicate(Predicate<Documents> predicate) { // возвращаем массив найденных объектов
        Documents[] res = new Documents[size]; // объявили массив избыточной длины
        int j = 0; // это счетчик найденных документов
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])) {
                res[j++] = documents[i];
                // j++;
            }
        }
        return Arrays.copyOf(res, j);//скопировали массив сам на себя, теперь он без элементов null

    }

    // Метод getDocumentBetweenDate использует Integer.MIN_VALUE в качестве значения documentId в объекте pattern,
    // чтобы найти левый край диапазона документов. Это делается для того, чтобы убедиться, что найденный индекс
    // всегда будет меньше или равен нулю, так как Arrays.binarySearch ожидает, что документы будут упорядочены в
    // массиве, и отрицательный индекс означает, что элемент не найден, но он мог бы быть вставлен в эту позицию.
    //
    //Использование 0 в качестве documentId в объекте pattern приведет к тому, что индекс, найденный с использованием
    // Arrays.binarySearch, будет означать точное совпадение с этим documentId, что не всегда верно, так
    // как documentId может быть неотрицательным числом.
    //
    //Итак, использование Integer.MIN_VALUE обеспечивает, что найденный индекс будет левым краем диапазона,
    // который вы хотите получить. В данном контексте Integer.MIN_VALUE служит специальным значением, которое
    // обозначает "нижнюю границу" для поиска, чтобы учесть все документы, начиная с заданной даты dateFrom.


    @Override
    public Documents[] getAllDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Documents pattern = new Documents(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay()); // вводим объектную переменную
        int from = -Arrays.binarySearch(documents, 0, size, pattern, comparator) - 1; // находим индекс начального фото (левый край)
//        from = from >= 0 ? from : -from - 1;
        pattern = new Documents(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX)); // находим правый край
        int to = -Arrays.binarySearch(documents, 0, size, pattern, comparator) - 1;
//        to = to >= 0 ? to : -to - 1;
        return Arrays.copyOfRange(documents, from, to); // Range - диапазон, создаем новый массив с нужными фото
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void viewArchive() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
        System.out.println("You have " + size + " documents.");
    }
}
