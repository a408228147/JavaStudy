package abstractClasses;

/**
 * Created by Administrator on 2017/7/4.
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        //pass n to superclass constructor
        super(name);
        this.major = major;
    }

    public String getDescription()
    {
        return "a student major in"+major;
    }
}
