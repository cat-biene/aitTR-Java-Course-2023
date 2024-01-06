package consultation;

public class Pound {
      // 1 английский фут равен 0,3048 метра. Напишите метод, который принимает на вход значение длины в футах, а возвращает в метрах.

    public static void main(String[] args) {
        double pound = 1;
        double meter = convertPoundToMeter(pound);
        System.out.println(pound + " pound = " + meter + " meter ");

    }

    public static double convertPoundToMeter(double p) {
        double exchangeLength = 0.3048;
        double meter = p * exchangeLength;
        return meter;

    }

}
