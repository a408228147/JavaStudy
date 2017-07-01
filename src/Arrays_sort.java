import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/1.
 */
//数组的存取排序操作
public class Arrays_sort {
    public static void main (String [] args){
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
     array();
    }
public static void array(){

    int [] lucknumber = {1,2,3,4,5,6,7,8,9};
    int [] copiedlucknumber = Arrays.copyOf(lucknumber,lucknumber.length);//复制数组

        Arrays.toString(lucknumber);//返回包含数组中的全部元素，被放在括号内，并用逗号分隔
    int a[] = Arrays.copyOf(lucknumber , 4);//复制数组长度为4
            Arrays.copyOfRange(lucknumber,1,3);//复制数组从下标1-3
Arrays.binarySearch(lucknumber,3);//二分搜索算法查找值3，找到返回该值得下标，否则返回负数

}



}
