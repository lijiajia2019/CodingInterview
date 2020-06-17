/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solurion
 * Author:   李佳佳同学
 * Date:     2020/6/17 22:54
 * Description: x
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题49_把字符串转换成整数;

/**
 * 〈一句话功能简述〉<br> 
 * 〈x〉
 *
 * @author 李佳佳同学
 * @create 2020/6/17
 * @since 1.0.0
 */
public class Solurion {
    public int SringtoInt(String str){
        Integer res=0;
        try{
            res=new Integer(str);
        }catch(Exception e){
            
        }
        return res;
    }
}
