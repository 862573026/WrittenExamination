package Base.Search;

/**
 * Created by Administrator on 2017/3/30.
 */
public class 二分查找 {
    /**
     * 非递归代码
     * @param array
     * @param a
     * @return
     */
    public static int biSearch(int []array,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }

    /**
     * 递归实现
     * @param array
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    public static int sort(int []array,int a,int lo,int hi){
        if(lo<=hi){
            int mid=(lo+hi)/2;
            if(a==array[mid]){
                return mid+1;
            }
            else if(a>array[mid]){
                return sort(array,a,mid+1,hi);
            }else{
                return sort(array,a,lo,mid-1);
            }
        }
        return -1;
    }


    /**
     * 查找第一个元素出现的位置（元素允许重复）
     * @param array
     * @param a
     * @return
     */
    public static int biSearchFirst(int []array,int a){
        int n=array.length;
        int low=0;
        int hi=n-1;
        int mid=0;
        while(low<hi){
            mid=(low+hi)/2;
            if(array[mid]<a){
                low=mid+1;
            }else{
                hi=mid;
            }
        }
        if(array[low]!=a){
            return -1;
        }else{
            return low;
        }
    }

    /**
     * 查询元素最后一次出现的位置
     * @param array
     * @param a
     * @return
     */
    public static int biSearchLast(int []array,int a){
        int n=array.length;
        int low=0;
        int hi=n-1;
        int mid=0;
        while(low<hi){
            mid=(low+hi+1)/2;
            if(array[mid]<=a){
                low=mid;
            }else{
                hi=mid-1;
            }
        }

        if(array[low]!=a){
            return -1;
        }else{
            return hi;
        }
    }
}
