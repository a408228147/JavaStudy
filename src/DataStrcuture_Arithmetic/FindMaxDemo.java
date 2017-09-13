package DataStrcuture_Arithmetic;

import com.sun.xml.internal.bind.AnyTypeAdapter;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import org.omg.CORBA.Any;

public class FindMaxDemo {
    public static void  main(String[] args){
        Shape[] shi = {new Circle(2.0), new Rectangle(3.0,4.0)};
        Shape [] sh = {new Circle(3.0), new Circle(2.0)};
        String[] str = {"bob","tom","lili","joe"};
        String[] st = {"tom","tom"};
          //System.out.println(findMax(sh));
        //System.out.println(findMax(shi));不能被编译
        System.out.println(findMax(str));
        System.out.println(findMax(st));

    }



    public static Comparable findMax(Comparable[] arr)
    {
        int maxIndex = 0;
        for (int i = 1;i<arr.length;i++)
        {
            if (arr[i].compareTo(arr[maxIndex])>0){
                maxIndex = i;
            }
        }
        return arr [maxIndex];
    }

    public static <AnyTypeAdapter extends  Comparable<? super AnyTypeAdapter>>AnyTypeAdapter findmax1(AnyTypeAdapter[] arr)
    {
        int maxIndex = 0;
        for (int i = 1;i<arr.length;i++)
        {
            if (arr[i].compareTo(arr[maxIndex])>0){
                maxIndex = i;
            }
        }
        return arr [maxIndex];
    }
}
