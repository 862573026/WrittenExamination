package AtOffer.Dynamic;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 最长递增子序列 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3, 1, 5, 3, 13, 12, 42, 12, 53, 100};
        System.out.printf(String.valueOf(lis(arr)));
    }

    public static int lis(int[] array) {
        Integer[] lis = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && (lis[j] + 1 > lis[i]))
                    lis[i] = lis[j] + 1;
            }
        }
        int max = 0;
        for (int k = 0; k < lis.length; k++) {
            if (lis[k] > max)
                max = lis[k];
        }
        return max;
    }
}
