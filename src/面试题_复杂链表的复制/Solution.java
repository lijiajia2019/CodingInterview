/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Solution
 * Author:   李佳佳同学
 * Date:     2020/6/12 12:13
 * Description: x
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 面试题_复杂链表的复制;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈x〉
 *
 * @author 李佳佳同学
 * @create 2020/6/12
 * @since 1.0.0
 */

 class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){return pHead;}
        HashMap<RandomListNode,RandomListNode> map=new HashMap();
        RandomListNode p1=pHead;
        RandomListNode p2=pHead;

        while(p1!=null){
            map.put(p1,new RandomListNode(p1.label));
            p1=p1.next;
        }

        while(p2!=null){
            if(p2.next!=null){
                map.get(p2).next=map.get(p2.next);
            }
            else{
                map.get(p2).next=null;
            }
            map.get(p2).random=map.get(p2.random);
            p2=p2.next;
        }
        return map.get(pHead);
    }
}