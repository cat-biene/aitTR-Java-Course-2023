package homework.prime;
// Для метода проверки, является ли число простым, написать тест.
// Использовать assert для логических выражений.
public class PrimeNumbers {

    // method prime number
    public boolean isPrime (int number) { // метод возвращает два значения, простое или нет
        if(number <= 1) { // проверяе число больше 0 и 1
            return false;// если условие не выполняеться возвращаем false
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // цикл, начинается с числа 2 и продолжаеться пока i меньше или равно корню из number
            if(number % i == 0) { // проверяем: делиться число на текущее значение i без остатка
                return false; // если условие выполняеться возвращаем false
            }
        }
        return true; // если не одно условие в цикле не сработало возвращаем true
    }
}
