/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/2 14:17
 * Description: nothing
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 两个栈实现队列7;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈nothing 〉
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
    stack1.add(node);
    }

    public int pop() {
     //当stack2没有元素的时候，才能把stack1的元素全部入栈。这样才能实现先进先出。
   if(stack2.isEmpty()){
       while(!stack1.isEmpty()){
           stack2.add(stack1.pop()) ;
       }
   }
        return stack2.pop();
    }
}