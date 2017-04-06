package AtOffer.Tree;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 二叉树的下一个结点 {
    public TreeLinkNode GetNext(TreeLinkNode node)
    {
        if(node==null)return null;
        if(node.right!=null)
        {
            node=node.right;
            while(node.left!=null)
            {
                node=node.left;

            }return node;
        }
        while(node.next!=null)
        {
            if(node.next.left==node)return node.next;
            node=node.next;
        }
        return null;
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
