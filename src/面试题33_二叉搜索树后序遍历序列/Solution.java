/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/7 23:04
 * Description: 输入一个整数数组，判断该数组是不是某二叉搜索树序列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题33_二叉搜索树后序遍历序列;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一个整数数组，判断该数组是不是某二叉搜索树序列〉
 *
 * @author 李佳佳同学
 * @create 2020/6/7
 * @since 1.0.0
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {

        if(sequence.length==0||sequence==null)
            return false;
        int root=sequence[sequence.length-1];
        int i=0;
        for(;i<sequence.length-1;i++){
            if(sequence[i]>root)
                break;

        }
        int j=i;
        for(;j<sequence.length-1;j++){
            if(sequence[j]<root)
                return false;
        }

        boolean left=true;
        if(i>0)
        {
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        }

        boolean right=true;
        if(i<sequence.length-1){
            right=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,sequence.length-1));
        }


        return (left&&right);
    }
}
