package AtOffer.List;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 链表中倒数第k个结点 {

    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     * @param list
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode list,int k) {
        if (list == null)   return list;

        ListNode node = list;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (count < k)  return null;

        ListNode p = list;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }

        return p;
    }
}
