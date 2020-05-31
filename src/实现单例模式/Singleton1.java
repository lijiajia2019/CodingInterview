/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Singleton1
 * Author:   李佳佳同学
 * Date:     2020/6/1 0:47
 * Description: 单例模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 实现单例模式;

/**
 * 〈一句话功能简述〉<br> 
 * 〈线程单例模式〉
 *
 * @author 李佳佳同学
 * @create 2020/6/1
 * @since 1.0.0
 */
public class Singleton1 {
private Singleton1(){}


private static Singleton1 instance=null;

public static Singleton1 getInstance()  //因为这个类构造方法是私有的，所以不能被实例化，所以这个方法要static。
{
    if(instance==null) //假设此时有两个线程，线程1进行到这一步，然后cpu时间片轮到线程2，线程2完成这个对象的创建。而后线程1拿到CPU的时间片，也继续创建对象，
        //就会产生两个对象，就不是单例的了。
    {
        instance=new Singleton1();
    }
    return instance;
}


}

