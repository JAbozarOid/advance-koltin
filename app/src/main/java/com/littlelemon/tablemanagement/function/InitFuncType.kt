package com.littlelemon.tablemanagement.function

class InitFuncType {

    private val numberList = mutableListOf(1, 2, 3)

    init {

    }

    // 1- using lambda
    val initFuncLambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    // 2- anonymous function
    fun initFuncAnon(i: Int): Int {
        return i * 2
    }

    // 3- callable references
    fun multipleBy2(i: Int): Int {
        return i * 2
    }

    // 3- continue of 3...
    fun callMultipleWithMap() {
        println(::multipleBy2)
    }

    // invoking function type instance
    fun invokeFuncType() {
        // there are two ways to invoke
        // 1-
        initFuncLambda.invoke(2, 2)
        // 2-
        initFuncLambda(2, 2)
    }
}