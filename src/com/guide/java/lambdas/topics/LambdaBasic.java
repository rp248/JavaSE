package com.guide.java.lambdas.topics;

import com.guide.java.Topic;

import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaBasic implements Topic {

    @Override
    public void run() {
        /**
         * Without Lambda expression.
         */
        Arrays.asList("Java", "Kotiln", "Scala").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        /**
         * With Lambda expression.
         * forEach method takes an argument type Consumer. Consumer is a Functional interface defined in Java 8.
         * We don't need to create an implementation class or anonymous inner class for Consumer interface. We can
         * use lambda expression instead of Functional interface implementation or a anonymous inner class.
         *
         * If a Function interface is a genetic type we don't need to mention argument types in Lambda expressions.
         */
        Arrays.asList("NLP", "Machine Learning", "Visual Recognition").forEach(
                //(String element)->System.out.println(element) //valid
                //element->System.out.println(element) // valid
                (element)->System.out.println(element) // valid
        );
    }
}
