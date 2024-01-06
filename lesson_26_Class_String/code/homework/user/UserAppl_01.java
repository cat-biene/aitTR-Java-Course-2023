package homework.user;

public class UserAppl_01 {

    public static void main(String[] args) {

        User_01 user = new User_01("peter@gmail.com", "Qw12345!"); // создаем пользователя
        System.out.println(user); // печатаем

        user.setEmail("peter@gmail.com");
        System.out.println(user); // печатаем

    }
}
