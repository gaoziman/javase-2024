package org.javatop.day02;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 08:48
 * @description :
 */
public class Sample1 {
    public static void main(String[] args) {
        Stream.of(new Fruit("草莓", "Strawberry", "浆果", "红色"),
                new Fruit("桑椹", "Mulberry", "浆果", "紫色"),
                new Fruit("杨梅", "Waxberry", "浆果", "红色"),
                new Fruit("核桃", "Walnut", "坚果", "棕色"),
                new Fruit("花生", "Peanut", "坚果", "棕色"),
                new Fruit("蓝莓", "Blueberry", "浆果", "蓝色"))
                .filter( fruit->fruit.category().equals("浆果"))
                // .filter(f -> f.category().equals("浆果") && f.color().equals("蓝色"))
                .map(fruit->fruit.name() + "酱")
                .collect(Collectors.toList())
                // .map(Fruit::name)
                .forEach(Fruit::print);
    }
}
