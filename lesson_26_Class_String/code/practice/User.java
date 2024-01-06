package practice;
/*
1) @ exists and only one -> @ только одна
2) dot after @ (done)  -> после собаки должна быть точка(.) как минимум одна
3) after last dot minimum 2 symbols -> после последней точки должно быть мимнмум два символа
4) alphabetic, digits, _ , - , . , @ - разрешенны буквы алфавита, цифры и некоторые служебные символы, но не всеa
 */

import java.util.Objects;

public class User {

    // fields
    private String email;
    private String password;

    // constructor
    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public User() { // конструктор без параметров
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid! ");
        }
    }
    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@'); // ищем индекс @
        if(indexAt <= 0 || indexAt != email.lastIndexOf('@')) { // проверяем налие нашей собаки и что она одна
            return false; //
        }
        if (email.indexOf(".", indexAt) == -1) { // не нашлась точка начиная с позиции @
            return false;
        }
        if (email.indexOf('.') >= email.length() -2) { // более одного символа после точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
            char c = email.charAt(i);
            if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password not valid");
        }
    }
    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */

    private boolean validatePassword(String password) {

        String symbols = "!@#$%^&*()_+";
        boolean[] test = new boolean[5];
        if(password.length() >= 8) { // проверяем, пароль должен быть больше 8 символов, если пароль короткий возвращаем false
            test[0] = true;// если пароль короткий возвращаем false
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); // назначаем переменную для символов, которые будем проверять
            if (Character.isUpperCase(c)) {
                test[1] = true;
            }
            if (Character.isLowerCase(c)) {
                test[2] = true;
            }
            if (Character.isDigit(c)) {
                test[3] = true;
            }
            if (symbols.indexOf(c) >= 0){
                test[4] = true;
            }


        }
        return test[0]&&test[1]&&test[2]&&test[3]&&test[4]; // возвращаем true если прошел проверку
    }

    // method toString
    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        return Objects.equals(email, user.email);
    }

}
