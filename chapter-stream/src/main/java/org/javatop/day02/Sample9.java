package org.javatop.day02;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 生成
 */
public class Sample9 {
    public static void main(String[] args) {
        // 生成0-9的数字
        IntStream.range(0, 9)
                .forEach(System.out::println);

        System.out.println("------------------");

        IntStream.rangeClosed(0, 9)
                .forEach(System.out::println);


       Stream.generate(()-> ThreadLocalRandom.current().nextInt()).limit(5)
               .forEach(System.out::println);
    }
}
