package com.practice.overload;

import java.io.Serializable;

public class Animal implements Serializable {
    public void eat() throws RuntimeException{
        System.out.println("Animal eating");
        throw new RuntimeException();
    }

    protected Object readResolve() {
        return new Object();
    }
}

    class Dog extends Animal{
        private String name;

        Dog(String name) {
            this.name = name;
        }
        public Dog() {}

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }


        public void eat() throws NullPointerException {
            System.out.println("Dog eating");
            throw new NullPointerException();
        }
    }

class TestAnimal {
    public static void main(String[] args ) {
        Animal dog = new Dog();
        dog.eat();
//        new Animal().eat();
//        new Dog().eat();
    }
}
