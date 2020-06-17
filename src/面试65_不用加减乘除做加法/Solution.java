/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/17 22:42
 * Description: 写一个函数，求两个整数之和，不用加减乘除这四个符号
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试65_不用加减乘除做加法;

/**
 * 〈一句话功能简述〉<br> 
 * 〈写一个函数，求两个整数之和，不用加减乘除这四个符号〉
 *
 * @author 李佳佳同学
 * @create 2020/6/17
 * @since 1.0.0
 */
public class Solution {
   public int Add(int num1,int num2){
       int sum,carry;
       do{
           sum=num1^num2;
           carry=(num1&num2)<<1;
           num1=sum;
           num2=carry;


       }while(num2!=0);

       return num1;
   }
}
