package homework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ThreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i <= 10; i++) {
            treeSet.add(i);
        }
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        for (int i = 11; i <= 20; i++) {
            treeSet1.add(i);
        }
        System.out.println("ThreeSet1: " + treeSet1);
        System.out.println();

        // добавляет указанный элемент в этот набор, если он еще не присутствует.
        System.out.println("***     ***     add(E e)     ***     ***");
        treeSet.add(11);
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // добавляет в этот набор все элементы указанной коллекции.
        System.out.println("***     ***     addAll(Collection<? extends E> c)     ***     ***");
        treeSet.addAll(treeSet1);
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // возвращает наименьший элемент в этом наборе, который больше или равен заданному элементу, или null если такой элемент отсутствует.
        System.out.println("***     ***     ceiling(E e)     ***     ***");
        Integer ceilingResult = treeSet.ceiling(5);
        System.out.println("Result ceiling: " + ceilingResult);
        System.out.println();


        // возвращает неполную копию этого TreeSet экземпляра
        System.out.println("***     ***     clone()     ***     ***");
        TreeSet<Integer> clonedSet = (TreeSet<Integer>) treeSet.clone();
        System.out.println("Cloned TreeSet: " + clonedSet);
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // возвращает компаратор, используемый для упорядочивания элементов в этом наборе, или значение NULL , если этот набор использует естественный порядок элементов.
        System.out.println("***     ***     comparator()     ***     ***");
        Comparator<Integer> comparator = (Comparator<Integer>) treeSet.comparator();
        if (comparator == null) {
            System.out.println("Набор использует естественный порядок элементов.");
        } else {
            System.out.println("Comparator: " + comparator);
        }
        System.out.println();

        // возвращает итератор по элементам этого набора в порядке убывания.
        System.out.println("***     ***     descendingIterator()     ***     ***");
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + ", ");
        }
        System.out.println();
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // возвращает представление элементов, содержащихся в этом наборе, в обратном порядке.
        System.out.println("***     ***     descendingSet()     ***     ***");

        SortedSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println("Descending Set: " + descendingSet);
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // возвращает первый (самый низкий) элемент в этом наборе.
        System.out.println("***     ***     first()     ***     ***");
        System.out.println("Result: " + treeSet.first());
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // возвращает наибольший элемент в этом наборе, меньший или равный заданному элементу, или nullесли такой элемент отсутствует.
        System.out.println("***     ***     floor(E e)     ***     ***");
        System.out.println("Result: " + treeSet.floor(20));
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // возвращает наибольший элемент в этом наборе, строго меньший, чем заданный элемент, или null если такого элемента нет.
        System.out.println("***     ***     lower(E e)     ***     ***");
        System.out.println("Result: " + treeSet.lower(5));
        System.out.println("ThreeSet: " + treeSet);
        System.out.println();

        // извлекает и удаляет первый (самый низкий) элемент или возвращает значение, null если этот набор пуст.
        System.out.println("***     ***     pollFirst()     ***     ***");
        System.out.println("Result: " + treeSet.pollFirst());
        System.out.println("Result: " + treeSet);
        System.out.println();

        // извлекает и удаляет последний (самый высокий) элемент или возвращает значение, null если этот набор пуст.
        System.out.println("***     ***     pollLast()     ***     ***");
        System.out.println("Result: " + treeSet.pollLast());
        System.out.println("Result: " + treeSet);
        System.out.println();

        // удаляет указанный элемент из этого набора, если он присутствует.
        System.out.println("***     ***     remove(Object o)     ***     ***");
        System.out.println("Result: " + treeSet.remove(5));
        System.out.println("Result: " + treeSet);
        System.out.println();

        // возвращает количество элементов в этом наборе (его мощность).
        System.out.println("***     ***     size()     ***     ***");
        System.out.println("Result: " + treeSet.size());
        System.out.println("Result: " + treeSet);
        System.out.println();

        // создает позднюю привязку и быструю обработку сбоев Spliterator для элементов в этом наборе.
        System.out.println("***     ***     spliterator()     ***     ***");
        System.out.println("Result: " + treeSet.spliterator());
        System.out.println("Result: " + treeSet);
        System.out.println();

        // возвращает представление части этого набора, элементы которого находятся в диапазоне от from Elementдо toElement.
        System.out.println("***     ***     subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)     ***     ***");
        System.out.println("Result: " + treeSet.subSet(5,10));
        System.out.println("Result: " + treeSet);
        System.out.println();

        // возвращает представление части этого набора, элементы которого варьируются от fromElement включительно до toElement включительно.
        System.out.println("***     ***     subSet(E fromElement, E toElement)     ***     ***");
        System.out.println("Result: " + treeSet.subSet(3,8));
        System.out.println("Result: " + treeSet);
        System.out.println();

        // возвращает представление части этого набора, элементы которого больше или равны fromElement.
        System.out.println("***     ***     tailSet(E fromElement)     ***     ***");
        System.out.println("Result: " + treeSet.tailSet(5));
        System.out.println("Result: " + treeSet);
        System.out.println();

        // возвращает представление части этого набора, элементы которого больше (или равны, если inclusive истинно) fromElement.
        System.out.println("***     ***     tailSet(E fromElement, boolean inclusive)     ***     ***");
        System.out.println("Result: " + treeSet.tailSet(11));
        System.out.println("Result: " + treeSet);
        System.out.println();

        // удаляет все элементы из этого набора.
        System.out.println("***     ***     clear()     ***     ***");
        treeSet.clear();
        if(treeSet.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

