package My_List;

import java.util.Collection;

/*阶为M的B Tree 高度 logmN 具有以下特性      二叉树是阶为2的  高度log2N
*1.数据项储存在树叶上
*2.非叶节点存储直到M-1个关键字以指示搜索的方向；关键字i代表子树i+1中的最小的关键字
*3.树的根或是一片树叶，或者其儿子数在2和M之间
*4.除根外，所有非树叶节点的儿子数在[M/2]和M之间
*5.所有的树叶都在相同的深度上并有[L/2]和L之间个数据项，L和M不一定相同
*
* */
public class B_Tree {

}
