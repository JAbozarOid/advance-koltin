package com.littlelemon.tablemanagement.fake

class FakeMilkFrother : MilkFrother {

    var getMilkLogic: () -> String = { "hot milk" }
    override fun getMilk(): String {
        return getMilkLogic()
    }
}