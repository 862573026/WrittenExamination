package AtOffer.Tree;

import java.util.Stack;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 二叉树的镜像 {

    /**
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     * 镜像 左右看过去对称的
     * @param root
     */
    public void Mirror(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left != null || node.right != null) {
                TreeNode nodeLeft = node.left;
                TreeNode nodeRight = node.right;
                node.left = nodeRight;
                node.right = nodeLeft;
            }
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
    }
}
