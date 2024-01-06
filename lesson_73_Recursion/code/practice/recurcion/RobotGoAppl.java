package practice.recurcion;

public class RobotGoAppl {

    // make a method that emulates a walking robot
    // На каждом шагу робот сообщает, что он делает шаг и должен проходить n шагов, затем стоп
    public static void main(String[] args) {
        int steps = 10;
        int count = 0;
        moreForward(steps, count);
        System.out.println("Mission complete!");
    }

    private static void moreForward(int steps, int count) {

        if(steps > 0) {
            count++;
            System.out.println("Robot make " + count +" step, left " + (steps - 1) + " step.");
            moreForward(steps - 1, count);
        }


    }
}
