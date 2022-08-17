package com.orbitbank.mapping.repository

import com.orbitbank.mapping.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerDao: JpaRepository<Customer,String> {
}