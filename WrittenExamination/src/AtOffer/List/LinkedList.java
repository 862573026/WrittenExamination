package AtOffer.List;


/**
 * Created by Administrator on 2017/4/4.
 */
public class LinkedList {
    ListNode head = null;//创建一个空链表,头结点
    ListNode last = head;//尾结点

    public LinkedList(){

    }

    /**
     * 向指定链表添加元素的方法
     *
     * @param val 插入的元素
     */
    public void add(int val) {
        ListNode node = new ListNode(val);//新建结点
        if (head == null) {//如果链表为空
            head = node;
        } else {
            last.next = node;//先把新增结点放在最后
        }
        last = node;//再把最后一个结点向后移位
    }

    /**
     * 非递归打印元素的方法
     */
    public void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;//索引向后移位
        }
    }

    /**
     * 递归打印链表元素的方法
     */
    public void printNode(ListNode head) {
        if (head != null) {
            System.out.println(head.val);
            ListNode node = head.next;
            printNode(node);//递归调用
        }
    }

    /**
     * 向链表中插入新元素的方法
     */
    public void insert(int index, int obj) {
        ListNode node = head;
        int j = 0;
        while (node != null && j < index - 2) {
            //查找到第index-1个元素
            node = node.next;
            j++;
        }
        ListNode sert = new ListNode(obj);//被插入的结点
        sert.next = node.next;
        node.next = sert;
    }

    /**
     * 删除指定位置的结点
     *
     * @param index 索引
     */
    public void delete(int index) {
        ListNode node = head;
        int j = 0;
        while (node != null && j < index - 2) {
            //查找到第i-1个元素
            node = node.next;
            j++;
        }
        node.next = node.next.next;//删除第index个元素
    }

    /**
     * 改变指定位置的元素
     *
     * @param index 索引
     * @param obj
     */
    public void modify(int index, int obj) {
        ListNode node = head;
        int j = 0;
        while (node != null && j < index - 1) {
            //找到第index个结点
            node = node.next;
            j++;
        }
        node.val = obj;
    }
}
