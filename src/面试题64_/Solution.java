/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/13 21:36
 * Description: x
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题64_;

/**
 * 〈一句话功能简述〉<br> 
 * 〈求1+2+3+N的值，要求不能使用乘除法，for、while、if、else、switchcase等关键字以及条件判断语句A？B：C〉
 *
 * @author 李佳佳同学
 * @create 2020/6/13
 * @since 1.0.0
 */
public class Solution {
    public int Sum_Solution(int n) {
        int sum=n;
        boolean x=(n>0)&&((sum+=Sum_Solution(n-1))>0);



        return sum;

    }
}
