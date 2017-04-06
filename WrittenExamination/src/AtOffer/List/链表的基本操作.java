package AtOffer.List;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 链表的基本操作 {
    //链表的增删改查
    private Node head = null, tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    //增加结点
    public void addNode(int val) {
        if (isEmpty()) {
            head = tail = new Node(val);
        } else {
            tail.setNodeNext(new Node(val));
            tail = tail.getNodeNext();
        }
        tail.next = null;
    }

    //得到链表的长度
    public int getSize() {
        int count = 0;
        for (Node temp = head; temp != null; temp = temp.getNodeNext()) {
            count++;
        }
        return count;

    }

    //删除指定位置结点的值
    public void deleteNode(int x, int size) {
        int count = 0;
        if (x > size) {
            System.out.println("删除结点不存在");
            return;
        }
        for (Node temp = head; temp != null; temp = temp.getNodeNext(), count++) {
            if (count == x - 1 && count == 0) {
                head = null;
                head = temp.next;
            } else if (count == x - 2 && x < size) {//获得删除结点的前一个结点
                temp.next = temp.next.next;
            } else if (count == x - 2 && x == size) {//获得最后结点的前一个结点
                temp.next = null;
            }
        }
    }

    //修改指定结点的值
    public void updateNode(int x, int value) {//x表示修改第几个结点的值
        int count = 1;
        for (Node temp = head; temp != null; temp = temp.getNodeNext(), count++) {
            if (count == x) {
                temp.val = value;
            }
        }
    }

    public void printLink() {
        for (Node temp = head; temp != null; temp = temp.getNodeNext()) {
            temp.printNode();
        }
    }

    public static void main(String[] args) {

        链表的基本操作 linklist = new 链表的基本操作();
        linklist.addNode(1);
        linklist.addNode(2);
        linklist.addNode(3);
        linklist.addNode(4);
        linklist.addNode(5);
        linklist.printLink();
        System.out.println();

        int size = linklist.getSize();
        System.out.println(size);

        linklist.deleteNode(5, size);
        linklist.printLink();
        System.out.println();

        linklist.updateNode(2, 8);
        linklist.printLink();
    }

}

class Node {
    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public void setNodeNext(Node nodeNext) {
        next = nodeNext;
    }

    public Node getNodeNext() {
        return next;
    }

    public void printNode() {
        System.out.print(val + " ");
    }
}
