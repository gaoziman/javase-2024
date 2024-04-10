package org.javatop.javase.oop01;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-09 23:03
 * @description :
 */
public class AutoUnbox {
    public static void main(String[] args) {
        /*boolean flag = true; //设置成true，保证条件表达式的表达式二一定可以执行
        boolean simpleBoolean = false; //定义一个基本数据类型的boolean变量
        Boolean nullBoolean = null;//定义一个包装类对象类型的Boolean变量，值为null

        boolean x = flag ? nullBoolean : simpleBoolean; //使用三目运算符并给x变量赋值*/

        int num1 = getNum1(2);
        System.out.println("num1 = " + num1);

        Integer num2 = getNum2(4);
        System.out.println("num2 = " + num2);

        System.out.println("-----------------");
        Integer integer1 = 3;
        Integer integer2 = 3;

        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        Integer integer3 = 300;
        Integer integer4 = 300;

        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");
    }
    //自动拆箱
    public static int getNum1(Integer num) {
        return num;
    }
    //自动装箱
    public static Integer getNum2(int num) {
        return num;
    }
}
