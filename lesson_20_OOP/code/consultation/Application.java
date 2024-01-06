import consultation.Suv;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Application {

    public static void main(String[] args) {
        Suv[] suv = new Suv[3];
        suv[0] = new Suv("1", "Black", 250);
        suv[1] = new Suv("2", "White", 350);
        suv[2] = new Suv("3", "Silber", 270);

        int maxElementByPowerIndex = findMaxPowerSuv(suv);

        System.out.println("Winner SUV " + suv[maxElementByPowerIndex].getModel());
    }

    /**
     * Метод должен найти индекс самой мощной машины из массива машин
     */
    public static int findMaxPowerSuv(Suv[] source) {

        int maxElementIndex = 0;
        Suv maxElement = source[maxElementIndex];
        int index = 0; // бывший i

        while (index < source.length) {
            Suv currentValue = source[index];
            if (currentValue.getPower() > maxElement.getPower()) {
                maxElement = currentValue;
                maxElementIndex = index;
            }
            index++;
        }

        return maxElementIndex;
    }
}

