package l.java.lang.StringBuilder;
/*
构造方法：
StringBuiler() 构造一个不带任何字符的字符串生成器，其初始容量为16个字符
常用构造方法StringBuiler() ，StringBuiler(String)
常用方法：StringBuiler append（），String toString()

 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder sBuilder1=new StringBuilder();    //构造方法1，参数为空
        System.out.println("sBuilder1:"+sBuilder1);   //默认为空
        StringBuilder sBuilder2=new StringBuilder("abc");   //构造方法2，带字符串参数
        System.out.println("sBuilder2:"+sBuilder2);

        //常用方法append
        sBuilder1.append("abcd");
        sBuilder1.append(123);
        sBuilder1.append('t');
        sBuilder1.append(true);
        sBuilder1.append("🀄️国");
        sBuilder1.append(123).append(456);
        System.out.println(sBuilder1);

    }
}
