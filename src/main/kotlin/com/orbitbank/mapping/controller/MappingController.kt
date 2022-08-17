package com.orbitbank.mapping.controller

import com.orbitbank.mapping.entity.Customer
import com.orbitbank.mapping.model.MappingDto
import com.orbitbank.mapping.service.CustomerService
import com.orbitbank.mapping.service.MappingService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MappingController(private val mappingService: MappingService, private val customerService: CustomerService) {

    @PostMapping("/save/mapping")
    fun saveMapping(@RequestBody mappingDto: MappingDto): ResponseEntity<String> {
        mappingService.saveMapping(mappingDto)
        return ResponseEntity.ok("Mapping saved Successfully")
    }

    @PostMapping("/save/customer")
    fun saveCustomer(@RequestBody customer: Customer): ResponseEntity<String> {
        customerService.saveCustomer(customer)
        return ResponseEntity.ok("Customer saved Successfully")
    }

    @GetMapping("/allmappings")
    fun allMappings(): ResponseEntity<List<*>> {
        return ResponseEntity.ok(mappingService.getAllMappings())
    }

    @GetMapping("/allcustomers")
    fun allCustomers(): ResponseEntity<List<*>> {
        return ResponseEntity.ok(customerService.allCustomers())
    }

    @GetMapping("/customer/{customerName}")
    fun customerByCustomerName(@PathVariable customerName: String): ResponseEntity<Customer> {
        return ResponseEntity.ok(customerService.getByCustomerName(customerName))
    }
}