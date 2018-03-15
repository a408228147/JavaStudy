package Stack;

public class My_Stack_Arraylist1 {
    //栈的代码实现 数组栈
    //优点：入栈和出栈速度快，缺点：长度有限
    private int top = -1;
    private Object[] objs;

    public My_Stack_Arraylist1(int capacity) throws Exception{
        if(capacity < 0)
            throw new Exception("Illegal capacity:"+capacity);
        objs = new Object[capacity];
    }

    public void push(Object obj) throws Exception{
        if(top == objs.length - 1)
            throw new Exception("Stack is full!");
        objs[++top] = obj;
    }

    public Object pop() throws Exception{
        if(top == -1)
            throw new Exception("Stack is empty!");
        return objs[top--];
    }
//打印栈
    public void dispaly(){
        System.out.print("bottom -> top: | ");
        for(int i = 0 ; i <= top ; i++){
            System.out.print(objs[i]+" | ");
        }
        System.out.print("\n");
    }

    public void peek(){
        System.out.println(objs[top]);
    }

    public static void main(String[] args) throws Exception{
        My_Stack_Arraylist1 s = new My_Stack_Arraylist1(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.dispaly();
        s.pop();
        s.dispaly();
        s.peek();
       // Systems.out.println(s.pop());
/*        s.dispaly();
        s.push(99);
        s.dispaly();
        s.push(99);*/
    }
}
