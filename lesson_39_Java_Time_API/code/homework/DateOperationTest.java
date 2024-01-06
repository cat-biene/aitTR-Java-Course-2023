package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateOperationTest {
    @Test
    void getAge() {
        //assertEquals(62, DateOperation.getAge("12/04/1961"));
        assertEquals(61, DateOperation.getAge("1961-12-25"));
        //assertEquals(40, DateOperation.getAge("1983-10-05"));
        //assertEquals(46, DateOperation.getAge("11/05/1977"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] expected = {"1970-08-12", " 2000-12-01", "10/12/2000", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        assertArrayEquals(expected, actual);
    }
}