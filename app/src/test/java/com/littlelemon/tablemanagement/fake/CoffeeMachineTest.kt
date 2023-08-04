package com.littlelemon.tablemanagement.fake

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CoffeeMachineTest {

    lateinit var classUnderTest: CoffeeMachine
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

        // arrange
        //set new variable for testing
        fakeMilkFrother.getMilkLogic = { "foam" }

        // maybe we want to throw an exception -> is exception handled in makeCoffee method of CoffeeMachine
        //fakeMilkFrother.getMilkLogic = { throw Exception() }

        // check empty is handled
        fakeMilkFrother.getMilkLogic = {" "}

        // act
        val result = classUnderTest.makeCoffee()

        // assert
        Assert.assertEquals("<<<The Result is>>> ", "Coffee with foam", result)

    }
}