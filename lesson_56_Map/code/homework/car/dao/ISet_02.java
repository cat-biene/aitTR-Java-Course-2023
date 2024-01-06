package homework.car.dao;

public interface ISet_02<E> extends Iterable<E>{
    boolean add (E element);
    boolean contains(E element);
    boolean remove (E element);
    int size();
}
