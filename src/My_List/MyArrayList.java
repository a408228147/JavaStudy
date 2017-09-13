package My_List;

//优点：get set 花费常数时间 缺点 插入和删除代价昂贵
public class MyArrayList <AnyTyoe> implements Iterable<AnyTyoe> {


    /*   定义了三个全局变量
    theSize 数组的长度
    AnyType    theItems    任意类型的数组
    DEFAULT_CAPACITY    初始化建立一个MyArrayList数组的长度
    */
    private int theSize;
    private AnyTyoe [] theItems;
    private static  final  int  DEFAULT_CAPACITY = 10;


    //  调用方法   MyArrayList  list = new MyArrayList()
public MyArrayList(){
    clear();//调用方法
}


//建立数组 并初始化数组长度
public void clear(){
    theSize = 0;
    ensureCapacity(DEFAULT_CAPACITY);
}

//返回数组长度
public int size(){
    return  theSize;
}

//判断数组是否为空
public boolean isEmpty(){
    return theSize==0;
}

//除去没有储存完剩余的数组
public void trimToSize(){
    ensureCapacity(theSize);
}

//获取指定位置的数组储存的值
public  AnyTyoe get(int idx){
if (idx <0|| idx>size())
    throw  new ArrayIndexOutOfBoundsException();
return theItems[idx];


}
//在指定位置上修改数据
public  AnyTyoe set(int idx ,AnyTyoe newVal)
{
    if (idx< 0 || idx >=size())
        throw new ArrayIndexOutOfBoundsException();
    AnyTyoe old =  theItems[idx];
    theItems[idx] = newVal;
    return old;

}
//初始化数值长度  以及扩大数组
public void ensureCapacity (int newCapacity)
{
    if (newCapacity < theSize)
        return;
    AnyTyoe [] old = theItems;
    theItems = (AnyTyoe[]) new Object[newCapacity];
    for (int i = 0; i<size(); i++)
        theItems[i] = old[i];
}


//在数组末尾添加数据
public boolean add(AnyTyoe x)
{
add(size(),x);
    return true;
}

//在指定位置上插入数据  其后的向后移一位
public void add(int idx , AnyTyoe x)
{
    if (theItems.length == size())
        ensureCapacity(size()*2+1);
    for (int i =theSize; i>idx ;i--)
        theItems[i] =  theItems[i-1];
    theItems[idx] =x;
    theSize++;
}

//删除指定位置的数组数据  其后的向前移一位
public  AnyTyoe remove(int idx)
{
    AnyTyoe removeItem = theItems[idx];
    for (int i = idx ; i<size()-1 ;i++)
        theItems[i] = theItems[i+1];
   theSize--;
    return removeItem;
}


//调用数组遍历
public java.util.Iterator<AnyTyoe> iterator(){
    return new ArrayListIterator();
}

//重写了 Iterator 里面的方法
private  class ArrayListIterator implements java.util.Iterator<AnyTyoe>
{
 private int  current = 0;
    @Override
    //判断下一个是否还是有值
    public boolean hasNext() {

        return current < size();
    }
//获取下一个值
    @Override
    public AnyTyoe next() {

        if (!hasNext())
            throw new java.util.NoSuchElementException();
        return theItems[ current++];
    }

//Iterator里面自带的删除 一次只能删除遍历到的那个数据
    @Override
    public void remove() {
   MyArrayList.this.remove(--current);
    }
}

}
