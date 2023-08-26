package com.littlelemon.tablemanagement.lambda

class LambdaClass {

    // using lambda expression to define functions as objects
    // 1- we declare in this way or like number 2-
    val taxCalculator: (Double, Double) -> Double = { price: Double, taxRate: Double ->
        price * taxRate
    }

    // 2- other way of declaring lambda expression
    val taxCalculator2 = { price: Double, taxRate: Double ->
        price * taxRate
    }

    //declaring lambda expression as extension function
    val taxCalculator3: Double.(Double) -> Double = { taxRate: Double -> this * taxRate }
}