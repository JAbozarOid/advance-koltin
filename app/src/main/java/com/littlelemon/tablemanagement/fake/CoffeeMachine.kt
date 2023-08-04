package com.littlelemon.tablemanagement.fake

class CoffeeMachine(
    private val milkFrother: MilkFrother
) {

    fun makeCoffee(): String {
        return try {
            if (milkFrother.getMilk().isNotBlank()) {
                "Coffee with " + milkFrother.getMilk()
            } else {
                "milk can not be empty"
            }
        } catch (e: Exception) {
            "an Exception happened"
        }

    }
}