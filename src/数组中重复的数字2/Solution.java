/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/1 10:41
 * Description: no
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 数组中重复的数字2;

/**
 * 〈一句话功能简述〉<br>
 *    已经修改的数组的长度。
 * 〈no〉
 *
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class Solution {
    public static void main(String[] args) {
        int [] a={2,3,1,0,2,5,3};
        System.out.println(findRepeat(a));

    }

    //找出数组中重复的数字，一个就可以。
    public static int findRepeat(int [] array) {
        if(array.length==0||array==null)
            return -1;
        for(int i=0;i<array.length;i++)
        {
            while(array[i]!=i)
                {
                    if(array[i]==array[array[i]])
                    {
                        return array[i];
                    }

                    //如果不相等，那么就把array[i]放到应该本来的地方去。
                    int tem=array[i];
                    array[i]=array[tem];
                    array[tem]=tem;
                }



        }
        //如果没有，那就返回-1.
        return -1;
    }
}
