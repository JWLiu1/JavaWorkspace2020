package l.java.lang.StringBuilder;
/*
StringBuilder和String可以相互转换
String转为StringBuilder，利用构造函数
StringBuilder转为String，利用toString方法
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        String str1="strrr";
        StringBuilder stringBuilder=new StringBuilder(str1); //String转为StringBuilder
        System.out.println(stringBuilder);

        String str2=stringBuilder.toString();
        System.out.println("字符串str2："+str2);
    }

}
