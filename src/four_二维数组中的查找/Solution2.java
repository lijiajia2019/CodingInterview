/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution2
 * Author:   李佳佳同学
 * Date:     2020/6/1 20:05
 * Description: 第一个没写完
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package four_二维数组中的查找;

/**
 * 〈一句话功能简述〉<br> 
 * 〈第一个没写完〉
 *
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class Solution2 {
    public static void main(String[] args) {

    }



    public static boolean findNumber(int [][] a2,int key){
        if(a2==null)
        {
            return false;
        }
        int maxrow=a2.length;
        int column=a2[0].length-1;
        int row=0;
        //从右上角开始，此时row最小，column最大。
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
