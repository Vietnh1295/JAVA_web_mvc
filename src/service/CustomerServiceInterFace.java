package service;

import model.Customer;

import java.util.List;

public interface CustomerServiceInterFace {
     List<Customer> fillAll();
    void saveCustomer(Customer customer);
    Customer findById(int id);
    void updateCustomer(int id,Customer customer);
    void removeCustomer(int id);
}
