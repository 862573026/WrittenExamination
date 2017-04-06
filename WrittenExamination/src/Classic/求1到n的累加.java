package Classic;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 求1到n的累加 {

    /**
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     * @param n
     * @return
     */
    public int Sum_Solution(int n) {
        int sum = (int) (Math.pow(n,2) + n);
        return sum>>1;
    }

    //递归
    public int Sum_Solution2(int n) {
        int res = n;
        boolean flag = (n>0)&&((res+=Sum_Solution(n-1))>0);
        return res;
    }

}
