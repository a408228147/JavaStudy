package My_List;

import javax.xml.soap.Node;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void  main(String [] args){


        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        for (Object a:list
             ) {
            System.out.println(a);
        }
        list.remove(0);
        list.add(1);
        System.out.println(list.set(0,2));
        Iterator<MyArrayList> o =list.iterator();
        while (o.hasNext())
        {
            System.out.println(o.next());
        }
/*
       MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.add(222);
        System.out.println(myLinkedList.size());
*/

/*BinarySearchTree bs = new BinarySearchTree();
        bs.insert(6);
bs.insert(2);
bs.insert(8);
bs.insert(1);
bs.insert(5);
bs.insert(3);
bs.insert(4);*/

/*bs.remove(2);

bs.printFree();*/

/*
bs.as();
bs.printFree();*/
    }



}
