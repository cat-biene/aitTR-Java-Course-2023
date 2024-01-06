package practice.citizens.dao;

import practice.citizens.model.Person_01;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CitizensSetImpl implements Citizens_01 {

    // fields
    private TreeSet<Person_01> idList; // список граждан по id
    private TreeSet<Person_01> lastNameList; // список граждан по фамилиям
    private TreeSet<Person_01> ageList; // список граждан по возрасту

    private static Comparator<Person_01> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по алфавиту по фамилиям
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по Id
    };

    private static Comparator<Person_01> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge()); // сортировка по количеству лет
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по Id
    };

    // constructor
    public CitizensSetImpl() {
        idList = new TreeSet<>(); // создаем пустоe множество
        lastNameList = new TreeSet<>(lastNameComparator); // за счет компаратара поддерживается уникальность и сортируеться
        ageList = new TreeSet<>(ageComparator);
    }

    public CitizensSetImpl(List<Person_01> citizens) {
        this(); // вызов пустого конструктора
        for (Person_01 person : citizens) {
            citizens.forEach(person1 -> add(person1)); // новый синтаксис с лямбда выражением
        }

    }

    // O(log(n))
    @Override
    public boolean add(Person_01 person) {

//        if(person == null) {
//            return false;
//        }
//        int index = Collections.binarySearch(idList, person);// быстрый поиск
//        if(index >= 0) {
//            return false;
//        }
//        index = - index - 1;
//        idList.add(index, person);
//
//        index = Collections.binarySearch(ageList, person, ageComparator);
//        index = index >= 0 ? index : - index - 1;
//        ageList.add(index, person);
//
//        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
//        index = index >= 0 ? index : - index - 1;
//        lastNameList.add(index, person);
//        return true;
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    // O(log(n))
    @Override
    public boolean remove(int id) {
        Person_01 person = find(id);
        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    // O(log(n))
    @Override
    public Person_01 find(int id) {
        Person_01 pattern = new Person_01(id, null, null, null);
        Person_01 person = idList.ceiling(pattern);
        return pattern.equals(person) ? person : null;
    }

    // O(log(n))
    @Override
    public Iterable<Person_01> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person_01 from = new Person_01(idList.first().getId() - 1, null, null, now.minusYears(minAge));
        Person_01 to = new Person_01(idList.last().getId() + 1, null, null, now.minusYears(maxAge));
        return ageList.subSet(from, to); // берем подмножество
    }

    // O(log(n))
    @Override
    public Iterable<Person_01> find(String lastName) {
        Person_01 from = new Person_01(Integer.MIN_VALUE, null, lastName, null);
        Person_01 to = new Person_01(Integer.MAX_VALUE, null, lastName, null);
        return lastNameList.subSet(from, to);
    }

    // O(log(n))
    @Override
    public Iterable<Person_01> getAllPersonsSortedById() {
        return idList;
    }

    // O(1)
    @Override
    public Iterable<Person_01> getAllPersonsSortedByAge() {
        return ageList;
    }

    // O(1)
    @Override
    public Iterable<Person_01> getAllPersonsSortedByLastName() {
        return lastNameList;
    }

    // O(1)
    @Override
    public int size() {
        return idList.size();
    }
}
