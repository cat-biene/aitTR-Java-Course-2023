package homework;
// Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов:
// byte, short, char, int, long, float, double
// Типы как объекты String должны браться из аргументов основной функции main.
// Если в аргументах нет какого-либо типа,
// приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
// Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

public class HomApplExampale {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("All Min and Max");
            System.out.println("Byte.MAX_VALUE");
            System.out.println("Byte.MIN_VALUE");
            System.out.println("Integer.MAX_VALUE");
            System.out.println("Integer.MIN_VALUE");
            System.out.println("Short.MAX_VALUE");
            System.out.println("Short.MIN_VALUE");
            System.out.println("Long.MAX_VALUE");
            System.out.println("Long.MIN_VALUE");
            System.out.println("Character.MAX_VALUE");
            System.out.println("Character.MIN_VALUE");
            System.out.println("Float.MAX_VALUE");
            System.out.println("Float.MIN_VALUE");
            System.out.println("Double.MAX_VALUE");
            System.out.println("Double.MIN_VALUE");


        }

        for (int i = 0; i < args.length; i++) {
            double maxSize = 0;
            double minSize = 0;

          switch (args[i]) {
              case "byte": {
                  maxSize = Byte.MAX_VALUE;
                  minSize = Byte.MIN_VALUE;
                  break;
              }
              case "int": {
                  maxSize = Integer.MAX_VALUE;
                  minSize = Integer.MIN_VALUE;
                  break;
              }
              case "short": {
                  maxSize = Short.MAX_VALUE;
                  minSize = Short.MIN_VALUE;
                  break;
              }
              case "long": {
                  maxSize = Long.MAX_VALUE;
                  minSize = Long.MIN_VALUE;
                  break;
              }
              case "char": {
                  maxSize = Character.MAX_VALUE;
                  minSize = Character.MIN_VALUE;
                  break;
              }
              case "float": {
                  maxSize = Float.MAX_VALUE;
                  minSize = Float.MIN_VALUE;
                  break;
              }
              case "double": {
                  maxSize = Double.MAX_VALUE;
                  minSize = Double.MIN_VALUE;
                  break;
              }
              default:
                  System.out.println("Wrong input!");
          }
            System.out.println(" Type: " + args[i] + " max value: " + maxSize + " min value: " + minSize);
        }
           /* if ("byte".equals(i)) {
                byte maxSize = Byte.MAX_VALUE;
                byte minSize = Byte.MIN_VALUE;
                System.out.println("min value = " + minSize + "max value = " + maxSize);
            }
        }

        for (int i = 0; i < args.length; i++) {
            if ("double".equals(i)) {
                byte maxSize = Double.MAX_VALUE;
                byte minSize = Double.MIN_VALUE;
                System.out.println("min value = " + minSize + "max value = " + maxSize);
            }
        }*/
    }
}
