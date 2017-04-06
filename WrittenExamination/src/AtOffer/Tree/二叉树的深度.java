package AtOffer.Tree;

/**
 * Created by Administrator on 2017/3/30.
 */
public class 二叉树的深度 {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int nLeft = TreeDepth(root.left);
        int nRight = TreeDepth(root.right);

        return nLeft > nRight ? (nLeft + 1) : (nRight + 1);
    }
}
