package l.java.util.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
     所有单列集合的最顶层的借口，里面定义了所有单列集合共性的方法。
     任意的单列集合都可以使用Collection接口中的方法。
   共性的方法：
        public boolean add(E e):把给定的对象添加到当前集合中。
        public void clear():清空集合中的所有元素
        public boolean remove(E e):把给定的对象在当前集合中删除
        public boolean contains(E e):判断当前集合中是否包含给定的对象
        public boolean isEmpty():判断当前集合是否为空
        public int size():返回集合中元素的个数
        public Object[] toArray():把集合中的元素，存储到数组中
 */
public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        System.out.println(collection);

        collection.add("张三");   //add方法，把对象添加到当前集合中，一般返回true，可以不接收，没有意义。
        collection.add("李四");
        collection.add("王五");
        System.out.println(collection);

        collection.remove("李四");    //remove方法，删除对象。删除不存在的元素会返回false，但不会报错。
        System.out.println(collection);

        boolean abool1=collection.contains("王五");   //contains方法，包含返回true，不包含返回false
        boolean abool2=collection.contains("王wu");
        System.out.println(abool1+"\t"+abool2);

        boolean abool3=collection.isEmpty();    //isEmpty方法，空集合返回true，非空集合返回false
        System.out.println(abool3);

        int num=collection.size();  //size()方法返回集合中元素个数。
        System.out.println(num);

        Object[] aObject=collection.toArray();  //toArray()方法把集合中的元素，存储到数组中
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(aObject[i]);
        }

        collection.clear(); //clear()方法清空集合，但是不删除集合。
        System.out.println(collection);
        System.out.println(collection.isEmpty());



    }
}
