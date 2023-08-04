package com.littlelemon.tablemanagement.mock

class IceCreamMachine(private val engine: Engine) {

    fun start(): String {
        return if (engine.isPowerUp()) {
            "the method is true"
        } else {
            "the method is false"
        }
    }

    fun getVoltage() : String = engine.getVoltage()

}