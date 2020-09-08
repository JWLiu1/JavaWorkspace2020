package l.java.util.calendar;

import java.util.Calendar;
import java.util.Date;

/*
Calendar是一个抽象类，里面提供了很多操作日历字段的方法（YEAR ， MONTH ， DAY_OF_MONTH ， HOUR ）
Calendar无法直接创建类对象，应用getInstance()方法返回Calendar类的子类对象，该方法为静态方法，所以直接“类名.方法名”即Calendar.getInstance（）。
多态的方式创建对象：        Calendar aCalendar=Calendar.getInstance();
 */
/*
Calendar常用的4个成员方法：
    public int get(int field);返回给定日历字段的值。
    public void set(int field,int value);将给定的日历字段设定为给定值。
    public abstract void add(int field, int amount);根据日历的规则，为给定的日历字段添加或减去指定的时间量。
    public Date getTime();返回一个表示此Calendar时间值的Date对象。
成员方法的参数：
    int field：日历类的字段，可以使用Calendar类的静态成员变量获取
        public static final int YEAR=1;     年
        public static final int MONTH=1;    月
        public static final int DAY_OF_MONTH=1;月中的某一天
        public static final int HOUR=1;     时
        public static final int MINUTE=1;   分
        public static final int SECOND=1;   秒
 */
public class Demo01Calendar {

    public static void main(String[] args) {
//        Calendar calendar=Calendar.getInstance();//getInstance()方法返回Calendar的子类对象，形成多态
//        System.out.println(calendar);
        demo01get();
        demo02set();
        demo03add();
        demo04getTime();
    }
    private static void demo01get(){   //应用get方法，获取某个值
        Calendar calendar=Calendar.getInstance();   //getInstance()方法返回Calendar的子类对象,包含很多日历信息
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        System.out.println("年" + year + "月" + month + "日" + day);
    }
    private  static void demo02set(){   //应用set方法,设定为指定值
         Calendar calendar=Calendar.getInstance();
         calendar.set(Calendar.YEAR,2090);
         System.out.println(calendar.get(Calendar.YEAR));
         calendar.set(2090,11,12);  //同时设置年月日
        System.out.println(calendar.get(Calendar.YEAR)+"年"+calendar.get(Calendar.MONTH)+"月");
    }
    private  static void demo03add(){   //应用add方法，增加或减少指定值
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.YEAR,100);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.MONTH,-3);  //同时设置年月日
        System.out.println(calendar.get(Calendar.YEAR)+"年"+calendar.get(Calendar.MONTH)+"月");
    }
    private  static void demo04getTime(){   //应用getTime方法，将日历Calendar转换为Date类型
        Calendar calendar=Calendar.getInstance();
        Date date=calendar.getTime();
        System.out.println(date);
    }
}
