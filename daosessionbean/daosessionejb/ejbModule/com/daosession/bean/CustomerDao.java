package com.daosession.bean;

import javax.ejb.Remote;

import com.daosession.entity.Customer;

@Remote
public interface CustomerDao {

    public void saveCustomer(Customer customer);

    public Customer getCustomer(Long customerId);

    public void deleteCustomer(Customer customer);
}
