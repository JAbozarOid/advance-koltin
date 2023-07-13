package com.littlelemon.tablemanagement.entity

class Order(val amountBeforeTax: Int) {

    companion object {
        private const val TAX_PERCENTAGE = 5

        fun getNetOrderAmount(orderAmount: Int): Double {
            return orderAmount + (orderAmount * TAX_PERCENTAGE / 100.0)
        }
    }

}