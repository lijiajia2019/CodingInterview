/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/10 23:15
 * Description: 输入一颗二叉树和一个整数，打印二叉树所有节点值的和为该整数的路径，所谓路径，就是从根节点到叶子节点的路
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题34_二叉树中和为某一值的路径;


import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一颗二叉树和一个整数，打印二叉树所有节点值的和为该整数的路径，所谓路径，就是从根节点到叶子节点的路〉
 *
 * @author 李佳佳同学
 * @create 2020/6/10
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
        Stack<Integer> path=new Stack();
        ArrayList<ArrayList<Integer>> paths=new ArrayList();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null) return paths;
        path.push(root.val);
        target=target-root.val  ;
        if(root.left==null&&root.right==null&&target==0){
            paths.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        //每次返回，都要弹出你已经遍历过的子节点，留下根节点
        path.pop();
        return paths;
    }



}
