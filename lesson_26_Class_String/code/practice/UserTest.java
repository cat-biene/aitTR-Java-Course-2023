package practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void setEmail() {
        user.setEmail("");// Тест для неверного ввода email (пустая строка)
        assertNull(user.getEmail());
    }

    @Test
    void setEmailWithoutAtSymbol() {// Тест для неверного ввода email (отсутствие символа @, .)
        user.setEmail("irynayakymchuk.vetgmail.com");
        assertNull(user.getEmail());
    }

    @Test
    void setPasswordTooShort() {// Тест для неверного ввода пароля (менее 8 символов)
        user.setPassword("6852"); // Пароль менее 8 символов
        assertNull(user.getPassword());
    }

    @Test
    void setPasswordWithoutDigits() { // Тест для неверного ввода пароля (без цифр)
        user.setPassword("dddfd888"); // Пароль без цифр
        assertNull(user.getPassword());
    }

    @Test
    void setPasswordWithoutUppercase() {// Тест для неверного ввода пароля (без больших букв)
        user.setPassword("Hjk759dfd"); // Пароль без больших букв
        assertNull(user.getPassword()); // Ожидаем, что пароль будет null.
    }

    @Test
    void setPasswordWithoutSpecialCharacters() {// Тест для неверного ввода пароля (без специальных символов)
        user.setPassword("dgh852Dr!"); // Пароль без специальных символов
        assertNull(user.getPassword());
    }

    /* @Test
    void setEmail() {
    user.setEmail("irynayakymchuk@.vetgmail.com");
        assertEquals("irynayakymchuk@.vetgmail.com", user.getEmail());
    }*/

    /* @Test
    void setPassword() {
        user.setPassword("Hello!01");
        assertEquals("Hello!01", user.getPassword());
    }**/
}