package com.littlelemon.tablemanagement.mock

class EngineConfig {

    var isEngineWorks: () -> Boolean = { true }

    fun startEngine(): String {
        return if (isEngineWorks())
            "start"
        else
            "Engine not Start"
    }
}