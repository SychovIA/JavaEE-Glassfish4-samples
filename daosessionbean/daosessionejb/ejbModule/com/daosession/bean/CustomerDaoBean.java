package com.daosession.bean;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.daosession.entity.Customer;

@Stateless
@LocalBean
public class CustomerDaoBean implements CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveCustomer(Customer customer) {
    	System.out.println(customer.toString());
        if (customer.getCustomerId() == null) {
            saveNewCustomer(customer);
        } else {
            updateCustomer(customer);
        }
    }

    private void saveNewCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    private void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    public Customer getCustomer(Long customerId) {
        Customer customer;

        customer = entityManager.find(Customer.class, customerId);

        return customer;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        entityManager.remove(customer);
    }

}