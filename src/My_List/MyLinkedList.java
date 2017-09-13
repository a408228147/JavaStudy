package My_List;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Any;


//优点：插入 和删除开销小 缺点 get很昂贵
import java.util.Iterator;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {
    private int theSize;
    private int modCount = 0;
    private Node<AnyType> beginMaker;
    private Node<AnyType> endMaker;


    private static class Node<AnyType> {
        //  定义节点    节点的建立
        public Node(AnyType d, Node<AnyType> p, Node<AnyType> n) {
            data = d; //该节点的值
            prev = p;//该节点的的上一个节点
            next = n;// 该节点的的下一个节点
        }

        public AnyType data;
        public Node<AnyType> prev;
        public Node<AnyType> next;
    }
//建立双链表的调用
    public MyLinkedList() {
        clear();
    }


    //建立始末节点 并初始化节点
    public void clear() {
        beginMaker = new Node<AnyType>(null, null, null);
        endMaker = new Node<AnyType>(null, beginMaker, null);
        beginMaker.next = endMaker;
        theSize = 0;
        modCount++;

    }

    //双链表的长度
    public int size() {
        return theSize;
    }

    //判断该表是否为空
    public boolean isEmpty() {
        return theSize == 0;
    }

    //往链表中添加一个节点
    public boolean add(AnyType x) {
        add(size(), x);
        return true;
    }

    //往链表中添加一个节点
    public void add(int idx, AnyType x) {
        addBefore(getNode(idx), x);
    }

    //获取该节点的值
    public AnyType get(int idx) {
        return getNode(idx).data;
    }

    //修改某节点的值
    public AnyType set(int idx, AnyType newVal) {
        Node<AnyType> p = getNode(idx);
        AnyType old = p.data;
        p.data = newVal;
        return old;
    }

    //删除该节点的值
    public AnyType remove(int idx) {
        return remove(getNode(idx));
    }

    private void addBefore(Node<AnyType> p, AnyType x) {
        Node<AnyType> newNode = new Node<AnyType>(x, p.prev, p);
        p.prev.next = newNode;
        p.prev = newNode;
        theSize++;
        modCount++;
    }

    //删除该节点的值
    private AnyType remove(Node<AnyType> p) {
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize--;
        modCount++;

        return p.data;
    }
//获得该节点的位置
    private Node<AnyType> getNode(int idx) {
        Node<AnyType> p;
        if (idx < 0 || idx > size())
            throw new IndexOutOfBoundsException();

        if (idx < size() / 2) {
            p = beginMaker.next;
            for (int i = 0; i < idx; i++)
                p = p.next;
        } else {
            p = endMaker    ;
            for (int i = size(); i > idx; i--) {
                p = p.prev;
            }
        }

        return p;
    }

 //whether to include o
    public boolean contains (AnyType o)
    {
        return indexof(o) != -1;
    }

    private int indexof (AnyType o) {

        int index = 0;
        if (o != null) {
            for (Node<AnyType> p = beginMaker; p != null; p = p.next) {
                if (o.equals(p.data))
                    return index;
                index++;
            }
        }else{
            for (Node<AnyType> p = beginMaker; p != null; p = p.next)
            {
                if (p.data == null)
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public Iterator<AnyType> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements java.util.Iterator<AnyType> {

        private Node<AnyType> curremt = beginMaker.next;
        private int expectModCount = modCount;
        //用户判断该节点是否被删  已删为false 未删为true
        private boolean okToRemove = false;


        @Override
        public boolean hasNext() {
            return curremt != endMaker;
        }

        @Override
        public AnyType next() {
            if (modCount != expectModCount)
                throw new java.util.ConcurrentModificationException();
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            AnyType nextItem = curremt.data;
            curremt = curremt.next;
            okToRemove = true;
            return nextItem;
        }

        public void remove() {

            if (modCount != expectModCount)
                throw new java.util.ConcurrentModificationException();
            if (!okToRemove)
                throw new IllegalStateException();
            MyLinkedList.this.remove(curremt.prev);
            okToRemove = false;
            expectModCount++;

        }
    }

}