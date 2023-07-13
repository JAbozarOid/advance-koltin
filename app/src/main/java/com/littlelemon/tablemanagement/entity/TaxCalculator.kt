package com.littlelemon.tablemanagement.entity

class TaxCalculator {

    companion object {
        private const val salesTaxPercentage: Double = 15.0

        fun getTaxAmountForOrderItems(orderItemList: List<OrderItem>): Double {
            var orderAmount = 0.0
            for (items in orderItemList) {
                orderAmount = items.price
                orderAmount * salesTaxPercentage / 100
            }
            return orderAmount
        }
    }
}