/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/2 16:49
 * Description: 写一个函数，输入N,求裴波那契数列的第N项
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 裴波那契数列;

/**
 * 〈一句话功能简述〉<br> 
 * 〈写一个函数，输入N,求裴波那契数列的第N项〉
 * 不需要使用递归，如果我们使用递归的话，那么就会有很严重的效率问题。所以我们就要用两个数来替保存他们，到下一轮循环的时候再更新这两个值。
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class Solution {
    public int Fibonacci(int n) {
        int firstOne=0;
        int SecondOne=1;
        int findN=0;
        if(n==0){
            return firstOne;
        }
        if(n==1){
            return SecondOne;
        }

//        for(int i=2;i<n;i++) 在这里出错，需要i<=n;而不是i<n
        for(int i=2;i<=n;i++)
        {
            findN=firstOne+SecondOne;
            firstOne=SecondOne;
            SecondOne=findN;
        }


    return findN;
    }
}
