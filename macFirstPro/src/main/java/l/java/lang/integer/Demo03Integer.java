package l.java.lang.integer;
/*
基本类型与字符串类型之间的相互转换
基本类型一>字符串（String）
    1.基本类型的值+""最简单的方法（工作中常用）
    2.包装类的静态方法toString（参数），不是0bject类的toString（）重载
        static String toString（int i）返回一个表示指定整数的String 对象。
    3. String类的静态方法value0f（参数）
        static String value0f（int i）返回int参数的字符串表示形式。

字符串（String）一>基本类型
    使用包装类的静态方法parseXXX（ "字符串"）；
        Integer类: static int parseInt（String s）
        Double类: static double parseDouble（String S ）
 */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本数据类型->字符串
        String aString=23+"";
        aString=aString+200;    //字符串+int，将int也转换为字符串
        System.out.println(aString);
        String aString1=Integer.toString(90);   //利用Integer类的静态方法toString(参数);
        String aString2=String.valueOf(80); //利用String类的静态方法valueOf(参数)；

        //字符串->基本数据类型
        int aint1=Integer.parseInt(aString);
        aint1+=100000;
        System.out.println(aint1);

    }
}
