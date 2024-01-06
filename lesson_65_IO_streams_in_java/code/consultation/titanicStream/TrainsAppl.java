package consultation.titanicStream;

import consultation.titanicStream.CsvModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainsAppl {

    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("lesson_65_IO_streams_in_java/code/homework/train.csv"))) {
            String str = bufferedReader.readLine();
            String[] cells = str.split(",");
            printCells(cells);

            List<CsvModel> list = new ArrayList<>();
            int counter = 0;
            str = bufferedReader.readLine();

            while (str != null) {
                counter++;
                cells = str.split(",");
                double fare = Double.parseDouble(cells[10]);
                boolean isSurvived = cells[1].equals("1");
                int pclass = Integer.parseInt(cells[2]);
                boolean isFemale = cells[5].equals("female");
                double age = cells[6].length() == 0 ? 19 : Double.parseDouble(cells[6]);
                list.add(new CsvModel(fare, pclass, isSurvived, isFemale, age));
                str = bufferedReader.readLine();
                printCells(cells);

            }
            double totalSum = list.stream()
                    .mapToDouble(n -> n.getFare())
                    .sum();
            System.out.println("Sum of fare: " + totalSum);

            double avgFirstFare = list.stream()
                    .filter(f -> f.getpClass() == 1)
                    .mapToDouble(CsvModel::getFare)
                    .average()
                    .orElse(0);

            System.out.println("Average price of 1 class: " + avgFirstFare);


            double avgSecondClass = list.stream()
                    .filter(f -> f.getpClass() == 2)
                    .mapToDouble(CsvModel::getFare)
                    .average()
                    .orElse(0);

            System.out.println("Average price of 2 class: " + avgSecondClass);

            double avgThirdClass = list.stream()
                    .filter(f -> f.getpClass() == 3)
                    .mapToDouble(CsvModel::getFare)
                    .average()
                    .orElse(0);

            System.out.println("Average price of 3 class: " + avgThirdClass);

            int countSurvived = list.stream()
                    .filter(CsvModel::isSurvived)
                    .collect(Collectors.toList())
                    .size();

            System.out.println("Survived: " + countSurvived);
            System.out.println("Deaths: " + (list.size() - countSurvived));

            long sumSurvivedMale = list.stream()
                    .filter(s -> s.isSurvived && !s.isFemale && s.getAge() >= 18)
                    .count();

            System.out.println("Survived males: " + sumSurvivedMale);

            long sumSurvivedFemale = list.stream()
                    .filter(s -> s.isSurvived && s.isFemale && s.getAge() >= 18)
                    .count();

            System.out.println("Survived females: " + sumSurvivedFemale);

            long sumSurvivedChildren = list.stream()
                    .filter(s -> s.isSurvived && s.getAge() < 18)
                    .count();

            System.out.println("Survived children: " + sumSurvivedChildren);

            long sumDeathMale = list.stream()
                    .filter(s -> !s.isSurvived && !s.isFemale && s.getAge() >= 18)
                    .count();

            System.out.println("Deaths males: " + sumDeathMale);

            long sumDeathFemale = list.stream()
                    .filter(s -> !s.isSurvived && s.isFemale && s.getAge() >= 18)
                    .count();

            System.out.println("Deaths females: " + sumDeathFemale);

            long sumDeathChild = list.stream()
                    .filter(s -> !s.isSurvived && s.getAge() < 18)
                    .count();

            System.out.println("Deaths children: " + sumDeathChild);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printCells(String[] cells) {
        for (String cell : cells) {
            System.out.print(cell + "\t");
        }
        System.out.println();
    }
}

