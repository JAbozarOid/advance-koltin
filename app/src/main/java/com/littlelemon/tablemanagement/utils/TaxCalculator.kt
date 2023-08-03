package com.littlelemon.tablemanagement.utils

import com.littlelemon.tablemanagement.entity.OrderItem

class TaxCalculator {

    companion object {
        private const val salesTaxPercentage: Double = 15.0

        fun getTaxAmountForOrderItems(orderItemList: List<OrderItem>): Double {
            var orderAmount = 0.00
            for (items in orderItemList) {
                orderAmount += items.price
            }
            return orderAmount * salesTaxPercentage / 100.0
        }
    }
}