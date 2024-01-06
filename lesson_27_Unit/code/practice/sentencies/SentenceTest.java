package practice.sentencies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence; // поле класса типа Sentence

    @BeforeEach
    void setUp() {
        sentence = new Sentence(); // вызвали конструктор который по умолчанию есть у всех объектов
    }

    @Test
    void countWordsTest() {
        String str = "One / two : three , four.";
        assertEquals(4,sentence.countWords(str));
    }

    @Test
    void countSymbolsTest() {
        String str  = "fu! ld& kj: kd; dh@";
        assertEquals(10, sentence.countSymbols(str));


    }
}