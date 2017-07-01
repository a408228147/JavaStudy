import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by Administrator on 2017/7/1.
 */
//javase 8  LocalDate的运用
public  class oop_CLASS {
    public static void date(){
        System.out.println(LocalDate.now());
        LocalDate.now().plusDays(1000);//1000天后的时间
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


