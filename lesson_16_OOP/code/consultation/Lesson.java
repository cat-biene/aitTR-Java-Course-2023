package consultation;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Lesson {

    private int id;
    private String plan;
    private String theory;
    private String homeWork;
    private String code;

    public Lesson(int id, String plan, String theory, String homeWork, String code) {
        this.id = id;
        this.plan = plan;
        this.theory = theory;
        this.homeWork = homeWork;
        this.code = code;
    }

    public void displayLessonDetails() {
        System.out.println("Id: " + this.id
                + " plan: " + this.plan
                + " theory: " + this.theory
                + " homeWork: " + this.homeWork
                + " code " + this.code);
    }

    public int getId() {
        return this.id;
    }
}
