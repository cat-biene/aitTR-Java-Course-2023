package practice;

public class Circus {
    public static void main(String[] args){
        lightOn();
        enterteiner();
        lightOff();
    }
    public static void lightOn(){
        System.out.println("Light on!");
    }
    public static void enterteiner(){
        jogger();
        singer();
        cloun();
    }
    public static void lightOff() {
        System.out.println("Light off!");
    }
    public static void jogger(){
        System.out.println("My name is John");
        System.out.println("I'm jogging!");
    }

    public static void singer(){
        System.out.println("My name is Phillip");
        System.out.println("I'm singing!");
    }
    public static void cloun(){
        System.out.println("My name is Oleg Popov");
        System.out.println("I'm joking!");
    }

}
