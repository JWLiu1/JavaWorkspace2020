package l.java.util.genericLearning;

import java.util.ArrayList;
import java.util.Iterator;

/*
集合不使用泛型：
    好处：默认类型就是Object类型，可以存储任意类型的数据
    弊端：不安全，会引发异常  例如使用String的length（）方法，会抛出ClassCastException

集合使用泛型：
    好处：1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
         2.把运行期的异常，提前到了编译期
    弊端：泛型是什么类型，只能存储什么类型的数据
 */
public class Demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {  //使用泛型
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Tony");
        arrayList.add(String.valueOf(123)); //如果直接123会报错
        arrayList.add(Integer.toString(45678));   //将int转换为String的另外一种方法

        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str+"\t"+"字符串长度："+str.length());
        }
    }

    private static void show01() {  //不使用泛型，可能会抛出类型转换异常，使用具体类对象的方法的时候。
        ArrayList arrayList=new ArrayList();
        arrayList.add("Jack");
        arrayList.add(123);
        Iterator iterator=arrayList.iterator(); //多态，左边接口，右边迭代器的类对象Object类型
        while (iterator.hasNext()){
            System.out.println(iterator.next());    //取出的元素也是Object类型
        }
    }
}
