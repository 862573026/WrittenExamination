package Utils;

/**
 * Created by Administrator on 2017/3/30.
 */
public class ConvertUtils {
    public static int[] convertToIntArr(String[] strs){
        int[] ia=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            ia[i]=Integer.parseInt(strs[i]);
        }
        return  ia;
    }
}
