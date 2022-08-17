package com.orbitbank.mapping.service

import com.orbitbank.mapping.entity.Mapping
import com.orbitbank.mapping.model.MappingDto
import com.orbitbank.mapping.repository.MappingDao
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service

@Service
class MappingService(private val mappingDao: MappingDao, private val userService: UserService, private val productService: ProductService, private val customerService: CustomerService) {

    fun saveMapping(mapping: MappingDto) {
        val tempMapping = Mapping()
        BeanUtils.copyProperties(mapping, tempMapping)
        tempMapping.setUser(userService.getUserByName(mapping.getUserName()))
        tempMapping.setProduct(productService.getProductByName(mapping.getProductName()))
        tempMapping.setCustomer(customerService.getByCustomerName(mapping.getCustomerName()))
        mappingDao.save<Mapping>(tempMapping)
    }

    fun getAllMappings(): List<Mapping> {
        return mappingDao.findAll()
    }

    fun getMappingByName(mappingName: String): Mapping {
        return mappingDao.findById(mappingName).get()
    }
}