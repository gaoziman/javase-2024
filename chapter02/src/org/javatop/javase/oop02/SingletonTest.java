package org.javatop.javase.oop02;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-10 09:32
 * @description :
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.get();
        System.out.println(s1);
        Singleton s2 = Singleton.get();
        System.out.println(s2);

    }
}
