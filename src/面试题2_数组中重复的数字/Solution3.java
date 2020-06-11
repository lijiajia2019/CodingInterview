/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution3
 * Author:   李佳佳同学
 * Date:     2020/6/11 22:10
 * Description: 用Java自带的API做
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题2_数组中重复的数字;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用Java自带的API做〉
 *
 * @author 李佳佳同学
 * @create 2020/6/11
 * @since 1.0.0
 */
public class Solution3 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||numbers.length==0)
        {
            return false;
        }
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]==numbers[i+1])
                return true;
        }

            return false;

    }
}
