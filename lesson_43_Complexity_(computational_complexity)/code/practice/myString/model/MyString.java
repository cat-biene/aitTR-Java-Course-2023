package practice.myString;

import practice.myString.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character>{

    // field
    private StringBuilder str; // StringBuilder - это встроенный в Java класс

    // constructor
    public MyString(StringBuilder str) {
        this.str = new StringBuilder(str);
    }

    //getter and setter
    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }

    // method add symbol
    public void addChar(char ch) {
        str.append(ch);
    }

    // method remove symbol
    public void removeChar(char ch) {
        int index = str.indexOf(Character.toString(ch)); // нашли индекс, с лева на право, на котором стоит ch
        str.deleteCharAt(index); // удалили символ
    }

    // method toString
    @Override
    public String toString() {
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
