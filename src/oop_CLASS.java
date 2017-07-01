import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by Administrator on 2017/7/1.
 */
//javase 8  LocalDate的运用
public  class oop_CLASS {
    public static void date(){
        System.out.println(LocalDate.now());
        LocalDate.now().plusDays(1000);//1000天后的日期
         LocalTime localTime =  LocalTime.now();//时间
    }
    public static void  CalendarTest(){
        LocalDate date = LocalDate.now();//
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);//set to start of month
        DayOfWeek weeekday = date.getDayOfWeek();
        int value = weeekday.getValue();// 1 = monday ,....7=sunday
        System.out.println("Mon Tue wed Thu Fri Sat Sun");
        for (int i = 1; i<value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
    }

    class Employee
    {
        private static int nextId = 1;

        private  String name;
        private double salary;
        private int id;

        public Employee(String n,double s)
        {
            name = n;
            salary = s;
            id = 0;
        }
        public String getName()
        {
            return name;
        }
        public  double getSalary()
        {
            return salary;
        }
        public int getId()
        {
        return id;
        }
        public void setId()
        {
            id = nextId;
            nextId++;
        }

        public static  int getNextId()
        {
            return nextId;
        }

        public static void main(String[] args )
        {
            Employee e = new Employee("Harry",5000);
            System.out.println(e.getName()+""+e.getSalary());
        }
     public void raiseSalary (double bypercent)
     {
         double raise = salary* bypercent /100;
         salary += raise;

     }
    }

