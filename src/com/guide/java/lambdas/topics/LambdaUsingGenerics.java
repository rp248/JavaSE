package com.guide.java.lambdas.topics;

import com.guide.java.Topic;
import com.guide.java.lambdas.apis.CustomerUtility;
import com.guide.java.lambdas.models.Customer;

import java.util.Arrays;
import java.util.List;

public class LambdaUsingGenerics implements Topic {

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

        CustomerUtility.filterCustomersAndGetNameUsingGenerics(customers, customer->customer.getAge()>10,
                (Integer customerName) -> System.out.println(customerName), customer -> customer.getAge());
    }
}
