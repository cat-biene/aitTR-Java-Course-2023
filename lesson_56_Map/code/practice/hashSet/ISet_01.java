package practice.hashSet;

public interface ISet_01<E> extends Iterable<E> {
    boolean add(E element);

    boolean contains(E element);

    boolean remove(E element);

    int size();
}
