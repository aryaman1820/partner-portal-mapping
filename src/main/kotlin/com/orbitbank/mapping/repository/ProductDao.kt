package com.orbitbank.mapping.repository

import com.orbitbank.mapping.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductDao: JpaRepository<Product, String> {
}