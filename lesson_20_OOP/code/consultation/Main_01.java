package consultation;

/**
 * @author Andrej Reutow
 * created on 02.10.2023
 */
public class Main_01 {
    public static void main(String[] args) {
        Auto autoTT = new Auto("TT", "Silber");
        Auto autoPolo = new Auto("Polo", "Black");

//        Auto[] autos = {autoTT, autoTT};
//        Auto[] autos = {new Auto("TT", "Silber"), new Auto("Polo", "Black")};
        Auto[] autos = new Auto[2];
        autos[0] = autoTT;
        autos[1] = new Auto("Polo", "Black");

        autoPolo.setColor("Red");

        Auto autoFromIndex1 = autos[1];
        autoFromIndex1.setColor("White");


        System.out.println();
    }
}
