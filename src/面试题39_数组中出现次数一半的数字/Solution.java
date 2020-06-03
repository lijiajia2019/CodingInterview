/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/3 19:12
 * Description: 数组中有一个数字出现次数超过数组长度的一半，请找出这个数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题39_数组中出现次数一半的数字;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数组中有一个数字出现次数超过数组长度的一半，请找出这个数字〉
 *
 * @author 李佳佳同学
 * @create 2020/6/3
 * @since 1.0.0
 */
public class Solution {

    public int find(int [] a){
        if(a==null)
            return 0;
        int times=1;
        int result=a[0];
        for(int i=1;i<a.length;i++) {
            if(times==0){
                result=a[i];
                times=1;
            }
            else if(a[i]==result){
                times++;
            }
            else{
                times--;
            }
        }
        //如果没有超过一半的数字，那么这样遍历到最后，result的值为并不确定。所以还需要再判断一下。

        //return result;
        int time=0;
        for(int i=0;i<a.length;i++)
        {
            if(result==a[i])
                time++;
        }
        return time>a.length?result:0   ;
    }
}
