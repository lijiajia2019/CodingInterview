/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/2 18:51
 * Description: 输入一个整数，输出该二进制数表示中1的个数，例如把9表示成1001，有两位是1.因此，如果输入9，则该函数输出2.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试15_二进制中1的个数;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一个整数，输出该二进制数表示中1的个数，例如把9表示成1001，有两位是1.因此，如果输入9，则该函数输出2.〉
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class Solution {

    public static void main(String[] args) {
        //测试左移右移运算符。
       int a=10;
        System.out.println(Integer.toBinaryString(a));
       int b=a << 1;
        System.out.println(Integer.toBinaryString(b));
        int c=a >> 1;
        System.out.println(Integer.toBinaryString(c));

        System.out.println(Integer.toBinaryString(-1));
    }
    public int NumberOf1(int n) {
        int count=0;
        if(n==0)
            return 0;

        while(n!=0){
            //如果它不为零，那么作为二进制数而言，它肯定有一个至少有1
            count++;
            n=n&(n-1);

        }



        return count;
    }
}
