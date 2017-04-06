package AtOffer.Array;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 数组中的逆序对 {
    /**
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
     */
    int result=0;
    public int InversePairs(int [] array) {
        int length=array.length;
        if(length<2) return 0;
        int tem[] = new int[length];
        merage(array,tem,0,length-1);
        return result;
    }
    public  void merage(int array[],int tem[],int left,int right){
        if(left<right){
            int middle=(left+right)/2;
            merage(array,tem,left,middle);
            merage(array,tem,middle+1,right);
            merageSort(array,tem,left,middle,right);

        }
    }
    public  void merageSort(int array[],int tem[],int left,int middle,int right){
        int i=left;
        int j=middle+1;
        int k=left;
        while(i<=middle&&j<=right){
            if(array[i]>array[j]){

                result+=middle-i+1;
                result%=1000000007;
                tem[k++]=array[j++];
            }
            else tem[k++]=array[i++];
        }
        while(i<=middle)tem[k++]=array[i++];
        while(j<=right)tem[k++]=array[j++];
        for(int m=left;m<=right;m++) array[m]=tem[m];
    }
}
