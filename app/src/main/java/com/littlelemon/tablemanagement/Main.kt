package com.littlelemon.tablemanagement

import com.littlelemon.tablemanagement.entity.Order


object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val order = Order(amountBeforeTax = 500)
        val netOrderAmount = Order.getNetOrderAmount(order.amountBeforeTax)

        println(netOrderAmount)
    }
}