package com.littlelemon.tablemanagement.singletons

/**
 * singleton class
 * there is one instance of the object that can access to the class
 */
object RestaurantTables {

    private val customers : MutableList<String> = mutableListOf()

    fun addCustomer(customer : String) {
        customers.add(customer)
    }

    fun removeCustomer(customer: String) {
        customers.remove(customer)
    }

    fun getCustomers() : MutableList<String> {
        return customers
    }
}