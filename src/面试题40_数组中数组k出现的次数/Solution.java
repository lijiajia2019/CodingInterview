/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/13 22:31
 * Description: x
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题40_数组中数组k出现的次数;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 李佳佳同学
 * @create 2020/6/13
 * @since 1.0.0
 */
public class Solution
{

    public int find(int []a,int k){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                count++;
        }
        return count;
    }
}
