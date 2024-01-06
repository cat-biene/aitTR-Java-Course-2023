package practice;

public class UserAppl {

    public static void main(String[] args) {

        User user = new User("peter@gmail.com", "Fahemh05!"); // создаем пользователя
        System.out.println(user); // печатаем пользователя


        user.setEmail("peter@gmail.com");
        System.out.println(user); // печатаем пользователя
        user.setPassword("Fahemh05!");
        System.out.println(user);
    }
}
