package org.javatop.day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 筛选出能够被2整除的数字并构成一个list集合
 */
public class Sample12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        numbers.stream()
                .filter(n-> n % 2 ==0 )
                //去重
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
