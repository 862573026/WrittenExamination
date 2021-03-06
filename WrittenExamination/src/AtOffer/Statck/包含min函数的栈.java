package AtOffer.Statck;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Administrator on 2017/4/1.
 */
public class 包含min函数的栈 {

    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
     */
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        int min = stack.peek();
        int tmp = 0;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            tmp = iterator.next();
            if (min>tmp){
                min = tmp;
            }
        }
        return min;
    }
}
