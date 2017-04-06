package AtOffer.List.链表;

/**
 * Created by Administrator on 2017/4/4.
 * 单向链表
 */
public class Node {
    private Node data; //数据区
    private Node next; //指针区

    public Node(Node data,Node next){
        this.data = data;
        this.next = next;
    }

    public Node getData() {
        return data;
    }

    public void setData(Node data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
