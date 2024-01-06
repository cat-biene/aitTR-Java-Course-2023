package practice.citizens.test;

import practice.citizens.dao.Citizens_01;
import practice.citizens.dao.CitizensHashSetImpl;
import practice.citizens.model.Person_01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CitizensImplTest_01 {

    Citizens_01 citizens;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        citizens = new CitizensHashSetImpl(List.of(
                new Person_01(1, "Peter", "Jackson", now.minusYears(23)),
                new Person_01(2, "John", "Smith", now.minusYears(20)),
                new Person_01(3, "Mary", "Jackson", now.minusYears(23)),
                new Person_01(4, "Bruce", "Willis", now.minusYears(25))

        ));

    }

    @Test
    void addTest() {
        assertFalse(citizens.add(null));
        assertFalse(citizens.add(new Person_01(2, "John", "Smith", now.minusYears(20))));
        assertEquals(4, citizens.size());
        assertTrue(citizens.add(new Person_01(5, "Jack", "Smith", now.minusYears(25))));
    }

    @Test
    void removeTest() {
        assertFalse(citizens.remove(5));
        assertEquals(4, citizens.size());
        assertTrue(citizens.remove(4));
        assertEquals(3, citizens.size());
    }

    @Test
    void findTest() {
        Person_01 person = citizens.find(1);
        assertEquals(1, person.getId());
        assertEquals("Peter", person.getFirstName());
        assertEquals("Jackson", person.getLastName());
        assertEquals(23, person.getAge());
        assertNull(citizens.find(5));
    }

    @Test
    void findByLastNameTest() {
        // могут быть однофамильцы
        Iterable<Person_01> persons = citizens.find("Jackson");
        // переносим полученных в результат в ArrayLst
        List<Person_01> actual = new ArrayList<>();
        for (Person_01 person : persons) {
            actual.add(person);
        }
        Collections.sort(actual); // по умолчанию по Id
        List<Person_01> expected = List.of(
                new Person_01(1, "Peter", "Jackson", now.minusYears(23)),
                new Person_01(3, "Mary", "Jackson", now.minusYears(23))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void findByAgeRangeTest() {
        // возраст в диапозоне
        Iterable<Person_01> persons = citizens.find(20, 23);
        // переносим полученных в результат в ArrayLst
        List<Person_01> actual = new ArrayList<>();
        for (Person_01 person : persons) {
            actual.add(person);
        }
        Collections.sort(actual); // по умолчанию по Id
        List<Person_01> expected = List.of(
                new Person_01(1, "Peter", "Jackson", now.minusYears(23)),
                new Person_01(2, "John", "Smith", now.minusYears(20)),
                new Person_01(3, "Mary", "Jackson", now.minusYears(23))
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void getAllPersonsSortedByIdTest() {
        // что метод отберет все персоны, что се они отсортированы по id
        // id текущего < id следуюшего
        Iterable<Person_01> persons = citizens.getAllPersonsSortedById();
        int id = -1;
        int count = 0;
        for (Person_01 person : persons) {
            count++;
            assertTrue(person.getId() > id); // следующий id ,больше предыдушего
            id = person.getId();
        }
        // переносим полученных в результат в ArrayLst
        assertEquals(count, citizens.size());
    }

    @Test
    void getAllPersonsSortedByAgeTest() {
        /*Iterable<Person> persons = citizens.getAllPersonsSortedByAge();
        int age = -1;
        int count = 0;
        for (Person person : persons) {
            count++;
            if (!(person.getAge() >= age)) {
                System.out.println("Person: " + person);
            }
            assertTrue(person.getAge() >= age); // следующий id, больше предыдушего
            age = person.getAge();
        }
        // переносим полученных в результат в ArrayLst
        assertEquals(count, citizens.size());*/

        Iterable<Person_01> persons = citizens.find(20, 23);

        Set<Person_01> actual = new HashSet<>();
        for (Person_01 person : persons) {
            actual.add(person);
        }

        Set<Person_01> expected = Set.of(
                new Person_01(1, "Peter", "Jackson", now.minusYears(23)),
                new Person_01(2, "John", "Smith", now.minusYears(20)),
                new Person_01(3, "Mary", "Jackson", now.minusYears(23))
        );

        assertEquals(expected, actual);
    }

    @Test
    void getAllPersonsSortedByLastNameTest() {
        /*Iterable<Person> persons = citizens.getAllPersonsSortedByLastName() ;
        String lastName = "";
        int count = 0;
        for (Person person : persons) {
            count++;
            assertTrue(person.getLastName().compareTo(lastName) >= 0); // следующий LastName, больше предыдущего
            lastName = person.getLastName();
        }
        // переносим полученных в результат в ArrayLst
        assertEquals(count, citizens.size());*/

        Iterable<Person_01> persons = citizens.getAllPersonsSortedByLastName();
        Set<Person_01> actual = new HashSet<>();
        for (Person_01 person : persons) {
            actual.add(person);
        }

        Set<Person_01> expected = Set.of(
                new Person_01(1, "Peter", "Jackson", now.minusYears(23)),
                new Person_01(2, "John", "Smith", now.minusYears(20)),
                new Person_01(3, "Mary", "Jackson", now.minusYears(23)),
                new Person_01(4, "Bruce", "Willis", now.minusYears(25))
        );

        assertEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        assertEquals(4, citizens.size());
    }
}