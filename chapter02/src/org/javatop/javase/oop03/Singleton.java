package org.javatop.javase.oop03;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-10 09:35
 * @description : 单例模式 - 懒汉模式 第一次调用get方法时才会创建对象。
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton object created");
    }

    // 提供一个公有的静态方法，以获取实例对象
    public static Singleton getInstance() {
        // 第一次调用该方法时，才真正创建实例
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
