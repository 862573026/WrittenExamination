package Structure;

import java.util.*;

/**
 * Created by Administrator on 2017/4/4.
 * 基本这些数据结构都实现了
 * Cloneable,Serializable
 * 由此可见Serializable效率低点 但是还是很受欢迎的
 */
public class StructureUse {
    public static void main(String[] args) {
        useLinkedList();
        useHashtable();

        useHashMap();

        useHashSet();
        useTreeSet();
    }

    /**
     * LinkedList类是双向列表 感觉用法与ArrayList无异啊
     * 说是插入删除快，ArrayList随机访问快。不是特别巨大的项目，应该体会不到区别
     */
    public static void useLinkedList() {
        LinkedList<String> list = new LinkedList<>(); //需要继承本身，不然跟踪进去是List（父类）下的get
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.remove(2);
        //基本方法和ArrayList无异
        System.out.println("链表的第一个元素是 : " + list.get(0));//跟踪进去 确实是个双向链表，而且get的时候是遍历了的
    }

    /**
     * Hashtable
     * key value不为null，key相同覆盖
     */
    public static void useHashtable() {
//        Dictionary<String,String> table = new Hashtable<>(); //Hashtable继承自Dictionary 实现了map。所以如下两种创建方式都可以
        Map<String, String> table = new Hashtable<>();
//        table.put(null,null); //运行报错 当然，是空指针异常
        table.put("", "123");
        table.put("", "234");
        System.out.println(table.size()); //具体方法和hashmap也无异，不过线程安全，效率低
    }

    public static void useHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put("", null);
        map.put("", "234");
        //containsKey根据Node，hash的hasCode判断的 发现Java真是由C++改的
        // Object的 public native int hashCode();是native方法
        System.out.println(map.size() + "  " + map.containsKey(null));//与hashtable不同，允许空key value,并且具有containsKey、containsValue方法
    }

    /**
     * HashSet不允许重复 允许null 有contains方法没有随机访问方法
     * HashSet是Set下的，但是确是用了HashMap这个类
     */
    public static void useHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        set.add(null);
        set.add(null);
        set.clone();

        System.out.println("HashSet " + set.contains("0"));
    }

    /**
     * 不允许null，重复覆盖
     * SortedSet接口的唯一实现类 保证了排序
     */
    public static void useTreeSet() {
        TreeSet<String> set = new TreeSet<>();
        set.add("1");
        set.add("4");
        set.add("3");
        set.add("7");
        Object obj = set.clone();
        System.out.println(obj.equals(set) + " " + set.hashCode()); //HashCode与对象地址有关系，但绝不是对象地址
        //此处hashCode相同，equals的结果是true，但是对象地址其实是不同的，因为是浅拷贝。深拷贝需要重写clone实现
        //深拷贝，就是说创建一个新对象，然后将当前对象的非静态字段复制到该新对象，无论该字段是值类型的还是引用类型，都乖乖的进行复制。
        //浅拷贝的死穴就在于原始对象及其副本引用同一个对象，那我们让他们不指向同一个对象就完了
        //深拷贝的核心在于新的资源的申请
        set.ceiling("123");

        System.out.println("TreeSet " + set.contains("1") +" "+set.first());
    }


}
