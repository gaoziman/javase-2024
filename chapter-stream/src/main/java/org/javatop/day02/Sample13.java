package org.javatop.day02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 映射扁平化
 */
public class Sample13 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");


        List<String> wordList = words.stream()
                //这里映射的是stream<String[]> 后续的中间操作没有什么作用
                .map(w -> w.split(""))
                //将数组扁平化合并为流
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());


        for (String s : wordList) {
            System.out.println(s);
        }
    }
}
