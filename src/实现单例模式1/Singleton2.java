/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Singleton2
 * Author:   李佳佳同学
 * Date:     2020/6/1 1:07
 * Description: 双重检查来实现单例模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 实现单例模式1;

/**
 * 〈一句话功能简述〉<br> 
 * 〈双重检查来实现单例模式〉
 *
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class Singleton2 {
private Singleton2(){}

private volatile static Singleton2 instance=null;


public static Singleton2 getInstance()
{
    if(instance==null) { //使用volatile的原因是。当线程1进入创建对象的锁里面的时候，此时对象还没有创建完，但是也不是null，此时如果线程2进入，那么它就以为
        //instance不是null，直接返回，就会报错。使用volatile保证线程可见，就不会出现这样的错误。。
        synchronized (Singleton2.class) {
            if (instance == null)
                instance = new Singleton2();
        }
    }
    return instance;
}



}
