package org.javatop.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-18 23:30
 * @description : 转换等价的 lambda 表达式
 */
public class Sample3 {

    public static void main(String[] args) {
        // List<Integer> result = filter(List.of(1, 2, 3, 4, 5, 6), (Integer number) -> (number & 1) == 1);

        // consume( List.of(1, 2, 3, 4, 5, 6), (Integer number1, Integer number2) -> System.out.println(number1 + number2));

        // List<String> result = map(List.of(1, 2, 3, 4, 5, 6), String::valueOf);


      // consume(List.of(1, 2, 3, 4, 5, 6),   number -> System.out.println(number));

        List<Integer> result = supply(10, () -> ThreadLocalRandom.current().nextInt());

        System.out.println(result);
    }


    // 有参有返回值且返回值是boolean的函数式接口
    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            // 筛选：判断是否是偶数，但以后可能改变判断规则
            if(predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
        /**
         *  (number & 1) == 1) 等价于 (Integer number) -> (number & 1) == 1
         */
    }

    // 有参有返回值的函数式接口
    static List<String> map(List<Integer> list,Function<Integer,String> function) {
        List<String> result = new ArrayList<>();
        for (Integer number : list) {
            // 转换：将数字转为字符串，但以后可能改变转换规则
            result.add(function.apply(number));
        }
        return result;
        /**
         * String.valueOf(number) 等价于 (String number) -> String.valueOf(number);
         */
    }


    // 有参无返回值的函数式接口
    static void consume(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer number : list) {
            // 消费：打印，但以后可能改变消费规则
            consumer.accept(number);
        }
        /**
         * System.out::println 等价于 (Integer number) -> System.out.println(number)
         */
    }


    static List<Integer> supply(int count, Supplier<Integer> supplier) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            // 生成：随机数，但以后可能改变生成规则
           result.add(supplier.get());
        }
        return result;
        /**
         * ThreadLocalRandom.current().nextInt() 等价于 () -> ThreadLocalRandom.current().nextInt()
         */
    }






}
