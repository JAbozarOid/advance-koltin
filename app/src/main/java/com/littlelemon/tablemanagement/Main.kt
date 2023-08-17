package com.littlelemon.tablemanagement

import com.littlelemon.tablemanagement.collection.ListAndSetSample
import com.littlelemon.tablemanagement.entity.Dish
import com.littlelemon.tablemanagement.entity.Order
import com.littlelemon.tablemanagement.extension.printIngredients
import com.littlelemon.tablemanagement.extension.removeSalt


object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val order = Order(amountBeforeTax = 500)
        val netOrderAmount = Order.getNetOrderAmount(order.amountBeforeTax)

        println(netOrderAmount)

        val onionSoup =
            Dish(dishName = "Onion Soup", mutableListOf("Onion", "Cheese", "Water", "Salt"))
        onionSoup.removeSalt("Cheese")
        onionSoup.printIngredients()

        val callList = ListAndSetSample()
        print(callList.getList())
    }
}