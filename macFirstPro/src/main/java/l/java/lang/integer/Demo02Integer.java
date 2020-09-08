package l.java.lang.integer;

import java.util.ArrayList;

/*
自动装箱与自动拆箱
 */
public class Demo02Integer {
    public static void main(String[] args) {
        Integer integer=2;  //Integer integer=new Integer(2);实现自动装箱，从基本数据变为包装类
        integer=integer+2;  //integer.intValue()+2 自动拆箱，然后自动装箱赋值给包装类对象integer=4；

        ArrayList<Integer> list=new ArrayList<Integer>();   //Arraylist集合无法直接存储整数，可以存储Integer包装类
        list.add(100);    //自动装箱
        int a1= list.get(0);    //自动拆箱，将Integer->int，此处的0是集合的位置下标
        System.out.println(a1);
    }
}
