package com.littlelemon.tablemanagement.mock

import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.willReturn
import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify


@RunWith(JUnit4::class)
class IceCreamMachineTest {

    private lateinit var classUnderTest: IceCreamMachine
    private lateinit var mockEngine: Engine
    private lateinit var mockEngineConfig: EngineConfig

    @Before
    fun setup() {
        mockEngine = mock(Engine::class.java)
        mockEngineConfig = EngineConfig()
        classUnderTest = IceCreamMachine(engine = mockEngine)
    }

    @After
    fun tearDown() {

    }

    @Test
    fun start() {
        mockEngineConfig.isEngineWorks = {false}
        given {
            classUnderTest.start()
        }.willAnswer { "the method is false" }
    }

    @Test
    fun voltage() {
        given { classUnderTest.getVoltage() }.willReturn { "100" }
    }
}