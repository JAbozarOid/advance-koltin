package com.littlelemon.tablemanagement

import com.littlelemon.tablemanagement.collection.ListAndSetSample
import com.littlelemon.tablemanagement.collection.MapSample
import com.littlelemon.tablemanagement.entity.Dish
import com.littlelemon.tablemanagement.entity.Order
import com.littlelemon.tablemanagement.extension.printIngredients
import com.littlelemon.tablemanagement.extension.removeSalt
import com.littlelemon.tablemanagement.lambda.LambdaClass


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

        val mapSample = MapSample()
        println("the map value is ${mapSample.getMap()}")

        val setSample = ListAndSetSample()
        println("the set value is ${setSample.getSet()}")

        val initLambda = LambdaClass()
        val callLambda = initLambda.taxCalculator.invoke(200.0, 15.0)
        println("show function as object $callLambda")

        val callLambda2 = initLambda.taxCalculator3.invoke(200.0, 15.0)
        println("show function as object $callLambda2")

    }
}