/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution2
 * Author:   李佳佳同学
 * Date:     2020/6/1 19:10
 * Description: 找出数组中重复的数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 数组中重复的数字2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈找出数组中重复的数字〉
 *
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class Solution2 {
    public static void main(String[] args) {
        int [] array={1,4,3,3,2};
        System.out.println(findRepeat(array));
    }



    public static int findRepeat(int [] array){
        if(array.length<=0||array==null)
            return -1;
        for(int i=0;i<array.length;i++)
        {
            while(array[i]!=i)
            {
                if(array[i]==array[array[i]]){
                    return array[i];
                }
                int tem=array[i];
                array[i]=array[tem] ;
                array[tem]=tem;
            }
        }


        return -1;
    }
}
