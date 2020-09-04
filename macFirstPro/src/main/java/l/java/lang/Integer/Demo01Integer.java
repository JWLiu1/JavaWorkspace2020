package l.java.lang.Integer;
/*
装箱：把基本数据类型的数据，包装到包装类中（基本数据类型的数据->包装类）
    构造方法：(均过时了)
        Integer(int value)构造一个新分配的Integer对象，它表示指定的int值。
        Integer(String s)构造一个新分配的Integer对象，它表示String参数所指示的int值。
                        s传递字符串必须是基本类型的字符串，否则会抛出异常，例如"100"正确，"a"抛异常
    静态方法：
        static Integer valueOf(int i) 返回一个表示指定的int值的Integer实例
        static Integer valueOf(String s) 返回保存指定的String 的值得Integer对象。


拆箱：在包装类中取出基本数据类型的数据（包装类->基本类型的数据）
    成员方法：
        int intValue() 以int 类型返回该Integer的值。
 */
public class Demo01Integer {
    public static void main(String[] args) {
//        装箱
        Integer a1=Integer.valueOf("1");
        Integer a2=Integer.valueOf(1);
        System.out.println(a1+"\t"+a2);
//        拆箱
        int aaa=a1.intValue();
        System.out.println(aaa);
    }
}
