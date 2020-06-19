/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/19 12:41
 * Description: 稍稍有漏洞的写法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题26_二叉搜索树和双向链表;


import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈稍稍有漏洞的写法〉
 *
 * @author 李佳佳同学
 * @create 2020/6/19
 * @since 1.0.0
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }

}
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
    //边界值判断
        if(pRootOfTree==null){
            return pRootOfTree;
        }
        ArrayList<TreeNode> list=new ArrayList();
        dfs(pRootOfTree,list);
       return  zhuanhuan(list);

    }

    //中序node排序并放入list。
    public void dfs(TreeNode root,ArrayList<TreeNode> list){
        if(root==null) return;
        dfs(root.left,list);
        list.add(root);
        dfs(root.right,list);
    }

    //连接双向链表
    public TreeNode zhuanhuan(ArrayList<TreeNode> list){
        for(int i=0;i<list.size()-1;i++){
            list.get(i).right=list.get(i+1);
            list.get(i+1).left=list.get(i);
        }
        return list.get(0);
    }
}
