package l.java.util.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
    java.util.Iterator接口：迭代器，对集合进行遍历
    两个常用方法：
        boolean hasNext():判断集合中石油有下一个元素，有返回true，没有返回false
        E next():返回迭代的下一个元素，取出集合的下一个元素。
     Iterator迭代器是接口，无法直接使用，需要使用Iterator接口的实现类对象。
     Iterator<E> iterator()方法返回迭代器的实现类对象,返回在此集合的元素上进行迭代的迭代器。

     迭代器使用步骤：
        1.使用集合中的iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
        2.使用Iterator接口中的方法hasNext()判断有没有下一个元素
        3.使用Iterator接口中的方法next()取出集合中的下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("薛慧林");
        collection.add("刘金伟");
        collection.add("刘小森");

        Iterator<String> iterator= collection.iterator();   //获取迭代器的实现类对象，并把指针（索引）指向集合的-1索引。多态：左边接口，右边实现类对象，
        for (int i = 0; i < collection.size(); i++) {
            if(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }



    }

}
