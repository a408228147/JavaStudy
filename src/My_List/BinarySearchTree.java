package My_List;




import java.nio.BufferUnderflowException;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>>
{
//二叉节点的定义
    static class BinaryNode<AnyType>
    {
        //Constructors
         BinaryNode( AnyType theElement)
        {
            this(theElement,null,null);
        }

       BinaryNode(AnyType theElement , BinaryNode<AnyType> lt, BinaryNode<AnyType> rt)
        {
            element = theElement; left = lt; right = rt ;
        }
           AnyType element;//该节点的值
           BinaryNode<AnyType> left;//该节点的左儿子
           BinaryNode<AnyType> right;//该节点的右儿子
    }

    private BinaryNode<AnyType> root;//二叉树


    //建立二叉树  BinarySearchTree bs = new BinarySearchTree();
    public BinarySearchTree()
    {
        root = null;
    }

    //清空二叉树
    public void makeEmpty()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    //是否存在该值
    public boolean contains(AnyType x)
    {
        return contains(x,root);
    }


    //寻找二叉树中最小值
    public  AnyType findMin()
    {
        if (isEmpty())
            throw  new BufferUnderflowException();
    return findMin(root).element;
    }

    //寻找二叉树中最大值
    public AnyType findMax()
    {
        if (isEmpty())
            throw  new BufferUnderflowException();
        return findMax(root).element;
    }


    //往二叉树中添加一个值
    public void insert(AnyType x)
    {
        root = insert(x,root);
    }

    //删除一个值
    public void remove(AnyType x)
    {
        root = remove(x,root);
    }

    //遍历二叉树
    public void printFree()
    {
  if ( isEmpty())
      System.out.println("Empty tree");
  else
      printFree(root);
    }

    public boolean contains(AnyType x ,BinaryNode<AnyType> t)
    {
        if (t == null)
            return false;
        int compareResult = x.compareTo(t.element);
        if(compareResult < 0)
            return contains(x,t.left);
        else if (compareResult > 0)
            return contains(x ,t.right);
        else
            return true;
    }

    public BinaryNode<AnyType>  findMin(BinaryNode<AnyType> t)
    {
        if (t == null)
            return null;
        else if ( t.left  == null)
            return t;
        return findMin( t.left) ;

    }

    public BinaryNode<AnyType> findMax(BinaryNode<AnyType> t)
    {
        if (t == null)
            return  null;
        while(t.right !=null)
            t = t.right;
        return t;
    }

    private BinaryNode<AnyType> insert(AnyType x,BinaryNode<AnyType> t)
    {
        if (t ==null)
        {
            return new BinaryNode<AnyType>(x);
        }

        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            t.left = insert(x,t.left);
        else if (compareResult > 0)
            t.right = insert(x,t.right);
        else ;
            return  t;
    }

    private BinaryNode<AnyType> remove(AnyType x,BinaryNode<AnyType> t)
    {
        if (t == null)
            return  t;

        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            t.left = remove(x,t.left);
        else  if (compareResult > 0) {
            t.right = remove(x, t.right);
        }else if (t.left != null && t.right != null)
        {
            t.element = findMin(t.right).element;
            t.right = remove(t.element,t.right);
        }
        else {
            t = (t.left != null) ? t.left : t.right;
        }return t;
    }

   private void printFree(BinaryNode<AnyType> t)
   {
      if ( t!=null)
      {
          printFree(t.left);
          System.out.println(t.element);
          printFree(t.right);
      }
   }

//
   public BinaryNode<AnyType> as()
   {
       root.left.right.left = root.left.right.left.right;

       return root;

   }
}
