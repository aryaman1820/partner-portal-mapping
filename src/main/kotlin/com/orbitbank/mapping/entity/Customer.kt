package com.orbitbank.mapping.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Customer {
    @Id
    private lateinit var customerName: String
    private lateinit var customerPan: String
    private lateinit var customerAddress: String
    private lateinit var insuredName: String
    private lateinit var insuredPan: String
    private lateinit var insuredAddress: String

    fun getCustomerPan():String = customerPan

    fun getCustomerName():String = customerName

    fun getCustomerAddress():String = customerAddress

    fun getInsuredName():String = insuredName

    fun getInsuredPan():String = insuredPan

    fun getInsuredAddress():String = insuredAddress

    fun setCustomerName(customerName:String){
        this.customerName = customerName
    }

    fun setCustomerPan(customerPan:String){
        this.customerPan = customerPan
    }

    fun setCustomerAddress(customerAddress:String){
        this.customerAddress = customerAddress
    }

    fun setInsuredName(insuredName:String){
        this.insuredName = insuredName
    }

    fun setInsuredPan(insuredPan:String){
        this.insuredPan = insuredPan
    }

    fun setInsuredAddress(insuredAddress:String){
        this.insuredAddress = insuredAddress
    }

    override fun toString(): String {
        return ("Customer [customerName=" + customerName + ", customerPan=" + customerPan + ", customerAddress="
                + customerAddress + ", insuredName=" + insuredName + ", insuredPan=" + insuredPan + ", insuredAddress="
                + insuredAddress + "]")
    }
}
