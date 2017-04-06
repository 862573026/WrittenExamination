package Classic;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30.
 */
public class 零一背包问题 {
    class Item {
        public int weight;
        public int value;
    }

    private static int weight, item_num;
    private static Item[] item;

    /**
     * @param n 前n个物品
     * @param C 背包容量c
     */
    public static int Iterative(int n, int C) {
        if (n == 0 || C == 0)
            return 0;
        else {
            for (int i = n - 1; i >= 0; i--) {
                if (item[i].weight > C) {
                    return Iterative(n - 1, C);
                } else {
                    int temp1 = Iterative(n - 1, C);
                    int temp2 = Iterative(n - 1, C - item[i].weight) + item[i].value;
                    return temp1 > temp2 ? temp1 : temp2;
                }
            }
        }
        return 0;
    }

    public static int getValue() {
        int value = 0;

        return value;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            weight = s.nextInt();
            item_num = s.nextInt();
            item = new Item[item_num];
            for (int i = 0; i < item_num; i++) {
                item[i] = new 零一背包问题().new Item();
                item[i].weight = s.nextInt();
                item[i].value = s.nextInt();
            }

            System.out.println(Iterative(item_num, weight));
        }
    }
}
