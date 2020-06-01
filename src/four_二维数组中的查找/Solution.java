/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/1 19:36
 * Description: 在一个二维数组中，每一行从左到右递增的顺序排序，每一列都按照从上到下递增的顺序，请完成一个函数，输入这样一个二维数组和一个整数，判断数组中是否有该整数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package four_二维数组中的查找;

/**
 * 〈一句话功能简述〉<br> 
 * 〈在一个二维数组中，每一行从左到右递增的顺序排序，每一列都按照从上到下递增的顺序，请完成一个函数，输入这样一个二维数组和一个整数，判断数组中是否有该整数〉
 *
 *
 * 观察规律，我们可以从最右上角开始找。
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class Solution {
    public static void main(String[] args) {
        int [] [] array=new int [2] [3] ;
        int length=array.length;
        int column=array[0].length;
        //System.out.println("row: "+length+" column: "+column);

        int [] []  a2={{1,2,3},{4,5,6}};
        //System.out.println("row:"+a2.length+"column:"+a2[0].length);
        //System.out.println(a2[0][1]);

        int array2[] []  ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(findNumber(array2,20));
    }





//需要注意的问题：column最大要array[0].length-1才行。
    //并且(row<maxrow&&column》=0)要同时满足。

    public static boolean findNumber(int [][] a2,int key){
        if(a2==null)
        {
            return false;
        }
        int maxrow=a2.length;
        int column=a2[0].length-1;
        int row=0;
        while(row<maxrow&&column>=0){
            if(key>a2[row][column] ) {
                row++;
            }
            else if(key<a2[row][column]){
                column--;
            }
            else{
                return true;
            }

        }
        return false;
    }
}
