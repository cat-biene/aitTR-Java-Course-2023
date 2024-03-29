package homework.car;

import consultation.cars.model.Car;
import practice.hashSet.ISet_01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IHashSet<E> implements ISet_01<E> {

    //Сортировка:
//HashSet не сохраняет порядок элементов, они хранятся в неопределенном порядке.
// TreeSet хранит элементы в отсортированном порядке с использованием компаратора или естественного порядка (если элементы реализуют интерфейс Comparable).

//Сложность операций:
// HashSet имеет временную сложность O(1) для большинства операций (добавление, удаление, поиск) в среднем случае, хотя может быть O(n) в худшем случае для поиска.
//TreeSet обеспечивает O(log n) для большинства операций (добавление, удаление, поиск), так как элементы хранятся в отсортированном порядке с использованием бинарного дерева.

//Дубликаты и уникальность:
//HashSet не допускает дубликатов и хранит только уникальные элементы.
//TreeSet также хранит только уникальные элементы, и они автоматически упорядочиваются.

//Память:
//HashSet требует меньше памяти, чем TreeSet, так как в TreeSet дополнительно хранится информация о порядке элементов.
//Таким образом, недостатком HashSet по сравнению с TreeSet является отсутствие гарантированной сортировки элементов и, в некоторых случаях, более высокая сложность поиска (в среднем). Однако HashSet может быть более эффективным с точки зрения производительности для операций добавления, удаления и поиска в среднем случае, особенно при больших объемах данных, где конкретный порядок элементов не критичен.

    // поля
    private LinkedList<E>[] hashset; // это массив из связных листов, то есть
    // каждый элемент массива - это отдельный LinkedList <E>

    private int size;
    private int capacity; // кол-во "ячеек", "гвоздиков" для цепочек
    private double loadFactor;  // объем загрузки этих ячеек

    public IHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity]; // это массив из LinkedList
        // каждый элемент массива - это отдельный LinkedList <E>
    }

    // в этом конструкторе можно определить свой loadFactor
    public IHashSet (int capacity){
        this(capacity, 0.75); // 0.75 - это loadFactor
    }

    // конструктор по умолчанию
    public IHashSet(){
        this(16, 0.75);
    }

    public IHashSet(List<Car> cars) {
        this();
    }

    @Override
    public boolean add(E element) {
        if(size >= capacity * loadFactor){
            rebuildArray();
        }
        int index = getIndex(element);
        if(hashset[index] == null){
            hashset[index] = new LinkedList<>();
        }
        if(hashset[index].contains(element)){
            return false; // следим за уникальностью элементов
        }
        hashset[index].add(element);
        size++;
        return true;
    }

    private void rebuildArray(){
        capacity = capacity * 2; // удвоили размер
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        // надо обежать весь hashSet, залезть в каждый его LinkedList, переложить элементы в новый
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null){
                for (E e : hashset[i]) {
                    int index = getIndex(e);
                    if(newHashSet[index] == null){
                        newHashSet[index] = new LinkedList<>(); // создаем новый лист
                    }
                    newHashSet[index].add(e); // добавляем элемент в LinkedList
                }
            }
        }
        hashset = newHashSet; // переопределили ссылку, garbage collector очистит память
    }

    private int getIndex(E element) {
        int hashcode = element.hashCode(); // вычисляем hashcode элемента
        hashcode = hashcode >=0 ? hashcode : - hashcode;
        return hashcode % capacity; // деление с остатком
    }

    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if(hashset[index] == null) {
            return false;
        }
        return hashset[index].contains(element);// проверяем наличие элемента
    }

    @Override
    public boolean remove(E element) {
        int index = getIndex(element);
        if(hashset[index] == null) {
            return false;
        }
        boolean res = hashset[index].remove(element);
        if(res) {
            size--;
        }
        return res;
    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i;
            int j;
            int totalCounter;
            @Override
            public boolean hasNext() {
                return totalCounter < size; // пока есть куда двигаться
            }

            @Override
            public E next() {
                while(hashset[i] == null || hashset[i].isEmpty()){ // если пусто
                    i++; // переходим к следующему
                }
                E res = hashset[i].get(j);
                totalCounter++;
                if(j < hashset[i].size() - 1) { // находимся внутри LinkedList
                    j++;
                } else {
                    j = 0;
                    i++;
                }
                return res;
            }
        };
    }
}
