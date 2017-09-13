package My_List;

import static java.util.Objects.compare;

public class AvlTree {
    private  static class AvlNode<AnyType>{
        AnyType elment;
        AvlNode<AnyType> left;
        AvlNode<AnyType> right;
        int height;

        AvlNode(AnyType theElment)
        {
            this(theElment,null,null);
        }

        AvlNode(AnyType theElment, AvlNode<AnyType> lt, AvlNode<AnyType> rt)
        {
            elment = theElment ; left = lt ; right = rt ; height = 0;
        }

        private int height(AvlNode<AnyType> t)
        {
            return t == null ? -1 : t.height;
        }

        private AvlNode<AnyType> insert(AnyType x ,AvlNode<AnyType> t) {
            if (t == null) {
                return new AvlNode<AnyType>(x, null, null);
            }

            int compareResult = compare(x, t.elment);
            if (compareResult < 0) {
                t.left = insert(x, t.left);
                if (height(t.left) - height(t.right) == 2)
                    if (compare(x, t.left.elment) < 0)
                        t = rotateWithLeftChild(t);
                    else t = doubleWithLeftChild(t);
            } else if (compareResult > 0)
            {
                t.right = t.insert(x , t.right);
                        if(height(t.right) - height(t.left) == 2)
                            if (compare(x,t.right.elment) >0)
                                t = rotateWithLeftChild(t);
                            else t = doubleWithLeftChild(t);
            }
            else
                ;//Duplicate ; do nothing
            t.height = Math.max(height(t.left), height(t.right))+1;
            return t;

        }

        private int compare (AnyType x, AnyType elment) {
         int compareResult =(Integer) x - (Integer)elment;
            return compareResult;
        }

        //执行单旋转
        private AvlNode<AnyType> rotateWithLeftChild( AvlNode<AnyType> k2)
        {
            AvlNode<AnyType> k1 = k2.left;
            k2.left = k1.right;
            k1.right = k2;
            k2.height = Math.max(height(k2.right),height(k2.left))+1;
            k1.height = Math.max(height(k1.right),k2.height)+1;
            return k1;
        }

        //双旋转
        private AvlNode<AnyType> doubleWithLeftChild(AvlNode<AnyType> k3)
        {
            k3.left = rotateWithLeftChild( k3.left);
            return rotateWithLeftChild(k3);
            /*AvlNode<AnyType> k1 = k3.left;
            AvlNode<AnyType> k2 = k1.right;
            k1.right = k2.left;
            k3.left = k2.right;
            k2.left = k1;
            k2.right = k2;
            return k2;*/
        }

        //remove


    }
}
