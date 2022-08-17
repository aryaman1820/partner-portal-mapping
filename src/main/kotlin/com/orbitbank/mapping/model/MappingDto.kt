package com.orbitbank.mapping.model

class MappingDto {

    private lateinit var mappingName:String
    private lateinit var userName:String
    private lateinit var productName:String
    private lateinit var customerName:String
    private lateinit var customerPan:String
    private lateinit var insuredName:String
    private lateinit var insuredPan:String

    fun getUserName(): String {
        return userName
    }

    fun setUserName(userName: String) {
        this.userName = userName
    }

    fun getProductName(): String {
        return productName
    }

    fun setProductName(productName: String) {
        this.productName = productName
    }


    fun getCustomerName(): String {
        return customerName
    }

    fun setCustomerName(customerName: String) {
        this.customerName = customerName
    }

    fun getCustomerPan(): String {
        return customerPan
    }

    fun setCustomerPan(customerPan: String) {
        this.customerPan = customerPan
    }

    fun getInsuredName(): String {
        return insuredName
    }

    fun setInsuredName(insuredName: String) {
        this.insuredName = insuredName
    }

    fun getInsuredPan(): String {
        return insuredPan
    }

    fun setInsuredPan(insuredPan: String) {
        this.insuredPan = insuredPan
    }


    fun getMappingName(): String {
        return mappingName
    }

    fun setMappingName(mappingName: String) {
        this.mappingName = mappingName
    }

    override fun toString(): String {
        return ("MappingDto [mappingName=" + mappingName + ", userName=" + userName + ", productName=" + productName
                + ", customerName=" + customerName + ", customerPan=" + customerPan + ", insuredName=" + insuredName
                + ", insuredPan=" + insuredPan + "]")
    }


}