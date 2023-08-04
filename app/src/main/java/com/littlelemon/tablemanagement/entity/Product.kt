package com.littlelemon.tablemanagement.entity

data class Product(
    val title : String = "",
    var price : Double = 0.0,
    val amount : Int = 0
) {

    fun applyDiscount(discountPercent : Int) : Double {
        return if (amount in 1..5) {
            (price * discountPercent / 100)
        }else {
            price
        }
    }
}
