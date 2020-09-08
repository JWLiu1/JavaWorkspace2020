package l.java.util.genericLearning;
/*
泛型是一个未知的数据类型，当不确定使用什么数据类型的时候，可以使用泛型
泛型可以接受任意数据类型。
创建对象的时候确定数据类型.可以创建多个对象，各个对象是不一样的类型。泛型的好处，类型不写死。
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
