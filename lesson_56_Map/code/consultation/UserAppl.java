package consultation;

import consultation.model.User;

import java.time.LocalDate;

public class UserAppl {

    public static void main(String[] args) {


    LocalDate now = LocalDate.now();

    User user = new User("firstName", "lastName", 1, 30, "email", "password", now.minusYears(20));

    int hashCode =  user.hashCode();
        System.out.println("Hash code of id " + hashCode);
}
}