package org.javatop.javase.oop02;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-10 09:31
 * @description : 单例模式 - 饿汉式 类加载时就创建对象。
 */
public class Singleton {
    private static Singleton instance = new Singleton();  // 在类加载的时候就创建实例

    // 将构造方法设为私有化 禁止外部创建实例
    private Singleton() {

    }


    public static Singleton get(){
        return instance;
    }
}
