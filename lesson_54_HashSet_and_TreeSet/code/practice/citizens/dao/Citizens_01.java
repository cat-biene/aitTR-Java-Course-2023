package practice.citizens.dao;

import practice.citizens.model.Person_01;

public interface Citizens_01 {

    //добавляем персону
    boolean add(Person_01 person);

    //удаляем персону по id
    boolean remove(int id);

    //ищем персону по id
    Person_01 find(int id);

    // поиск списка в диапазоне возраста
    Iterable<Person_01> find(int minAge, int maxAge); // вернем перебираемые данные

    // поиск по фамилии
    Iterable<Person_01> find(String lastName);

    // выгрузка всех граждан, отсортированных по id
    Iterable<Person_01> getAllPersonsSortedById();

    // выгрузка всех граждан, отсортированных по возрасту
    Iterable<Person_01> getAllPersonsSortedByAge();

    // выгрузка всех граждан, отсортированных по фамилии по алфавиту
    Iterable<Person_01> getAllPersonsSortedByLastName();

    // определяет кол-во граждан
    int size();
}
