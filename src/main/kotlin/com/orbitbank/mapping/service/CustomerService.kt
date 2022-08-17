package com.orbitbank.mapping.service

import com.orbitbank.mapping.entity.Customer
import com.orbitbank.mapping.repository.CustomerDao
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerDao: CustomerDao) {

    fun getByCustomerName(customerName: String): Customer {
        return customerDao.findById(customerName).get()
    }

    fun saveCustomer(customer: Customer) {
        val tempCustomer = Customer()
        BeanUtils.copyProperties(customer, tempCustomer)
        customerDao.save(tempCustomer)
    }

    fun allCustomers(): List<Customer> {
        return customerDao.findAll()
    }

}