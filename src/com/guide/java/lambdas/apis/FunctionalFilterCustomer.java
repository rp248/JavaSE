package com.guide.java.lambdas.apis;

import com.guide.java.lambdas.models.Customer;

/**
 * A functional interface. It has only one abstract method.
 */
public interface FunctionalFilterCustomer<T> {
    boolean verify(T t);
}
