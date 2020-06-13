/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/13 22:13
 * Description: 输入一个递增排序的数组和一个数字s,在数组中查找这两个数，使他们的和正好为s,如果满足的条件有多组，那么返回积最小的那组。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题42_和为S的两个数字;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一个递增排序的数组和一个数字s,在数组中查找这两个数，使他们的和正好为s,如果满足的条件有多组，那么返回积最小的那组。〉
 *
 * @author 李佳佳同学
 * @create 2020/6/13
 * @since 1.0.0
 */
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list=new ArrayList();
        if(array==null||array.length<2)
        {
            return list;
        }

        int small=0;
        int big=array.length-1;
        while(small<big){
            int s=array[big]+array[small];
            if(s==sum){
                list.add(array[small]);
                list.add(array[big]);
                break;
            }
            else if(s<sum){
                small++;
            }
            else{
                big--;
            }
        }
        return list;
    }
}