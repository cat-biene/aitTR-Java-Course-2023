package homework.gender;

public enum Gender {

    MAlE("Male"), FEMALE("Female"), NON_BINARY("Non-Binary"), PREFER_NOT_TO_SAY("Prefer not to say"), OTHER("Other");

    // fields
    private String gender;

    //constructor
    Gender(String gender) {
        this.gender = gender;
    }

    // метод, void - ничего не возвращается, он печатает
    public static void printMenu(){
        Gender[]menu = Gender.values();
        for (int i = 0; i < Gender.values().length; i++) {
            System.out.print(menu[i].gender) ;
        }
        System.out.println();
    }
}
