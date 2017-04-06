package AtOffer.List;

//import static Utils.RandomCreate.createNum; //此种import

import Utils.RandomCreate;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 翻转链表 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.head = new ListNode(RandomCreate.createNum(1,20));
//        linkedList.last = linkedList.head;
        for (int i = 0;i<10;i++){
            linkedList.add(RandomCreate.createNum(1,20));
        }

        reverseList(linkedList.head);
        linkedList.print(linkedList.head);
    }

    /**
     * 输入一个链表，反转链表后，输出链表的所有元素。
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null)
                newHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return newHead;
    }
}
