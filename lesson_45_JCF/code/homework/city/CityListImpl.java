package homework.city;

import homework.city.CityList;

import java.util.Arrays;
import java.util.Iterator;

public class CityListImpl<E> implements CityList<E> {

    // fields of class
    private Object[] elements; // массив для списка объектов
    private int size; // размер списка

    // constructor
    public CityListImpl(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegel capacity = " + initialCapacity); // выбросили исключение
        }
        elements = new Object[initialCapacity];
    }

    public CityListImpl() {
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError(); // большего по размеру массива создать не можем
            }
            int newCapacity = elements.length + elements.length / 2; // выростили длину массива в 1,5 раза
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity); // скопировали в новый массив
        }
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление в конец списка
            add(element);
            return true;
        }
        // добавление в серидину списка
        checkIndex(index);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size++ - index);
        elements[index] = element;
        return true;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E el = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, --size - index);
        elements[size] = null;
        return el;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index]; // (E) - кастинг к типу
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E victim = (E) elements[index]; // нашли элемент по индексу
        elements[index] = element;
        return victim;
    }

    @Override
    public int indexOf(Object o) {
        if (o != null) { // когда объект не null
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else { // когда в листе есть объект null
            for (int i = 0; i < size; i++) {
                if (o == elements[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String target) {
        for (int i = size - 1; i >= 0; i--) { // перебираем цикл, цикл начинаем с инициализации переменной i значением size - 1, выполняется, пока i больше или равно 0, и уменьшает i после каждой итерации.
            if (elements[i].equals(target)) { // проверяем, равен ли элемент массива elements с индексом i значению target. Метод equals используется для сравнения объектов на равенство.
                return i; // если условие выполняеться возвращаем i
            }
        }
        return -1; //  Если ни один из элементов не равен target, возвращается -1, значит, что элемент не был найден в массиве.
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            int i = 0; // с какого элемента начинаеться перебор

            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public E next() {
                return (E) elements[i++];
            }
        };
    }

    public void printCityList() {
        for (Object s : elements ) {
            System.out.println(s);
        }
    }
}
