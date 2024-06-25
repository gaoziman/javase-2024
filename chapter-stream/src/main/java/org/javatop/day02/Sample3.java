package org.javatop.day02;

import org.javatop.day02.domain.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-22 09:20
 * @description :
 */
public class Sample3 {
    public int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a, Person b){
        return a.getAge() - b.getAge();
    }


    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();

        int array[] = {1, 3, 2, 5, 4};
       // Arrays.sort(array, Comparator.comparing(Person::getName));
        Supplier person = Person::new;


    }

}
