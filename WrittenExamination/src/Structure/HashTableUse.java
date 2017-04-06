package Structure;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by Administrator on 2017/4/4.
 * HashTable key value不为null，key相同覆盖
 */
public class HashTableUse {
    public static void main(String[] args) {
        Dictionary<String,String> table = new Hashtable<>(); //Hashtable继承自Dictionary
        table.put("",null);
        table.put("","234");
        System.out.println(table.size());
    }
}
