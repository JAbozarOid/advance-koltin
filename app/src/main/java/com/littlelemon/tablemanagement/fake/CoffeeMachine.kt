package com.littlelemon.tablemanagement.fake

class CoffeeMachine(
    private val milkFrother: MilkFrother
) {

    fun makeCoffee() : String {
        return "Coffee with " + milkFrother.getMilk()
    }
}