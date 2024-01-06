package homework.city;
// заводим абстрактные методы для работы сщ структурой данных "лист/List" (список чего-то)
// для любых типов данных Integer, String, StringBuilder, Employee, Car, Pet, Photo, Book ...

public interface CityList<E> extends Iterable<E>{

    // узнать размер списка
    int size();

    // есть ли что-то в списке или он пустой
    default boolean isEmpty() {
        return size() == 0;
    }

    // удалить все из списка
    void clean();

    // добавить элемент списка
    boolean add(E element);

    // есть ли элемент в списке по индексу
    default boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    // удалить элемент по его индексу
    default boolean remove(E o) {
        int index = indexOf(o);
        if(index < 0) { // когда объекта нет в нашем списке
          return false;
        }
        remove(index); // удалили элемент, и объект пропал из списка
        return true;
    }

    // добавить (вставить) элемент по индексу
    boolean add(int index, E element);

    // удалить элемент из списка
    E remove(int index);

    // получить элемент по его индексу
    E get(int index);

    // обновить элемент в списке по его индексу
    E set(int index, E element);

    // зная элемент, найти его индекс
    int indexOf(Object o);

    // ищем индекс элемент с конца списка
    int lastIndexOf(String target);

    void printCityList();
}
