package abstractClasses;

/**
 * Created by Administrator on 2017/7/4.
 */
public abstract class Person
{
    public abstract String getDescription();
    private String name;

    public Person(String name)
    {
        this.name  = name;
    }

    public String getName()
    {
        return name;
    }
}
