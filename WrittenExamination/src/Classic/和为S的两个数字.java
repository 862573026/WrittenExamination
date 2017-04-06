package Classic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 和为S的两个数字 {
    /**
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=i+1;j<array.length;j++){
                if(array[i] + array[j] == sum){
                    list.add(array[i]);
                    list.add(array[j]);
                    list.add(array[i] * array[j]);
                }
            }
            if(!list.isEmpty())
                lists.add(list);
        }
        if(lists.size() ==0) return new ArrayList<Integer>();
        //if(lists.size() ==1) return lists.get(0);
        Collections.sort(lists, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(2).compareTo(o2.get(2));

            }
        });

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = lists.get(0);
        for(int i=0;i<temp.size() -1;i++){
            result.add(temp.get(i));
        }

        return result;
    }
}
