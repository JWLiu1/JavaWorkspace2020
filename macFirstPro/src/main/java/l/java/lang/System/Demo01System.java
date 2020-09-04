package l.java.lang.System;

import java.util.Arrays;

/*
java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用方法有：
    public static long currentTimeMillis():返回以毫秒为单位的当前时间值。
    public static void arraycooy(Object src,int srcPos,Object dest,int destPos,int length):将数组中指定数据拷贝到另外一个数组中

 */
public class Demo01System{
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {  //复制数组，参数：原数组，原数组起始位，目标数组，目标数组起始位，复制长度
        int[] src1={1,2,3,4,5};
        int[] des1={6,7,8,9,10};
        System.out.println("数组复制前："+ Arrays.toString(des1));
        System.arraycopy(src1,0,des1,1,3);
        System.out.println("数组复制后："+Arrays.toString(des1));

    }

    private static void demo01() {  //currentTimeMillis():返回以毫秒为单位的当前时间值。测试程序运行时间，效率
        long s1=System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);
        }
        long s2=System.currentTimeMillis();
        long s=s2-s1;
        System.out.println("程序共耗时："+s+"毫秒");
    }
}
