/**
 * Created by Administrator on 2017/7/1.
 */
/*public class ParamTest {
    public static void main(String[] args){
        *//*
        * Test1: Methods can't modify numeric parameters
         *//*
        System.out.println("Testing triplevalue:");
        double percent = 10;
        System.out.println("before:percent="+percent);
        triplevalue(percent);
        System.out.println("after:perent="+percent);

        *//*
        * Test2: Methods can change the state of object parameters
        *//*
        System.out.println("\nTesting triplevalue");
        Employee harry = new Employee("Harry",50000);
        System.out.println("before: salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("after:salary="+harry.getSalary());

        *//*
        * Test3: Methods can't attach new object to object parameters
        *//*
        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice",5000);
        Employee b = new Employee("Bob",10000);
        System.out.println("before:a="+a.getName());
        System.out.println("before:b="+b.getName());
        swap(a,b);
        System.out.println("after:a="+a.getName());
        System.out.println("after:b="+b.getName());
    }
    public static void triplevalue(double x)
    {
        x = 3*x;
        System.out.println("End of method :x="+x);
    }

    public static void tripleSalary (Employee x )
    {
         x.raiseSalary(200);
        System.out.println("End of method salary="+x.getSalary());
    }

    public static void swap(Employee x ,Employee y)
    {
        Employee temp = x;
        x = y;
        y= temp;
        System.out.println("End of method x="+x.getName());
        System.out.println("End of method x="+y.getName());
    }
}*/
