package com.littlelemon.tablemanagement.fake

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CoffeeMachineTest {

    lateinit var classUnderTest : CoffeeMachine
    lateinit var fakeMilkFrother: FakeMilkFrother

    @Before
    fun setUp() {
        /**
         * for instantiate Coffee machine class we need to have MilkFrother which is an interface
         * Fakes are simplified implementations of interfaces designed to support certain test scenarios
         */
        fakeMilkFrother = FakeMilkFrother() // this fake class implemented MilkFrother interface
        classUnderTest = CoffeeMachine(fakeMilkFrother)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun makeCoffee() {

        // arrange + act
        val result = classUnderTest.makeCoffee()

        // assert
        Assert.assertEquals("<<<The Result is>>> ","Coffee with hot milk",result)
    }
}