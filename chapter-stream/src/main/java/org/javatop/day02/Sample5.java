package org.javatop.day02;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description :
 */
public class Sample5 {
    public static void main(String[] args) {
        Stream.of(List.of(
                            new Fruit("草莓", "Strawberry", "浆果", "红色"),
                            new Fruit("桑葚", "Mulberry", "浆果", "紫色"),
                            new Fruit("杨梅", "Waxberry", "浆果", "红色"),
                            new Fruit("蓝莓", "Blueberry", "浆果", "蓝色")
                        ),
                        List.of(
                            new Fruit("核桃", "Walnut", "坚果", "棕色"),
                            new Fruit("草莓", "Peanut", "坚果", "棕色")
                        )
                )
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
