import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/1.
 */
//数组的存取排序操作
public class Arrays_sort {
    public static void main (String [] args){
        Random d=new Random();
        d.nextInt(50);//随机产生0- n-1的数
        System.out.println(d.nextInt(50));
     /*   Scanner in = new Scanner(System.in);

        System.out.println("How many number  do you need to drow ?");
        int k = in.nextInt();

        System.out.println("what is the highest number you can draw");
        int n = in.nextInt();
        int[] number = new int[n];
        for (int i= 0; i<number.length;i++)
            number[i] = i+1;

        int[] result = new int[k];

        for (int i= 0 ; i<result.length;i++){
            int r = (int)(Math.random()*n);
         result[i] = number[r];
         number[r] = number[n-1];
         n--;
        }
        Arrays.sort(result);
        System.out.println(" Bet the following combination. It'll make you rich!");
        for (int r:result
             ) {
            System.out.println(r);
        }*/
    // array();
        //balances();
//oop_CLASS.CalendarTest();
        //oop_CLASS.date();

        //fill the staff array with three Emplpyee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("tom",40000);
        staff[1] = new Employee("dick",60000);
        staff[2] = new Employee("Harry",60000);
        //print out information about all Employee objects
        for (Employee e:staff
             ) {
            e.setId();
            System.out.println("name:"+e.getName()+",id:"+e.getId()+",salary:"+e.getSalary());
        }
        int n = Employee.getNextId();//call static method
        System.out.println("Next available id="+n);



    }
public static void array(){

    int [] lucknumber = {1,2,3,4,5,6,7,8,9};
    int [] copiedlucknumber = Arrays.copyOf(lucknumber,lucknumber.length);//复制数组
 int [] copylucknumber =  lucknumber.clone();//拷贝数组
        Arrays.toString(lucknumber);//返回包含数组中的全部元素，被放在括号内，并用逗号分隔
    int a[] = Arrays.copyOf(lucknumber , 4);//复制数组长度为4
            Arrays.copyOfRange(lucknumber,1,3);//复制数组从下标1-3
Arrays.binarySearch(lucknumber,3);//二分搜索算法查找值3，找到返回该值得下标，否则返回负数


}
public static  void balances (){
    final double STARTRATE = 10;
    final int NRATES = 6;//6列
    final int NYEARS = 10;
    //set interest rates to 10...15%
    double[] interestRate = new double[NRATES];
    for (int j = 0; j< interestRate.length; j++)
        interestRate[j] = (STARTRATE + j)/100;//汇率列

    double[][] balances = new double[NYEARS][NRATES];//6列10行的二维数组
    //set inital balaces to 10000
    for (int j = 0;j<balances[0].length; j++)//第一行的值都为10000.00
      balances[0][j] = 10000;

    //compute interest for future years
    for (int i= 1; i<balances.length; i++)
    {
        for (int j = 0; j<balances[i].length;j++)
        {
        //get last year's balance from previous row
            double oldBalance = balances[i-1][j];
            //compute interest
          double interest = oldBalance*interestRate[j];
          //compute this year's balance
            balances[i][j] = oldBalance + interest;
        }
        }

        //print one row of interest rates
    for (int j = 0; j< interestRate.length; j++)
        System.out.printf("%9.0f%%",100*interestRate[j]);

    System.out.println();
    // print balance table
    for (double[] row:balances
         ) {
          //print table row
        for (double b: row
             )
            System.out.printf("%10.2f",b);
            System.out.println();

    }
    }

}



