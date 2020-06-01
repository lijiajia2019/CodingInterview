/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/1 20:22
 * Description: 输入一个链表的头结点，从头到尾打印每个节点的值
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 从头到尾打印链表5;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一个链表的头结点，从头到尾打印每个节点的值〉
 *   思路：因为链表只能从头开始遍历，所以我们用栈来来装入，再弹出，就能从尾到头打印链表。
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
class Node{
    int val;

    Node next;
}


public class Solution {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        test(s);

    }

    public static void test(Stack stack){
        while(!stack.empty())
        {
            System.out.println(stack.pop());
        }
    }

//使用栈来实现
    public static void print(Node node){
        if(node==null)
        {
            return ;
        }
        Stack stack=new Stack();
        //为了不破坏这个链表，我们需要一个结点来存储这个头结点。
        Node node1=node;
        while(node1.next!=null){
            stack.add(node1.val);
            node1=node1.next;

        }

        while(!stack.empty())
        {
            System.out.println(stack.pop());
        }


    }

    //用递归来实现 太妙了。
    public static void print2(Node node){
        if(node!=null){
            node=node.next;
            print2(node);
            System.out.println(node.val);
        }


    }
}
