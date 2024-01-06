package practice;
// Запрограммировать бот, который помогает выбрасывать мусор в баки разных цветов:
// упаковки в желтый бак
// пищевые отходы в коричневый бак
// бумага в зеленый бак
// прочие отходы в черный бак

import java.util.Scanner;

public class Garbage {

    public static void main(String[] args) {

        // ввод мусора - строкой, может быть много значений
        // желтый бак должен - упаковки, пакеты, пластик
        // черный бак должен - отходы, мусор
        // синий бак - бумага

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type of garbage");
        System.out.println("plastic, package, rest, bag, waste, paper, cartoon ");
        String garbage = scanner.next(); // принимаем ответы пользователя

        if (garbage.equals("plastic") | garbage.equals("package") | garbage.equals("bag") ) { // не применяеться для String
            System.out.println(" Put it into '\n' yellow box ");

        } else if(garbage.equals("waste") | garbage.equals("rest")) {
            System.out.println("Put it into black box");
        } else {
            System.out.println("Put it into blue box");
        }

    }

}
