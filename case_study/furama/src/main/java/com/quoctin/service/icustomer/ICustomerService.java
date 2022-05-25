package com.quoctin.service.icustomer;

import com.quoctin.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAllPaging(Pageable pageable);

    void save(Customer customer);

    Customer findById(int id);


    List<Customer> search(String nameSearch, String phoneSearch, String typeSearch);


    void updateFlag(Integer id);
}
