/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/2 17:44
 * Description: 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序和中序遍历中都不含重复的数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题7_重建二叉树;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序和中序遍历中都不含重复的数字〉
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        // 在中序中找到前序的根
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                // 左子树，注意 copyOfRange 函数，包左不包右。
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                // 右子树，注意 copyOfRange 函数，左闭右开
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
                break;
            }
        }
        return root;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode  right;

    public TreeNode(int x  )   {val=x;}


}
