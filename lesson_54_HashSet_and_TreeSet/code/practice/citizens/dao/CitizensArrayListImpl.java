package practice.citizens.dao;

import practice.citizens.model.Person_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensArrayListImpl implements Citizens_01 {

    private List<Person_01> idList; // список граждан по id
    private List<Person_01> lastNameList; // список граждан по фамилиям
    private List<Person_01> ageList; // список граждан по возрасту

    private static Comparator<Person_01> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортирока по алфавиту по фамилиям
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по Id
    };

    private static Comparator<Person_01> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge()); // сортировка по количеству лет
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по Id
    };

    // constructor
    public CitizensArrayListImpl() {
        idList = new ArrayList<>(); // создаем пстой лит
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensArrayListImpl(List<Person_01> citizens) {
        this(); // вызов пустого конструктора
        for (Person_01 person : citizens) {
            add(person);
        }

    }

    @Override
    public boolean add(Person_01 person) {
        // будем вносить объекты Person сразу в три листа
        // поддержиая их сортировку
        if(person == null) {
            return false;
        }
        int index = Collections.binarySearch(idList, person);// быстрый поиск
        if(index >= 0) {
            return false;
        }
        index = - index - 1;
        idList.add(index, person);

        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);

        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : - index - 1;
        lastNameList.add(index, person);
        return true;
    }

    @Override
    public boolean remove(int id) {
        Person_01 victim = find(id);
        if(victim == null) {
            return false;
        }
        idList.remove(victim);
        return true;
    }

    @Override
    public Person_01 find(int id) {
        Person_01 pattern = new Person_01(id, null, null, null);
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index) ;
    }

    @Override
    public Iterable<Person_01> find(int minAge, int maxAge) {
        LocalDate now =LocalDate.now();
        Person_01 pattern = new Person_01(Integer.MIN_VALUE, null, null, now.minusYears(minAge));
        int from = - Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person_01(Integer.MAX_VALUE, null, null, now.minusYears(maxAge));
        int to = - Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    @Override
    public Iterable<Person_01> find(String lastName) {
        Person_01 pattern = new Person_01(Integer.MIN_VALUE, null, lastName, null);
        int from = - Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person_01(Integer.MAX_VALUE, null, lastName, null);
        int to = - Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    @Override
    public Iterable<Person_01> getAllPersonsSortedById() {
        return idList; // вернули ссылку
    }

    @Override
    public Iterable<Person_01> getAllPersonsSortedByAge() {
        return ageList; // вернули ссылку
    }

    @Override
    public Iterable<Person_01> getAllPersonsSortedByLastName() {
        return lastNameList; // вернули ссылку
    }

    @Override
    public int size() {
        return idList.size();
    }
}
