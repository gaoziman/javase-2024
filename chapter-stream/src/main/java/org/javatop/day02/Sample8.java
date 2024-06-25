package org.javatop.day02;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 截取  合并
 * skip 是跳过几个元素
 * limit 是限制处理的元素个数
 */
public class Sample8 {
    public static void main(String[] args) {
        Stream.concat(Stream.of("a", "b", "c"), Stream.of("d"))
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }
}
