package Base.Sort;

import Utils.PrintUtils;
import Utils.RandomCreate;

/**
 * Created by Administrator on 2017/3/28.
 */
public class 快速排序 {

    public static void main(String[] args) {
        int[] a = RandomCreate.createNumArr(0, 10, 10);
        quickSort(a,0,a.length-1);
        PrintUtils.printArray(a);
    }

    /**
     * 快速排序
     * 介绍：快速排序
     * 不稳定
     * 平均情况/最好情况/空间复杂度：O(n*log2n)
     * 最坏情况：O(n^2)
     * @param a
     * @param o
     * @param e
     */
    private static void quickSort(int[] a, int o, int e){
        int left = o;
        int right = e;
        int temp;
        if(o<e){
            while(left<right){
                while(left<e&&a[left]<=a[o]){
                    left++;
                }
                while(right>o&&a[right]>a[o]){
                    right--;
                }
                if(left<right){
                    temp = a[left];
                    a[left]  = a[right];
                    a[right] = temp;
                }
            }
            temp = a[o];
            a[o] = a[right];
            a[right] = temp;

            quickSort(a, o, right-1);
            quickSort(a, right+1, e);
        }
    }
}
