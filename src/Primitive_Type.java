import com.sun.glass.ui.Size;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/29.
 */

public class Primitive_Type {
    public static void main(String[] args) throws IOException {
    /*   一共有8种数据类型   4种整形  int 4 short long 8 byte 1
    2种浮点型  float 4  double 8
    1种由Unicode编码的字符单元类型char 1种 表示真值的boolean类型 */
/*int a = 1_000_00;//java 7 以上  易读
    int b = 0b1001;//0b 可以写二进制
    System.out.println(a);//a=100000
    System.out.println(b);//9
    System.out.println(2.0-1.1);*/


        //字符串 substring 取字符串中的子串
        //比较字符串   一定不要使用==运算检测两个字符串是否相等，== 只能判断两个字符串是否在同一个位置
        // 只有字符串常量才能被共享，+和substring等操作的不被共享
     /*   String greeting = "hello";
        if (greeting == "hello") {
            System.out.println("true");
        }
        if (!(greeting.substring(0, 3) == "hel")) {
            System.out.println("false");
        }*/
        //遍历字符串
        String cp = "hello";
        int[] codePoints = cp.codePoints().toArray();
        for (int i = 0; i < codePoints.length; i++) {
            System.out.println((char) codePoints[i]);
        }
      /*  String cp = "hello";
       for (int i=0;i<cp.length();i++) {
       char p=cp.charAt(i);
           System.out.println(p);
       }*/
    /* StringBuilder */
     /*   StringBuilder builder = new StringBuilder();//构建一个空的字符串构建器
    builder.append("hello");
    builder.append("world");//追加字符串  会返回this
        System.out.println(builder);
    String completeString = builder.toString(); //返回一个与构建器或缓冲器内容相同的字符串
        System.out.println(builder.length());//返回代码单元数量
    builder.setCharAt(1,'t');//将第i个代码单元设置为c
        completeString = builder.toString();
        System.out.println(completeString);
        builder.insert(2,2);//在第二个位置插入内容
        System.out.println(builder);
     builder.delete(2,4);//删除之间的代码单元
        System.out.println(builder);*/

        System.out.printf("%tT",new Date());
        System.out.printf("%s %tB %<te, %<tY" ,"date" ,new Date());
        Scanner in = new Scanner(Paths.get("E:\\123.txt"),"utf-8");

        int k;
        {  //int k; java不允许嵌套块重定义一个变量
        int s;}
//判断
        st: switch (5){
          case 5:  switch (4) {
                case 4: break st;//可以指定跳出某一个
            }
        }
        //从 javase 7 开始case标签可以是字符串
        String input="zq";
        switch (input.toLowerCase()){
            case "yes":
                System.out.println("yes");break;
            case "zq":
                System.out.println("zq");break;
        }

        s: while(true){
            while(true){
                break s;
            }
        }
        //枚举
Size s=Size.SMALL;
switch (s){
    case SMALL:
        System.out.println("small");break;
    case MEDIUM:
        System.out.println("medium");break;
}
    }
    //定义枚举
    enum Size{SMALL,MEDIUM};
}




