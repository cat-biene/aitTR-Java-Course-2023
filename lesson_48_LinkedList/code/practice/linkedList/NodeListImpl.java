package practice.linkedList;

import java.util.Iterator;

public class NodeListImpl<E> implements NodeList<E> {

    // fields
    private Node<E> first;
    private Node<E> last;
    private int size;

    // O(1)
    @Override
    public int size() {
        return size;
    }

    // O(1)
    @Override
    public boolean add(E element) {
        Node<E> newNode = new Node<>(last, element, null); // создаем новый, следующий узел, последний
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
        return true;
    }

    // O(n)
    @Override
    public void clear() {

        for (Node<E> element = first; element != null;) { // перебираем каждый узел в связаном списке
            Node<E> next = element.next; // сохраняем следующий узел во временной переменной
            element.data = null; // обнуляем данные
            element.next = null; // обнуляем следующую ссылку
            element.prev = null; // обнуляем предыдущую ссылку
            element = next; // переходим к следующему узлу
        }
        first = last = null; // после цыкла устанавливаем ссылки на null
        size = 0; // устанавливаем размер 0
    }

    // O(n)
    @Override
    public boolean add(int index, E element) {
        if (index == size) {
            return add(element); // добавление в конец
        }
        Node<E> node = getNodeByIndex(index); // узел по его индексу
        Node<E> newNode = new Node<>(node.prev, element, node);
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode;
        }
        size++;
        return true;
    }

    // O(n)
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    // O(1)
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    // O(n)
    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.data;
    }

    // O(n)
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.data) {
                    return index;
                }
            }
        }
        return -1;
    }

    // O(n)
    @Override
    public int lastIndexOf(Object o) {
//        if (o != null) { // когда объект не NULL
//            for (int i = size - 1; i > -1; i--) {
//                if (o.equals(elements[i])) {
//                    return i;
//                }
//            }
//        }
//        else { // когда в листе есть объект  null
//            for (int i = size - 1; i > -1; i--) {
//                if (null == (elements[i])) {
//                    return i;
//                }
//            }
        int index = 0; // создаем переменную index, для отслеживания текущей позиции в связанном списке
        if (o != null) { //  Проверяет, не является ли объект o нулевым
            for (Node<E> node = last; node != null; node = node.prev, index++) { // перебираем цикл, начиная с последнего узла
                if (o.equals(node.data)) { // проверяем, равны ли данные текущего узла указанному объекту o.
                    return index; // возвращаем если есть совпадение
                }
            }
        } else { //  если объект o имеет значение NULL,
            for (Node<E> node = last; node != null; node = node.prev, index++) { // перебираем цикл, начиная с последнего узла
                if (node.data == null) { // проверяем, являются ли данные текущего узла нулевыми
                    return index; // возвращаем если есть совпадение
                }
            }
        }
        return -1; // возвращаем если нет совпадений
    }

    // O(n)
    @Override
    public E remove(int index) {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);
    }

    // O(n)
    // метод удаляет узел node из связного списка и возвращает его данные data
    private E unlink(Node<E> node) {
        E victim = node.data; // создаем переменную victim и сохраняем в ней данные удаляемого узла
        Node<E> prev = node.prev; // сохраняем ссылку на предыдущий узел
        Node<E> next = node.next; // сохраняем ссылку на следующий узел
        if (prev != null) { // проверяем существует ли предыдущий узел
            prev.next = next; // устанавливаем ссылку на следующий узел
            node.prev = null; // приговариваем предыдущую ссылку - null
        } else {
            first = next; // если предыдущего узла нет, то обновляем начало списка first ссылкой на следующий узел
        }
        if (next != null) { // проверяем существует ли следующий узел
            next.prev = prev; // устанавливаем ссылку на предыдущий узел
            node.next = null; // приговариваем следующую ссылку - null
        } else {
            last = prev; // Если следующего узла нет, то обновляем конец списка last ссылкой на предыдущий узел
        }
        node.data = null; // обнуляем данные узла
        size--; // уменьшаем размер списка
        return victim; // возвращаем даннные удаляемого узла
    }

    // O(1)
    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index); // нашли узел по индексу
        E victim = node.data;
        node.data = element; // обновили данные
        return victim;
    }

    // O(1)
    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Node<E> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
