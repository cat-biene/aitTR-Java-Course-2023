package practice.myString.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {

    // fields of class
    private StringBuilder str;
    private int size;
    private  int currPosition;

    // constructor
    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        // this.currPosition = 0;
    }

    // проверка, есть ли следующий элемент
    @Override
    public boolean hasNext() {
        return currPosition < size; // логическое выражение, true - значит есть еще элементы
    }

    // этот метод должен вернуть множество элементов
    @Override
    public Character next() {
        Character curCharacter = str.charAt(currPosition);
        curCharacter++;
        return curCharacter;
    }

    // метод для удаления элемента строки
    public void remove() {
        str.deleteCharAt(--currPosition);
        size--;
    }
}
