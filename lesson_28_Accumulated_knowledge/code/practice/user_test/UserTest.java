package practice.user_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    final String email = "peter@gmail.com";
    final String password = "12345Az!";

    @BeforeEach
    void setUp() {
        user = new User(email, password); // перед каждым тестом
    }

    @Test
    void testCorrectEmail() {
        user.setEmail("peter@yahoo.com"); // устанавливаем новый email
        assertEquals("peter@yahoo.com", user.getEmail());
    }

    @Test
    void withouAtEmail() {
        user.setEmail("peter.yahoo.com");
        assertEquals(email, user.getEmail()); // если совпадут, это значит, что email не установился, а остался прежним
    }

    @Test
    void setPassword() {
    }
}