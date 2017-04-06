package Utils;

import java.util.Random;

/**
 * Created by Administrator on 2017/3/28.
 */
public class RandomCreate {
    public static Random random = new Random();

    public static Random getRandomInstance() {
        return random;
    }

    /**
     * 生成随机数数组
     *
     * @param min
     * @param max
     * @param num
     * @return
     */
    public static int[] createNumArr(int min, int max, int num) {
        Random random = getRandomInstance();
        int[] target = new int[num];
        int temp = 0;

        for (int i = 0; i < target.length; i++) {
            if (min < 0) {
                temp = random.nextInt(2); //随机取余
                if (temp == 0) { //存入负数
                    target[i] = -(random.nextInt(-min + 1));
                } else {
                    target[i] = random.nextInt(max) + 1;
                }
            } else {
                target[i] = random.nextInt(max) % (max - min + 1) + min;
            }
        }

        return target;
    }

    public static int createNum(int min, int max) {
        Random random = getRandomInstance();
        int temp = 0;
        int target = 0;
        if (min < 0) {
            temp = random.nextInt(2); //随机取余
            if (temp == 0) { //存入负数
                target = -(random.nextInt(-min + 1));
            } else {
                target = random.nextInt(max) + 1;
            }
        } else {
            target = random.nextInt(max) % (max - min + 1) + min;
        }
        return target;
    }
}
