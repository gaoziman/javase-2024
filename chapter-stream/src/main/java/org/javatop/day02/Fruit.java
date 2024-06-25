package org.javatop.day02;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-21 22:53
 * @description :
 */

public class Fruit {
    private String cname;
    private String name;
    private String category;
    private String color;

    public Fruit(String cname, String name, String category, String color) {
        this.cname = cname;
        this.name = name;
        this.category = category;
        this.color = color;
    }

    public String cname() {
        return cname;
    }

    public String name() {
        return name;
    }

    public String category() {
        return category;
    }

    public String color() {
        return color;
    }

    @Override
    public String toString() {
        return cname + " (" + name + "), Category: " + category + ", Color: " + color;
    }


    public static void print(String str){
        System.out.println(str);
    }

}

