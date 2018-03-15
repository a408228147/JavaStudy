package Stack;

import java.util.Arrays;

public class My_Stack_Arraylist2 {
  // 优点：无长度限制，缺点：入栈慢
    private int top = -1;
    private Object[] objs;

    public My_Stack_Arraylist2() throws Exception{
        this(10);
    }

    public My_Stack_Arraylist2(int capacity) throws Exception{
        if(capacity < 0)
            throw new Exception("Illegal capacity:"+capacity);
        objs = new Object[capacity];
    }

    public void push(Object obj){
        if(top == objs.length - 1){
            this.enlarge();
        }
        objs[++top] = obj;
    }

    public Object pop() throws Exception{
        if(top == -1)
            throw new Exception("Stack is empty!");
        return objs[top--];
    }

    private void enlarge(){
        int num = objs.length/3;
        if(num == 0)
            num = 1;
        objs = Arrays.copyOf(objs, objs.length + num);
    }

    public void dispaly(){
        System.out.print("bottom -> top: | ");
        for(int i = 0 ; i <= top ; i++){
            System.out.print(objs[i]+" | ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) throws Exception{
        My_Stack_Arraylist2 us = new My_Stack_Arraylist2(2);
        us.push(1);
        us.push(2);
        us.dispaly();
        System.out.println(us.pop());
        us.dispaly();
        us.push(99);
        us.dispaly();
        us.push(99);
        us.dispaly();
    }
}
