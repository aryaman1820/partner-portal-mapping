package com.orbitbank.mapping.service

import com.orbitbank.mapping.entity.Product
import com.orbitbank.mapping.repository.ProductDao
import org.springframework.stereotype.Service

@Service
class ProductService(private val productDao: ProductDao) {

    fun getProductByName(productName:String): Product {
        return productDao.findById(productName).get()
    }
}