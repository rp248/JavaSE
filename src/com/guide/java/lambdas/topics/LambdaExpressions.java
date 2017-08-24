package com.guide.java.lambdas.topics;

import com.guide.java.Topic;
import com.guide.java.lambdas.apis.CustomerUtility;
import com.guide.java.lambdas.apis.FunctionalFilterCustomerAgeImpl;
import com.guide.java.lambdas.models.Customer;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions implements Topic {

    @Override
    public void run() {

        Customer mobileCustomer = new Customer();
        mobileCustomer.setAge(10);
        mobileCustomer.setName("Android");

        Customer genericCustomer = new Customer();
        genericCustomer.setAge(21);
        genericCustomer.setName("Java");

        Customer scriptCustomer = new Customer();
        scriptCustomer.setAge(5);
        scriptCustomer.setName("Kotlin");

        List<Customer> customers = Arrays.asList(mobileCustomer, genericCustomer, scriptCustomer);

        System.out.println("Filtering Customers by age without using Lambda expressions");
        /**
         * Without using Lambda expressions
         */
        CustomerUtility.filterCustomers(customers, new FunctionalFilterCustomerAgeImpl());

        System.out.println("Filtering Customers by age using Lambda expressions");
        /**
         * With Lambda expressions.
         * Using LE, we can remove/avoid functional interface implementations. We can pass functional
         * interface implementations(method body) as arguments to a method
         */
        CustomerUtility.filterCustomers(customers, (Customer customer) -> customer.getAge()>6);


    }
}
