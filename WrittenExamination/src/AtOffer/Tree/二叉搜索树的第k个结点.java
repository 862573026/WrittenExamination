package AtOffer.Tree;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 二叉搜索树的第k个结点 {
    /**
     * 给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
     * @param pRoot
     * @param k
     * @return
     */
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null || k <= 0){
            return null;
        }
        TreeNode[] result = new TreeNode[1];
        KthNode(pRoot,k,new int[1],result);
        return result[0];
    }
    void KthNode(TreeNode pRoot, int k,int[] count,TreeNode[] result){
        if(result[0] != null || pRoot == null){
            return;
        }
        KthNode(pRoot.left,k,count,result);
        count[0]++;
        if(count[0] == k){
            result[0] = pRoot;
        }
        KthNode(pRoot.right,k,count,result);
    }
}
