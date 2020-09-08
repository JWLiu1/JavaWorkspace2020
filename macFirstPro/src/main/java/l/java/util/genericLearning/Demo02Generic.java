package l.java.util.genericLearning;

public class Demo02Generic {
    public static void main(String[] args) {
        GenericClass genericClass=new GenericClass();   //默认是Object类型，不写对象的类型
        genericClass.setName("张三");
        Object name1=genericClass.getName();
        System.out.println(name1);

        GenericClass<Integer> genericClass1=new GenericClass<>();   //对象类型为Integer，泛型的方法返回值也随之变为Integer
        genericClass1.setName(1234);
        Integer name2=genericClass1.getName();
        System.out.println(name2);

        GenericClass<String> df=new GenericClass<>();
        df.setName("小米");
        String name3=df.getName();
        System.out.println(name3);


    }
}
