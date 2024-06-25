package org.javatop.day02;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 查找与判断
 */
public class Sample10 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 4, 7, 6, 9};

        Arrays.stream(array)
                .filter(x -> (x & 1) == 0)
                .findAny()
                .ifPresent(System.out::println);


        Arrays.stream(array).anyMatch(x -> (x & 1) == 0);
    }
}
