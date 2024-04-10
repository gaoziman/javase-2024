package org.javatop.javase.oop01;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-09 16:35
 * @description :
 */
class Test {
    static {
        System.out.println("静态代码块执行");
    }

    {
        System.out.println("普通代码块执行");
    }

    public Test() {
        System.out.println("This is Test()");
    }

    public Test(String string) {
        System.out.println("This is Test(String string)");
    }
}

public class StaticTest {

    public static void main(String[] args) {
        System.out.println("准备开始创建对象");
        Test test1 = new Test();
        System.out.println("准备开始创建对象");
        Test test2 = new Test("Hello");
        System.out.println("------------------------");
        Test test3 = new Test("Hello");
    }

}


