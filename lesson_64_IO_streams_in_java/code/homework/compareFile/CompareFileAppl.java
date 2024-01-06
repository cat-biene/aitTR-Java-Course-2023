package homework.compareFile;
//  In the CompareFileAppl class,
//  implement the logic for comparing two files in the main method.
//  File names are accepted through the args array. We consider two files to be identical,
//  if they have the same length and the same bytes are in the same positions.
//  The result should be printed to the console as a message

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
// Имена файлов принимать через массив args.
// Два файла считаем одинаковыми, если у них одинаковая длина,
// и на тех же позициях стоят те же байты.
// Результат должен быть выведен на консоль в виде сообщения.
public class CompareFileAppl {

    public static void main(String[] args) {

        if(args.length != 2) { // если не 2 аргумента
            System.out.println("Wrong number of argument."); // сообщаем, что неправильное количество аргументов
            return; // выходим из программы
        }

        System.out.println("Comparing files: " + args[0] + " and " + args[1]); // сообщаем, что сравниваем два файла, которые указаны в аргументах

        try (FileInputStream file1 = new FileInputStream(args[0]); // открываем FileInputStream объекта для первого файла
             FileInputStream file2 = new FileInputStream(args[1])) { // открываем FileInputStream объекта для второго файла

            int byte1; // переменная для хранения байтов, считанных з первого файла
            int byte2;// переменная для хранения байтов, считанных з второго файла
            boolean filesEqual = true; // Два файла считаем одинаковыми

            while ((byte1 = file1.read()) != -1 && (byte2 = file2.read()) != -1) {
                // Вводит цикл, который считывает байты из обоих файлов, пока есть байты для чтения ( != -1указывает на достижение конца файла).
                if (byte1 != byte2) { // если не равны
                    filesEqual = false; // объявляем false
                    break; // выходим из цикла
                }
            }

            // Проверяет, считаются ли файлы идентичными на основе сравнения длины и байтов. Печатает соответствующее сообщение.
            //Джава
            if (filesEqual && file1.read() == -1 && file2.read() == -1) {
                System.out.println("Files are identical.");
            } else {
                System.out.println("Files are different.");
            }

            // Обрабатывает исключения, которые могут возникнуть во время файловых операций, например FileNotFoundExceptionи IOException. При необходимости печатает сообщения об ошибках.
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
