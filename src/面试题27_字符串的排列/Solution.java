/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/18 21:45
 * Description: 输入一个字符串，打印出该字符串中字符的所有排列。例如，输入字符串abc,则打印出由字符a、b、c所能排列出来的所有字符串abc、acb、bac、bca、cab、cba
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题27_字符串的排列;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一个字符串，打印出该字符串中字符的所有排列。例如，输入字符串abc,则打印出由字符a、b、c所能排列出来的所有字符串abc、acb、bac、bca、cab、cba〉
 *
 * @author 李佳佳同学
 * @create 2020/6/18
 * @since 1.0.0
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
public class Solution {
    char [] c;
    ArrayList<String> list=new ArrayList();

    public ArrayList<String> Permutation(String str) {
        c=str.toCharArray();
        dfs(0);
        Collections.sort(list);

        return (ArrayList)list;
    }


    void dfs(int x){
        if(x==c.length-1){
            list.add(String.valueOf(c));
            return ;
        }
        HashSet<Character> set=new HashSet();
        for(int i=x;i<c.length;i++){

            if(set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);

        }
    }

    void swap(int i,int j){
        char tem=c[i];
        c[i]=c[j];
        c[j]=tem;
    }
}