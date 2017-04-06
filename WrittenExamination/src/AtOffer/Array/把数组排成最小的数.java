package AtOffer.Array;

import Utils.PrintUtils;
import Utils.RandomCreate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 把数组排成最小的数 {
    public static void main(String[] args){
        int[] arr = RandomCreate.createNumArr(1,10,5);
        PrintUtils.printArray(arr);
        System.out.println(printMinNumber(arr));
    }
    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     *
     * @param numbers
     * @return
     */
    public static String printMinNumber(int[] numbers) {
        int n;
        String s = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        n = numbers.length;

        for (int i = 0; i < n; i++) {
            list.add(numbers[i]);//将数组放入arrayList中
        }
        //实现了Comparator接口的compare方法，将集合元素按照compare方法的规则进行排序
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer str1, Integer str2) {
                // TODO Auto-generated method stub
                String s1 = str1 + "" + str2;
                String s2 = str2 + "" + str1;

                return s1.compareTo(s2);
            }
        });

        for (int j : list) {
            s += j;
        }
        return s;
    }
}
