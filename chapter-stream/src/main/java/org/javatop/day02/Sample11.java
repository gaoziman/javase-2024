package org.javatop.day02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description : 排序和去重
 */
public class Sample11 {
    public static void main(String[] args) {
        record Hero(String name, int strength) {
            int nameLength() {
                return this.name.length();
            }
        }

        Stream.of(
                        new Hero("独孤求败", 100),
                        new Hero("令狐冲", 90),
                        new Hero("风清扬", 98),
                        new Hero("东方不败", 98),
                        new Hero("方证", 92),
                        new Hero("任我行", 92),
                        new Hero("冲虚", 90),
                        new Hero("向问天", 88),
                        new Hero("不戒", 88)
                )
                // .sorted((h1, h2) -> h1.strength - h2.strength) // 按照力量排序
                // .sorted(Comparator.comparingInt(h -> h.strength)) // 按照力量排序
                .sorted((a,b)-> {
                    int res = Integer.compare(b.strength(), a.strength());
                    return (res == 0) ? Integer.compare(a.nameLength(), b.nameLength()) : res;
                })

                // 改写为方法引用
                .sorted(
                        Comparator.comparingInt(Hero::strength)
                                .reversed()
                                .thenComparingInt(Hero::nameLength)
                )
                .distinct() // 去重
                .forEach(System.out::println); // 输出
    }
}
