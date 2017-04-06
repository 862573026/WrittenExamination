package AtOffer.Array;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 数组中出现次数超过一半的数 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        if(len<1){
            return 0;
        }
        int count=0;
        Arrays.sort(array);
        int num=array[len/2]; //排序后机智的判断一半
        for(int i=0;i<len;i++){
            if(num==array[i])
                count++;
        }
        if(count<=(len/2)){
            num=0;
        }
        return num;
    }
}
