package org.javatop.day01;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-18 23:30
 * @description : 转换等价的 lambda 表达式
 */
public class Sample2 {
    public static void main(String[] args) {
        // `Math::random`
        Runnable runnable = () -> Math.random();
        System.out.println("runnable = " + runnable);

        // 1. `Math::sqrt`
        Runnable runnable1 = () -> Math.sqrt(100);
        System.out.println("runnable1 = " + runnable1);

        // 2. `Student::getName`
        Function<Student, String> stringFunction = (Student student) -> student.getName();

        // 3. `Student::setName`
        BiConsumer<Student, String> studentStringBiConsumer = (Student student, String name) -> student.setName(name);

        // 4. `Student::hashCode`
        Function<Student, Integer> integerFunction = (Student student) -> student.hashCode();

        // 5. `Student::equals`
        BiFunction<Student, Object, Boolean> studentObjectBooleanBiFunction = (Student student, Object obj) -> student.equals(obj);

    }
}
