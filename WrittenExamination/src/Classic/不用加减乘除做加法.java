package Classic;

import java.math.BigInteger;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 不用加减乘除做加法 {
    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     *
     * @param num1
     * @param num2
     * @return
     */
    public int Add(int num1, int num2) {
        BigInteger bi1 = new BigInteger(String.valueOf(num1)); //BigInteger里有add函数
        BigInteger bi2 = new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();
    }

    //与运算
    public int Add2(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }
}
