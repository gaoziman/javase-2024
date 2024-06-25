package org.javatop.day01;

import java.util.List;
import java.util.function.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-18 23:30
 * @description : 转换等价的 lambda 表达式
 */
public class Sample4 {

    public static void main(String[] args) {

    }

    Function<String, Integer> lambda1 = (String s) -> Integer.parseInt(s);


    BiPredicate<List<String>, String> lambda2 = (list, element) -> list.contains(element);

    BiPredicate<Student, Object> lambda3 = (stu, obj) -> stu.equals(obj);


    BiPredicate<Student, Object> lambda4 = (stu, obj) -> stu.equals(obj);


    Runtime runtime = Runtime.getRuntime();

    Supplier<Long> lambda = () -> runtime.freeMemory();


}
