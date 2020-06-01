/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Singleton
 * Author:   李佳佳同学
 * Date:     2020/6/1 0:28
 * Description: 实现一个线程安全的单例模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 实现单例模式1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现一个线程安全的单例模式〉
 * 初步
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance=null;

    public synchronized Singleton getInstance() //实现单例模式，但是synchronized的开销过大，效率太低。
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }
}
