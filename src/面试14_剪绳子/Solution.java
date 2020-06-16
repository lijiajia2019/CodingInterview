/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/16 23:17
 * Description: 输入一段长度为N的绳子，要求剪成N段，每段长为不小于1的整数，求这几段绳子的乘积的最大值。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试14_剪绳子;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一段长度为N的绳子，要求剪成N段，每段长为不小于1的整数，求这几段绳子的乘积的最大值。〉
 *
 * @author 李佳佳同学
 * @create 2020/6/16
 * @since 1.0.0
 */
public class Solution {

    public int cutRope(int target){
        if(target==0)
        {
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 1;
        }
        if(target==3){
            return 2;
        }

        //确定绳子的段数
        int length=target%3==0?target/3:target/3+1;

        //确定长度为2的段数
        int length2=3-target%3;
        int result=1;
        for(int i=0;i<length;i++){
            result=result*(i<length-length2?3:2);
        }
        return result;


    }
}
