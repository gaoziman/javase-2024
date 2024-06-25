package org.javatop.day02;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 构建stream流
 */
public class Sample7 {
    public static void main(String[] args) {
        Stream<String> stream = List.of("a", "b", "c").stream();
        stream.forEach(System.out::println);

        // 把一个对象转换为stream流
        Stream.of("d");

        Stream.of("x", "y");


        // 合并两个stream流
        Stream.concat(Stream.of("a","b","c"), Stream.of("d"));
    }
}
