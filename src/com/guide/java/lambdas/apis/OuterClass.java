package com.guide.java.lambdas.apis;

import java.lang.reflect.Modifier;
import java.util.function.Consumer;

public class OuterClass {
    private int x;

    public class InnerClass {
        /**
         * Variable x is effectively final. We can't reassign a new value
         * to variable x in InnerClassMethod();
         */
        private int x=1;
        public void InnerClassMethod(int x) {
            /**
             * Causes compile time error.
             */
            //x= 46;
            Consumer<Integer> consumer = integer -> {
                System.out.println("Consumer accept() Arg:"+integer);
                System.out.println("InnerClassMethod() Arg:"+x);
                System.out.println("OuterClass x variable:"+OuterClass.this.x);
                System.out.println("InnerClass x variable:"+this.x);
            };
            consumer.accept(x);
        }
    }
}
