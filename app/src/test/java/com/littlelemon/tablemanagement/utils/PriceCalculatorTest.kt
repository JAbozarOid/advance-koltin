package com.littlelemon.tablemanagement.utils

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PriceCalculatorTest {

    private lateinit var classUnderTest: PriceCalculator
    private var item1Price: Double = 0.0
    private var item2Price: Double = 0.0
    private var taxRate : Double = 0.0

    /**
     * before each test method run
     */
    @Before
    fun setUp() {
        classUnderTest = PriceCalculator()
        item1Price = 5.0
        item2Price = 7.0
        taxRate = 0.15
    }

    /**
     * after each test method run
     */
    @After
    fun tearDown() {
        item1Price = 0.0
        item2Price = 0.0
        taxRate = 0.0
    }

    @Test
    fun calculatePrice() {

        // arrange + act
        val result = classUnderTest.calculatePrice(
            item1Price = item1Price,
            item2Price = item2Price,
            taxRate = taxRate
        )

        // To validate the results expected, I add an assertion
        // Because I'm working with decimals, 0.001 is the acceptable error margin with delta
        Assert.assertEquals(13.8,result,0.01)
    }
}