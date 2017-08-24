package com.guide.java.lambdas.apis;

import com.guide.java.lambdas.models.Customer;

import java.util.List;
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
}
