package com.orbitbank.mapping.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne


@Entity
class Mapping {
    @Id
    private lateinit var mappingName: String

    @ManyToOne
    @JoinColumn(name = "userName")
    private lateinit var user: User

    @ManyToOne
    @JoinColumn(name = "customerName")
    private lateinit var customer: Customer

    @OneToOne
    @JoinColumn(name = "productName")
    private lateinit var product: Product
    private var postedOn: LocalDateTime

    init {
        postedOn = LocalDateTime.now()
    }

    fun getMappingName(): String {
        return mappingName
    }

    fun setMappingName(mappingName: String) {
        this.mappingName = mappingName
    }

    fun getUser(): User {
        return user
    }

    fun setUser(user: User) {
        this.user = user
    }

    fun getProduct(): Product {
        return product
    }

    fun setProduct(product: Product) {
        this.product = product
    }

    fun getCustomer(): Customer? {
        return customer
    }

    fun setCustomer(customer: Customer) {
        this.customer = customer
    }

    fun getPostedOn(): LocalDateTime {
        return postedOn
    }

    fun setPostedOn(postedOn: LocalDateTime) {
        this.postedOn = postedOn
    }
}
