package com.guide.java.lambdas.topics;

import com.guide.java.Topic;
import com.guide.java.lambdas.apis.TargetTypeFunctionalInterfaceDouble;
import com.guide.java.lambdas.apis.TargetTypeFunctionalInterfaceInteger;

import java.util.function.Supplier;

public class LambdaTargetType implements Topic {

    @Override
    public void run() {

        /**
         * The target type expected for below lambda expression is of type TargetTypeFunctionalInterfaceInteger.class
         */
        TargetTypeFunctionalInterfaceInteger integer = (x,y)->x+y;

        /**
         * The target type expected for below lambda expression is of type TargetTypeFunctionalInterfaceDouble.class
         */
        TargetTypeFunctionalInterfaceDouble ddouble = (x,y)->x+y;
        System.out.println(integer.add(10,10));
        System.out.println(ddouble.add(10.1,10.1));

        /**
         * The target type for a lambda expression must be a functional interface and, to be compatible with the
         * target type, the lambda expression must have the same parameter types as the interface’s function type,
         * its return type must be compatible with the function type, and it can throw only exceptions allowed by
         * the function type.
         *
         * Functional interfaces acts as Target type for lambda expressions.
         */

        Supplier<Runnable> runnerSupplier = () -> () -> {};

        Supplier<Runnable> runnerSupplier1 = new Supplier<Runnable>() {
            @Override
            public Runnable get() {
                return new Runnable() {
                    @Override
                    public void run() {

                    }
                };
            }
        };
    }
}
