import java.io.NotActiveException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class test {

public static  void main (String[] args){
/*int i=2;
    if (i==1){
    return;//return ;  停止当前该方法运行
}
    for (int j=2;j<6;j++){
        System.out.println("12312321");
        return;//停止程序运行
    }
    System.out.println("123");*/
/*new test().test("abc");*/
        //折半查找
/*Integer [] a ={1,2,3,4,5,6,7,8,9,10};

    System.out.println(binarySreach(a,10));*/
    /*System.out.println(gcd(1989,1590));*/

    Collection<Integer>  a;
    a = new ArrayList();
    a.add(2);
    a.add(2);
    a.add(2);
    a.add(2);
    a.add(2);
    te(a);
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(1);
tes(list);
}

public void test(String str){
   char [] list =new char[3] ;
   for (int i= 0 ; i<str.length();i++) {
       list[i]=str.charAt(i);
   }
    test(list,0,str.length());



}
public void test(char [] str ,int low ,int high){
 if (low==high-1){
     System.out.println("for11111-------low="+low);
for (int i = 0;i<str.length;i++) {
    System.out.println("for111-----i="+i);
    System.out.print(str[i]);
}    System.out.println();
return ;
 }
 for (int i = low;i<high;i++){
     System.out.println("for2222-----i="+i);
     System.out.println("for22222---low="+low);
     char temp = str[low];
     str[low] = str[i];
     str[i] = temp;
     test(str,low+1,high);
     System.out.println("--------------"+i+"-----------");
     System.out.println("---------"+low+"--------");
     temp = str[low];
     str[low] = str[i];
     str[i] = temp;
     System.out.println("endend"+i+"endend");
 }
int [] a={2,3,4};
int ms = 0;
/*for (int i= 0; i<a.length;i++)
  for (int j = i;j<a.length;j++) {
     int  TS = 0;
      for (int k = i;k<=j;k++)
          TS+=a[k];
      if(TS>ms)
          ms = TS;
  }
    System.out.println(ms);*/
  for (int i =0; i<a.length;i++) {
      int TS = 0;
      for (int j = i;j<a.length;j++)
      {
          TS += a[j];
          if (TS>ms)
              ms = TS;
      }

  }
    System.out.println(ms);

}


public  static  <Integer extends  Comparable<? super  Integer>> int binarySreach(Integer[] a , Integer x){

    int low = 0, high = a.length-1, i =0;
    while (low <= high)
    {i++;
        int mid = (low + high)/2;

        if (a[mid].compareTo(x)<0)
            low = mid + 1;
      else if (a[mid].compareTo(x)>0)
           high = mid-1;
       else
        {
            System.out.println(low+"+"+high);
            System.out.println(i);
            return mid;

        }
    }



        return -1;
}



//欧西里的算法 求解两个整数的最大公因数
    /**/

    public static long  gcd (long m ,long n)
    {

        while(n!=0)
        {
            long rem = m%n;
            long r = m/n;
            System.out.println(r);
            System.out.println(rem);
            m = n;
            n = rem;
        }
return m;
    }


    public static long pow(long x , int n){
   if (n==1)
  return  x;
   if (n==0)
       return 1;
   if (n%2==0){
    return   pow(x*x,n/2);
   }else
   return   pow(x*x,n/2)*x;
//return  pow ( x*x, n-1)*x;
    }

public static void te(Collection<Integer> coll){
        Iterator<Integer> itr =  coll.iterator();
        while (itr.hasNext())
        {
            int a = itr.next();
            itr.remove();
          //  itr.remove();
        }

    for (Integer b:coll
         ) {
        coll.remove(b);
    }

}

//通过集合List 在遍历时不允许对数组进行操作  运行出错
public  static  void tes(List<Integer> list){
    for (Integer x:list)
    {
        list.remove(x);
    }

}

}
