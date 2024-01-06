package homework.gender;

import java.util.*;

public class GenderAppl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "First1", "Last1", Gender.MAlE));
        employeeList.add(new Employee(2, "First2", "Last1", Gender.FEMALE));
        employeeList.add(new Employee(3, "First6", "Last2", Gender.MAlE));
        employeeList.add(new Employee(4, "First8", "Last3", Gender.MAlE));
        employeeList.add(new Employee(5, "First10", "Last5", Gender.OTHER));
        employeeList.add(new Employee(6, "First3", "Last6", Gender.FEMALE));
        employeeList.add(new Employee(7, "First7", "Last6", Gender.PREFER_NOT_TO_SAY));
        employeeList.add(new Employee(8, "First7", "Last7", Gender.NON_BINARY));
        employeeList.add(new Employee(9, "First2", "Last8", Gender.OTHER));
        employeeList.add(new Employee(10, "First5", "Last9", Gender.PREFER_NOT_TO_SAY));

        Map<Gender, Integer> groupMapGender = new HashMap<>();

        while (true) {
            System.out.println("Input tne number enployee: ");
            System.out.println("Exit input 0.");
            int numberEmployee = scanner.nextInt();
            // Проверяем валидность введенного номера сотрудника
            if (numberEmployee >= 1 && numberEmployee <= employeeList.size()) {
                Employee selectedEmployee = employeeList.get(numberEmployee - 1); // Индексы начинаются с 0

                // Получаем гендер сотрудника из объекта Employee
                Gender gender = selectedEmployee.getGender();

                System.out.println("Gender of employee " + numberEmployee + ": " + gender);

                groupMapGender.put(gender, groupMapGender.getOrDefault(gender, 0) + 1);
            } else {
                if (numberEmployee == 0) {
                    // Выводим статистику по гендерам
                    for (Map.Entry<Gender, Integer> entry : groupMapGender.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                        // Подсчет женщин и мужчин

                        /*int women = 0;
                        for (String name : groupMapGender.keySet()) {
                            if(groupMapGender.get(name).equals("Female")) {
                                women++;
                            }
                        }
                        System.out.println("Women: " + women);*/

                        int women = groupMapGender.getOrDefault(Gender.FEMALE, 0);
                        int men = groupMapGender.getOrDefault(Gender.MAlE, 0);
                        int binary = groupMapGender.getOrDefault(Gender.NON_BINARY, 0);
                        int notSay = groupMapGender.getOrDefault(Gender.PREFER_NOT_TO_SAY, 0);
                        int other = groupMapGender.getOrDefault(Gender.OTHER, 0);

                        System.out.println("Women: " + women);
                        System.out.println("Men: " + men);
                        System.out.println("Non binary: " + binary);
                        System.out.println("Prefer not to say: " + notSay);
                        System.out.println("Other: " + other);
                    }
                    break; // Выходим из цикла
                } else {
                    System.out.println("Invalid employee number");
                }
            }

        }
    }
}

