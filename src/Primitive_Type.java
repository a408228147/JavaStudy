import com.sun.glass.ui.Size;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/29.
 */

public class Primitive_Type {
    public static void main(String[] args) throws IOException {
    /*   一共有8种数据类型   4种整形  int 4 short 2 long 8 byte 1
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
       /* Scanner in = new Scanner(Paths.get("E:\\123.txt"),"utf-8");*/

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
//foreach
     /*   Set<preson> set=new HashSet<preson>();	// 无序 数据不可以重复 因为有两个方法 equals 和hashcode
        preson p1=new preson("feige",10);
        preson p2=new preson("feige",10);
        preson p3=new preson("请问",20);
        preson p4=new preson("马哥",25);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for(Iterator<preson> it =set.iterator();it.hasNext();)//遍历迭代 取出值 iterator:迭代器
        {

            preson p=it.next();
            System.out.println(p+"           "+"00000000");//没有过滤重复的值 要重写hashcode
        }
        System.out.println("---------");


        List<preson> set1=new ArrayList<preson>();//有序  可以重复
        preson p11=new preson("feige",10);
        preson p21=new preson("feige",10);
        preson p31=new preson("请问",20);
        preson p41=new preson("马哥",25);
        set1.add(p11);
        set1.add(p21);
        set1.add(p31);
        set1.add(p41);

        Iterator <preson> it1=set1.iterator();
        while(it1.hasNext()){
            preson p=it1.next();
            System.out.println(p+"           "+"11111");
        }
        System.out.println("--------------");
        for(preson i:set){
            System.out.println(i+"           "+"2222");
        }
        System.out.println("---------");
        for(preson j:set1){
            System.out.println(j+"           "+"33333333");

        }

        HashMap<Integer,String> map = new HashMap<Integer, String>();//不用重写 hashcode equals 就会自动过滤重复的值
        map.put(1, "value1");
        map.put(2, "value2");
        map.put(1, "value1");
        map.put(3, "value3");
        System.out.println(map.containsKey(4));
        System.out.println(map.size());//键值不同的个数
        System.out.println(map.isEmpty());//如果为空 就为 true 如果不为空 就是 flase
        HashMap Map=d.op();

        for(Map.Entry<Integer, String> me:map.entrySet())
        {
            System.out.println(me.getValue()+me.getKey());
        }
  <%=me.getValue()%>

        for(Integer a: map.keySet())
        {

            System.out.println(a+"map"+map.get(a));
        }
<%=map.get(a)%>


                Set<Integer> keyset=map.keySet();

        for(Integer i:keyset){
            System.out.println(i+"--"+map.get(i));

        }*/









    }
    //定义枚举
    enum Size{SMALL,MEDIUM};
}




