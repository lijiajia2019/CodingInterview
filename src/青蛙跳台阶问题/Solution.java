/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/2 17:18
 * Description: 一只青蛙一次可以跳上一级台阶，也可以跳上两级台阶。求该青蛙跳上N级台阶有多少种跳法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 青蛙跳台阶问题;

/**
 * 〈一句话功能简述〉<br> 
 * 〈一只青蛙一次可以跳上一级台阶，也可以跳上两级台阶。求该青蛙跳上N级台阶有多少种跳法〉
 * f(n)=f(n-1)+f(n-2);
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class Solution {
    public int JumpFloor(int target) {
    if(target==0||target==1){
        return target;
    }
    int onestep=1;
    int twostep=1;
    int result=0;

    //用两个临时变量来保存这些数。
    for(int i=2;i<=target;i++)
    {
        result=onestep+twostep;
        onestep=twostep;
        twostep=result;
    }

        return result;

    }
}
