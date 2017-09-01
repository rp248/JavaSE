package com.guide.java.lambdas.apis;

import com.guide.java.lambdas.models.Customer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CustomerUtility {
    public static void filterCustomers(List<Customer> customers, FunctionalFilterCustomer<Customer> verifyCustomer) {
        for(Customer customer: customers) {
            if (verifyCustomer.verify(customer))
                System.out.println(customer.getName());
        }
    }

    public static void filterCustomersUsingPredicate(List<Customer> customers, Predicate<Customer> predicate) {
        for (Customer customer: customers) {
            predicate.test(customer);
        }
    }

    public static void filterCustomersAndConsume(List<Customer> customers, Predicate<Customer> predicate,
                                                 Consumer<Customer> customerConsumer) {
        for (Customer customer:customers){
            if (predicate.test(customer))
                customerConsumer.accept(customer);
        }
    }

    public static void filterCustomersAndGetName(List<Customer> customers, Predicate<Customer> predicate,
                                                 Consumer<String> customerConsumer,
                                                 Function<Customer, String> customerGetNameFunction) {
        for (Customer customer: customers) {
            if (predicate.test(customer)) {
                String customerName = customerGetNameFunction.apply(customer);
                customerConsumer.accept(customerName);
            }
        }
    }

    public static <X,Y> void filterCustomersAndGetNameUsingGenerics(
            List<X> customers, Predicate<X> predicate,
            Consumer<Y> customerConsumer,
            Function<X, Y> customerGetNameFunction){
        for (X x: customers) {
            if (predicate.test(x)) {
                Y y = customerGetNameFunction.apply(x);
                customerConsumer.accept(y);
            }
        }

    }
}
