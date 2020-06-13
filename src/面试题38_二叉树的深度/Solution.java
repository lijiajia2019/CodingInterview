/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/13 22:47
 * Description: 求一颗二叉树的深度
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题38_二叉树的深度;

/**
 * 〈一句话功能简述〉<br> 
 * 〈求一颗二叉树的深度〉
 *
 * @author 李佳佳同学
 * @create 2020/6/13
 * @since 1.0.0
 */
public class Solution {


    public int TreeDepth(Node root){
        if(root==null){
            return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return (left>right)?(left+1):(right+1);
    }
}

class Node {
    Node left;
    Node right;
    int val;
}