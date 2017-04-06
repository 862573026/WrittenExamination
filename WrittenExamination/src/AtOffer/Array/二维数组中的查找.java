package AtOffer.Array;

/**
 * Created by Administrator on 2017/3/30.
 * 在一个二维数组中，每一行都按照从左到右
 * 递增的顺序排序，每一列都按照从上到下递
 * 增的顺序排序。请完成一个函数，输入这样
 * 的一个二维数组和一个整数，判断数组中是
 * 否含有该整数。
 * Checked  重点在于用while，向下和向右遍历
 */
public class 二维数组中的查找 {
    //若方法为private 是不会出现三角形运行标志的
    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 4, 6},
                {2, 4, 7, 8},
                {5, 5, 10, 12}};
        System.out.println(findIn2DArray(array, 7));
        System.out.println(findIn2DArray(array, 11));
    }

    /**
     * 思路简单 因为这是个有规律的二维数组
     *
     * @param array
     * @param target
     * @return
     */
    private static boolean findIn2DArray(int[][] array, int target) {
        int len = array.length - 1;
        int i = 0;
        while ((len >= 0) && (i < array[0].length)) { //需要同时存储横纵坐标
            if (array[len][i] > target) { //比目标大，看下一行的是不是也大了
                len--;
            } else if (array[len][i] < target) { //比目标小，横坐标右移
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
