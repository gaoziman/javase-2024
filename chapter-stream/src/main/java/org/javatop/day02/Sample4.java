package org.javatop.day02;

import org.javatop.day02.domain.Person;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 09:20
 * @description :
 */
public class Sample4 {


    public static void main(String[] args) {
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // lambda表达式
        Consumer<String> consumer2 = s-> System.out.println(s);

        // 方法引用
        Consumer<String> consumer3 = System.out::println;


    }

}
