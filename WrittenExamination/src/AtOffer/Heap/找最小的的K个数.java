package AtOffer.Heap;

import Utils.ConvertUtils;
import Utils.PrintUtils;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/30.
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则
 * 最小的4个数字是1,2,3,4,。
 */
public class 找最小的的K个数 {
    public static void main(String[] args){
//        System.out.printf(args.length+""); args长度为0
//        PrintUtils.printArray(args);

    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(input.length < k || k == 0)
            return list;

        for (int i = 0; i < k; i++){
            list.add(input[i]);
        }

        for (int i = k; i < input.length; i++) {
            int j = this.getMax(list);
            int temp = (Integer) list.get(j);
            if (input[i] < temp)
                list.set(j, input[i]);
        }
        return list;
    }
    public int getMax(ArrayList<Integer> list) {
        int max = list.get(0);
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                j = i;
            }
        }
        return j;
    }
}
