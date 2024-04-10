package org.javatop.javase.oop03;

import org.javatop.javase.oop02.Singleton;

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
        System.out.println(s2);// this will create a new instance of Singleton

    }
}
