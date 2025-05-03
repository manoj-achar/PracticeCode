package com.practice.lamda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
class BiConsumerImpl implements BiConsumer<String, String> {

    @Override
    public void accept(String s, String s2) {
        System.out.println("Str1 = "+s+" :: Str2 = "+s2);
    }
}

public class TestConsumerInterface  {

    public static void main(String[] args) {
        ConsumerImpl testConsumerInterface = new ConsumerImpl();
        testConsumerInterface.accept("Hello World!!");
        Consumer consumer = (s) -> System.out.println(s);
        consumer.accept("Hello world from lamda");

        BiConsumerImpl biConsumerImpl = new BiConsumerImpl();
        biConsumerImpl.accept("Hello", "Java");
        BiConsumer biConsumer = (str1, str2) -> System.out.println("Using lamda , str1="+str1+" str2="+str2);
        biConsumer.accept("Hello", "Java");
    }
}
