package com.littlelemon.tablemanagement.mock

class Engine(private val engineConfig: EngineConfig) {

    fun isPowerUp(): Boolean {
        val engine = engineConfig.startEngine()
        return engine == "start"
    }

    fun getVoltage(): String = "100"
}