package DataStrcuture_Arithmetic;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/7/9.
 */
public class Test {
    public  static void main(String[] args ){

/*
new Test().numMax();

new Test().numMax2();
*/

/*
new Test().insertArr();
*/

        Memorycell<Integer> mc = new Memorycell<Integer>();
        /*mc.write("37");
        String val = (String) mc.read();
        System.out.println(val);*/


        /*任何一种引用类型都和Object 相容 ，但java的8种基本类型不相容
        java为8种基本类型都提供了一个包装类，例如 int类型的包装类是Integer*/
        mc.write(37);
        Integer mval = (Integer) mc.read();
        int val = mval.intValue();

        //如果一个Integer的对象被放到需要int型量的地方，则编译器将插入一个对intValue方法的调用。叫做自动拆箱。
        System.out.println(val);


     int ma = (Integer) mc.read();
     //一个int型被传递到需要一个Integer对象的地方，编译器会插入一个对Integer构造方法valueOf的调用。叫做自动装箱

    }


    public void numMax(){
  //冒泡排序法  N个数中选择其中k最大者
      int[] a = {3,4,5,1,34,43,32,35,76,42,54,31,11};
        //Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        for (int i = 1;i<a.length;i++)
        {
            for (int j = 0 ; j<i;j++)
            {
               if (a[i]>a[j])
               {
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[3]);
    }

    public void numMax2()
    {
        int[] a = {3,4,5,1,34,43,32,35,76,42,54,31,11};
        //取前k个排序
        int[] b = Arrays.copyOf(a,4);
    for (int i = 1 ;i<b.length ; i++)
    {
        for(int j = 0 ; j<i;j++)
        {
            if (b[i]>b[j])
            {
            int temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            }
        }
    }
        System.out.println(Arrays.toString(b));

    for (int i = 4 ; i<a.length;i++)
    {
       if (b[b.length-1]<a[i])
       {
           for (int j = 0 ; j<b.length;j++)
           {
              if (a[i]>b[j])
              {
                  int temp=b[j];
                  b[j]=a[i];
                  for (int z = j+1 , x = j ;z<b.length;z++)
                  {
                      b[z] = b[x++];
                  }
              }
           }
       }

    }
        System.out.println(Arrays.toString(b));
        System.out.println(b[3]);
    }

    public void insertArr(){
        ArrayList list = new ArrayList();
       int a[] = {1,2,3,4,6,7,8,9,0};
        for ( int b:a
             ) {
            list.add(b);
        }
//在3和4之间插入5,也就是在下标---------n后面添加一个数
        /*
        * 思路：
1.已知要插入的位置的下标
2.将数组扩大一位，从要插入的位置开始都向后移一位
3.思考：如果从前面开始向后移，就需要重新建立一个数组，这样比较浪费资源
         所以不妨从末尾开始移位
        * */
        for (int i = a.length-2; i>3;i--){
            System.out.println(i);
            System.out.println(a[i]+"=====");

            a[i+1] = a[i];
        }
        a[4] = 5;
        for (int b:a
             ) {
            System.out.println(b);
        }

        //list自带插入某位置其余向后移
     /*   list.add(4,5);//往要插入的位置插入数字
list.remove(4);*/
        /*for (Object b:list
             ) {
            System.out.println(b);
        }*/

        //删除数字5
for (int i = 4;i < a.length-1;i++)
    a[i]=a[i+1];
a[a.length-1]=0;
        for (int d:a
             ) {
            System.out.println(d);
        }


    }
    //通过Object超类来实现  泛型类
    public static class   Memorycell<Integer>{
        public  Object read(){
            return  storeValue;
        }
        public void  write (Object x){
            storeValue = x;
        }
        private Object storeValue;
    }





}
