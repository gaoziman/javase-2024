package org.javatop.day02;

import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description :
 */

interface StringFunc {
    String func(String n);
}

class MyStringOps {
    public static String strReverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result + "";
    }
}

public class Sample2 {
    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "labmda add power to Java";
        // MyStringOps::strReverse 相当于实现了接口方法func()
        // 并在接口方法func()中作了MyStringOps.strReverse()操作
        // 表达式MyStringOps::strReverse的计算结果为对象引用，其中，strReverse提供了StringFunc的func()方法的实现。
        String outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);

    }

}
