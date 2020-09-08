package l.java.util.iterator;

import java.util.ArrayList;

/*
增强for循环，for each，专门用来遍历数组和集合，内部原理实际是iterator迭代器，遍历过程中，不能对集合中元素进行增删操作。
所有单列集合，均可以使用增强for循环

格式：
    for(集合/数组的数据类型 变量名：集合名/数组名)
 */
public class Demo01forEach {


    public static void main(String[] args) {
        Demo01();
        Demo02();
    }

    private static void Demo02() {
        System.out.println("一家四口分别是：");
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("薛慧林");
        arrayList.add("刘金伟");
        arrayList.add("刘学森");
        arrayList.add("刘小森");
        for (String str:arrayList) {
            System.out.println(str);

        }

    }

    private static void Demo01() {
        int[] a1={1,2,3,4,5};
        for (int arr:a1) {
            System.out.println(arr);
        }
    }


}
