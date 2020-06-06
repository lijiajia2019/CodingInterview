/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/6 11:38
 * Description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题22_丛上往下打印二叉树;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从上往下打印出二叉树的每个节点，同层节点从左至右打印。〉
 *
 * @author 李佳佳同学
 * @create 2020/6/6
 * @since 1.0.0
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
       ArrayList<Integer> list=new ArrayList<Integer>();
       //考虑边界条件：
        if(root==null){
            return list;
        }
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
           TreeNode t=q.poll();
           list.add(t.val);
           if(t.left!=null){
               q.offer(t.left);
           }
           if(t.right!=null){
               q.offer(t.right);
           }
       }

        return list;

    }
}
