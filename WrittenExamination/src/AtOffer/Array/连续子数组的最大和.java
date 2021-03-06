package AtOffer.Array;

import Utils.PrintUtils;
import Utils.RandomCreate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/4/1.
 * Checked
 */
public class 连续子数组的最大和 {

    public static void main(String[] a) {
//        int[] arr = {3,21,43,10};
//        Arrays.sort(arr);
//        PrintUtils.printArray(arr); //升序排列
        int[] arr = RandomCreate.createNumArr(-8, 3, 10);
        PrintUtils.printArray(arr);
        System.out.println("\n" + FindGreatestSumOfSubArray(arr));
    }

    /**
     * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:
     * 在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很
     * 好解决。但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
     * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不
     * 会被他忽悠住？(子向量的长度至少是1)
     *
     * @param array
     * @return
     */
    public static int FindGreatestSumOfSubArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) { //遍历，把所有的sum加入进去，排序
                sum += array[j];
                list.add(sum);
            }
        }
        if (list.size() <= 0) return 0;
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}
