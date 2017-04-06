package Structure;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/4/4.
 * LinkedList类是双向列表 感觉用法与ArrayList无异啊
 * 说是插入删除快，ArrayList随机访问快
 */
public class LinkedListUse {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.remove(2);
        System.out.println("链表的第一个元素是 : " + list.get(2));//跟踪进去 确实是个双向链表，而且get的时候是遍历了的
    }
}
