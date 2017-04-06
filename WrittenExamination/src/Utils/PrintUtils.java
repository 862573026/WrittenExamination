package Utils;

/**
 * Created by Administrator on 2017/3/28.
 */
public class PrintUtils {

    public static <T extends Object> void printArray(T[] a) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            sb.append(",");
        }
        sb.substring(a.length - 2, a.length - 1);
        System.out.printf(sb.toString());
    }


    public static void printArray(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            sb.append(",");
        }
        sb.substring(a.length - 2, a.length - 1);
        System.out.println(sb.toString());
    }
}
