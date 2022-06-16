package dev.stevie.numberwriting

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.concurrent.atomic.DoubleAdder

internal class NumberWriterDecimalTest {

    private val numberWriter = NumberWriter()

    @Test
    fun `Test write numbers in different types`() {
        val oneAndTen = 1.1F
        assertEquals("um real e dez centavos", numberWriter.writeNumber(oneAndTen))
        assertEquals("um real e dez centavos", numberWriter.writeNumber(oneAndTen.toDouble()))
        assertEquals("um real e dez centavos", numberWriter.writeNumber(oneAndTen.toBigDecimal()))

        val doubleAdder = DoubleAdder()
        doubleAdder.add(oneAndTen.toDouble())
        assertEquals("um real e dez centavos", numberWriter.writeNumber(doubleAdder))
    }

    @Test
    fun `Test write units cents`() {
        assertEquals("um real", numberWriter.writeNumber(1.00))
        assertEquals("um real e um centavo", numberWriter.writeNumber(1.01))
        assertEquals("um real e dois centavos", numberWriter.writeNumber(1.02))
        assertEquals("um real e três centavos", numberWriter.writeNumber(1.03))
        assertEquals("um real e quatro centavos", numberWriter.writeNumber(1.04))
        assertEquals("um real e cinco centavos", numberWriter.writeNumber(1.05))
        assertEquals("um real e seis centavos", numberWriter.writeNumber(1.06))
        assertEquals("um real e sete centavos", numberWriter.writeNumber(1.07))
        assertEquals("um real e oito centavos", numberWriter.writeNumber(1.08))
        assertEquals("um real e nove centavos", numberWriter.writeNumber(1.09))
    }

    @Test
    fun `Test write tensOfOne cents`() {
        assertEquals("dez reais e dez centavos", numberWriter.writeNumber(10.1))
        assertEquals("dez reais e dez centavos", numberWriter.writeNumber(10.10))
        assertEquals("dez reais e onze centavos", numberWriter.writeNumber(10.11))
        assertEquals("dez reais e doze centavos", numberWriter.writeNumber(10.12))
        assertEquals("dez reais e treze centavos", numberWriter.writeNumber(10.13))
        assertEquals("dez reais e catorze centavos", numberWriter.writeNumber(10.14))
        assertEquals("dez reais e quinze centavos", numberWriter.writeNumber(10.15))
        assertEquals("dez reais e dezesseis centavos", numberWriter.writeNumber(10.16))
        assertEquals("dez reais e dezessete centavos", numberWriter.writeNumber(10.17))
        assertEquals("dez reais e dezoito centavos", numberWriter.writeNumber(10.18))
        assertEquals("dez reais e dezenove centavos", numberWriter.writeNumber(10.19))
    }

    @Test
    fun `Test write tensFromTwoToNine`() {
        assertEquals("vinte reais e vinte centavos", numberWriter.writeNumber(20.2))
        assertEquals("vinte reais e vinte centavos", numberWriter.writeNumber(20.20))
        assertEquals("vinte reais e trinta centavos", numberWriter.writeNumber(20.30))
        assertEquals("vinte reais e quarenta centavos", numberWriter.writeNumber(20.40))
        assertEquals("vinte reais e cinquenta centavos", numberWriter.writeNumber(20.50))
        assertEquals("vinte reais e sessenta centavos", numberWriter.writeNumber(20.60))
        assertEquals("vinte reais e setenta centavos", numberWriter.writeNumber(20.70))
        assertEquals("vinte reais e oitenta centavos", numberWriter.writeNumber(20.80))
        assertEquals("vinte reais e noventa centavos", numberWriter.writeNumber(20.90))

        assertEquals("vinte reais e vinte e um centavos", numberWriter.writeNumber(20.21))
        assertEquals("vinte reais e trinta e dois centavos", numberWriter.writeNumber(20.32))
        assertEquals("vinte reais e quarenta e três centavos", numberWriter.writeNumber(20.43))
        assertEquals("vinte reais e cinquenta e quatro centavos", numberWriter.writeNumber(20.54))
        assertEquals("vinte reais e sessenta e cinco centavos", numberWriter.writeNumber(20.65))
        assertEquals("vinte reais e setenta e seis centavos", numberWriter.writeNumber(20.76))
        assertEquals("vinte reais e oitenta e sete centavos", numberWriter.writeNumber(20.87))
        assertEquals("vinte reais e noventa e oito centavos", numberWriter.writeNumber(20.98))
    }

    @Test
    fun `Test write cents over 2 digits`() {
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.12))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.123))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.1234))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.12345))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.123456))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.1234567))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.12345678))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.123456789))
        assertEquals("cem reais e doze centavos", numberWriter.writeNumber(100.1234567890))
    }

}