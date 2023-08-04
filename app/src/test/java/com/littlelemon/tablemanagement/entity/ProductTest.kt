package com.littlelemon.tablemanagement.entity

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ProductTest {

    private lateinit var product: Product

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
        product = Product()
    }

    private fun spaghettiTest() {
        product = Product(price = 20.00, amount = 3)
    }

    private fun waterTest() {
        product = Product(price = 30.0, amount = 8)
    }

    @Test
    fun applyDiscountSpaghetti() {

        // arrange
        spaghettiTest()

        // act
        val result = product.applyDiscount(discountPercent = 20)

        //assert
        Assert.assertEquals(4.00, result, 0.01)

    }

    @Test
    fun applyDiscountWater() {
        // arrange
        waterTest()

        // act
        val result = product.applyDiscount(discountPercent = 20)

        // assert
        Assert.assertEquals(10.0, result, 0.01)
    }
}