package com.littlelemon.tablemanagement.fake

class FakeMilkFrother : MilkFrother {

    override fun getMilk(): String {
        return "hot milk"
    }
}