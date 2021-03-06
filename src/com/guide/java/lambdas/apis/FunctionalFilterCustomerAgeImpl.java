package com.guide.java.lambdas.apis;

import com.guide.java.lambdas.models.Customer;

public class FunctionalFilterCustomerAgeImpl implements FunctionalFilterCustomer<Customer> {
    @Override
    public boolean verify(Customer customer) {
        return customer.getAge()>6;
    }
}
