package Queue;

import org.omg.CORBA.INTERNAL;

public class test
{
    public static void main(String[] args) {
        My_Queue mq = new My_Queue(10);
        mq.add(10);
        mq.add(9);
        mq.add(8);
        mq.add(7);
        mq.add(6);
        mq.add(5);
        mq.add(4);
        mq.add(3);
        mq.add(2);
        mq.add(1);
     /*   System.out.println(mq.length());
        mq.poll();
        System.out.println(mq.length());*/
        Link_Queue lq =new Link_Queue();
        lq.add(10);
        lq.add(9);
        lq.add(8);
        lq.add(7);
        lq.add(6);
      /*  System.out.println(lq.length());
        System.out.println(lq.peek());
        lq.poll();
        lq.add(5);
        System.out.println(lq.peek());*/
  Loop_Queue<Integer> loop_queue = new Loop_Queue<Integer>();
        loop_queue.add(10);
        loop_queue.add(9);
        loop_queue.add(8);
        loop_queue.add(7);
        loop_queue.add(6);
        /*System.out.println(loop_queue.peek());*/
        Linklist_Queue<Integer> linklist_queue = new Linklist_Queue<Integer>();
        linklist_queue.add(10);
        linklist_queue.add(9);
        linklist_queue.add(8);
        linklist_queue.add(7);
        linklist_queue.add(6);
        linklist_queue.poll();
        linklist_queue.add(5);
        System.out.println(loop_queue.peek());
    }
}
