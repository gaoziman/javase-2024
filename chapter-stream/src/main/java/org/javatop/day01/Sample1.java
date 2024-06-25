package org.javatop.day01;

import java.util.function.Function;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-18 23:30
 * @description :
 */
public class Sample1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Function<Integer, String> func =  number-> String.valueOf(number);
    }
}
