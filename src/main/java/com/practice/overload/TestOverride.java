package com.practice.overload;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class TestOverride {
    
    public void printText(Object obj) {
        System.out.println("obj = " + obj);
    }
    public void printText(Animal animal) {
        System.out.println("animal = " + animal);
    }
    public void printText(Dog animal) {
        System.out.println("dog = " + animal);
    }
    /*public void printText(String str) {
        System.out.println("str = " + str);
    }*/
    /*public void printText(Integer digit) {
        System.out.println("int = " + digit);
    }*/

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        TestOverride instance = new TestOverride();
        /*instance.printText("Manoj");
        instance.printText(1234);
        instance.printText(instance);
        */
        Animal ani1 = new Animal();
        Dog dog1 = new Dog();
        AtomicReference<Constructor<?>> animalConst = new AtomicReference<>();
        Arrays.stream(Animal.class.getConstructors()).forEach(cont -> {
            cont.setAccessible(true);
            animalConst.set(cont);
        });
        Animal ani2 = (Animal) animalConst.get().newInstance();
        Dog dog2 = (Dog) dog1.clone();
        System.out.println("dog1 = "+dog1.hashCode());
        System.out.println("dog1 = "+ani2.hashCode());
    }
}
