/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/2 22:49
 * Description: 实现一个函数，把字符换中的每个空格替换成"%20"
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题5_替换空格;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现一个函数，把字符换中的每个空格替换成"%20"〉
 *
 * @author 李佳佳同学
 * @create 2020/6/2
 * @since 1.0.0
 */
public class Solution {
    //使用本身自带的API
    public String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }

    //用数组来做。
    public String replaceSpace2(StringBuffer str) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append("%20");
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
