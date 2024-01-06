package practice.citizens.dao;

import practice.citizens.model.Person_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CitizensHashSetImpl implements Citizens_01 {

    // fields
    private HashSet<Person_01> idList; // список граждан по id
    private HashSet<Person_01> lastNameList; // список граждан по фамилиям
    private HashSet<Person_01> ageList; // список граждан по возрасту

    private static Comparator<Person_01> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName()); // сортировка по алфавиту по фамилиям
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по Id
    };

    private static Comparator<Person_01> ageComparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge()); // сортировка по количеству лет
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // дополнительно по Id
    };

    // constructor
    public CitizensHashSetImpl() {
        idList = new HashSet<>(); // создаем пустоe множество
        lastNameList = new HashSet<>(); // за счет компаратара поддерживается уникальность и сортируеться
        ageList = new HashSet<>();
    }

    public CitizensHashSetImpl(List<Person_01> citizens) {
        this(); // вызов пустого конструктора
        for (Person_01 person : citizens) {
            citizens.forEach(person1 -> add(person1)); // новый синтаксис с лямбда выражением
        }

    }

    @Override
    public boolean add(Person_01 person) {
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    @Override
    public boolean remove(int id) {
        Person_01 person = find(id);
        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    @Override
    public Person_01 find(int id) {
        for (Person_01 person : idList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Iterable<Person_01> find(int minAge, int maxAge) {
        LocalDate now =LocalDate.now();
        Person_01 minPattern = new Person_01(Integer.MIN_VALUE, null, null, now.minusYears(minAge));
        Person_01 maxPattern = new Person_01(Integer.MAX_VALUE, null, null, now.minusYears(maxAge));
        List<Person_01> result = new ArrayList<>();
        for (Person_01 person : ageList) {
            if (ageComparator.compare(person, minPattern) >= 0 && ageComparator.compare(person, maxPattern) <= 0) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public Iterable<Person_01> find(String lastName) {
        Person_01 minPattern = new Person_01(Integer.MIN_VALUE, null, lastName, null);
        Person_01 maxPattern = new Person_01(Integer.MAX_VALUE, null, lastName, null);
        List<Person_01> result = new ArrayList<>();
        for (Person_01 person : lastNameList) {
            if (lastNameComparator.compare(person, minPattern) >= 0 && lastNameComparator.compare(person, maxPattern) <= 0) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public Iterable<Person_01> getAllPersonsSortedById() {
        idList.stream().sorted(Person_01::compareTo);
        return idList;
    }

    @Override
    public Iterable<Person_01> getAllPersonsSortedByAge() {
        List<Person_01> sortedList = new ArrayList<>(ageList);
        sortedList.sort(ageComparator);
        return sortedList;
    }

    @Override
    public Iterable<Person_01> getAllPersonsSortedByLastName() {
        List<Person_01> sortedList = new ArrayList<>(lastNameList);
        sortedList.sort(lastNameComparator);
        return sortedList;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
