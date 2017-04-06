package Base.Sort;

import Utils.PrintUtils;
import Utils.RandomCreate;

/**
 * Created by Administrator on 2017/3/28.
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a = RandomCreate.createNumArr(0, 10, 10);

        PrintUtils.printArray(bubbleSort(a));
    }

    /**
     *冒泡排序
     * 介绍：选择排序
     * 稳定
     * 平均情况/最坏情况：O(n^2)
     * 最好情况：O(n)
     * 空间复杂度：O(1)
     * @param a
     * @return
     */
    private static int[] bubbleSort(int[] a) {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

}
