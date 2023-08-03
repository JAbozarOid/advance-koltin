package com.littlelemon.tablemanagement.utils

class PriceCalculator {

    /**
     * receive two items price before tax
     * ctrl + shift + t
     */
    fun calculatePrice(item1Price : Double, item2Price: Double,taxRate : Double) : Double {

        return (item1Price + item2Price) * (1.0 + taxRate)
    }
}