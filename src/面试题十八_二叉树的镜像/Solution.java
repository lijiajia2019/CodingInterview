/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/6 18:53
 * Description: 递归来解
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题十八_二叉树的镜像;

/**
 * 〈一句话功能简述〉<br> 
 * 〈递归来解〉
 *
 * @author 李佳佳同学
 * @create 2020/6/6
 * @since 1.0.0
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if(root==null)
        {
            return ;
        }

        TreeNode tem=root.left;
        root.left=root.right;
        root.right=tem;
        Mirror(root.left);
        Mirror(root.right);
    }
}
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

     public void Mirror(TreeNode root) {

     }

}