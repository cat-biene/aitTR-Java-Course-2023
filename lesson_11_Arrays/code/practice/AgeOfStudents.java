package practice;
// Создайте массив, который содержит возраст студентов группы.
// какой возраст максимальный?
//какой возраст минимальный?
// есть ли однокурсники с одинаковым возрастом? Если да, то сколько студентов, у которых одинаковый возраст?

public class AgeOfStudents {

    public static void main(String[] args) {

        int[] ageOfStudents = {30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34, 22, 18};

                // ищем максимальный элемент масива
        int max = ageOfStudents[0]; // первый кандидат на максимум
        int indexMax = 0;


        for (int i = 0; i < ageOfStudents.length; i++) { // когда текущий элемент массива будет больше, чем max
            if(ageOfStudents[i] > max) {
                max = ageOfStudents[i]; // взяли максимальный элемент
                indexMax = i;

            }

        }
        System.out.println(" Max age :" + max);
        System.out.println(" Index of max element : " + indexMax);

        // ищем минимальный элемент масива
        int min = ageOfStudents[0]; // первый кандидат на минимум
        int indexMin = 0;

        for (int i = 0; i < ageOfStudents.length; i++) { // когда текущий элемент массива будет меньше, чем min
            if (ageOfStudents[i] < min) {
                min = ageOfStudents[i]; // взяли минимальный элемент
                indexMin = i;

            }

        }

        System.out.println(" Min age :" + min);
        System.out.println(" Index of min element : " + indexMin);

        // ищем дубликаты
        // идем по всем элементам массива, начиная с 0 и для него ищем совпадения
        // ответ выглядит так: есть дубликат, его индекс  ... всего таких дубликатов ...

        int dublicate = ageOfStudents[0]; // кандидат на дубликат
        int dCount = 0; // счетчик дубликата
        int index = 0;

        for (int i = 0; i < ageOfStudents.length; i++) {
            for (int j = i + 1; j < ageOfStudents.length; j++) { // насинаем со следующего элемента
                if(ageOfStudents[i] == ageOfStudents[j]) {
                    dublicate = ageOfStudents[i];
                    dCount++;
                    index = j; //

                    System.out.println(" Dublicat : " + dublicate + " index " + index);
                    System.out.println(" Quality of dublicat :" + dCount);

                }
                
            }
            
        }


    }

}
