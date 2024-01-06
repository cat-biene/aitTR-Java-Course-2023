package practice;

import java.util.HashMap;
import java.util.Map;

// посчитать количество М и Ж в нашей группе
public class MenAndWomen {

    public static void main(String[] args) {

        System.out.println("Group list with gender");

        Map<String, String> groupMapGender = new HashMap<>();
        groupMapGender.put("Leonid", "Male");
        groupMapGender.put("Kirill", "Male");
        groupMapGender.put("Olesia", "Female");
        groupMapGender.put("Galina", "Female");
        groupMapGender.put("Andreas", "Male");
        groupMapGender.put("Sergei", "Male");
        groupMapGender.put("Elena", "Female");
        groupMapGender.put("Victor", "Male");
        groupMapGender.put("Tatyana", "Female");
        groupMapGender.put("Vladislava", "Female");
        groupMapGender.put("Iryna", "Female");
        groupMapGender.put("Sasha", "Male");
        groupMapGender.put("Olga", "Female");

        int women = 0;
        for (String name : groupMapGender.keySet()) {
            if(groupMapGender.get(name).equals("Female")) {
                women++;
            }
        }
        System.out.println("Women: " + women);

        women = 0;
        for (String name : groupMapGender.values()) {
            if(name.equals("Female")) {
                women++;
            }
        }
        System.out.println("Women: " + women);

    }
}
