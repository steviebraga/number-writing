package dev.stevie.numberwriting

import java.math.BigDecimal
import java.util.concurrent.atomic.DoubleAdder
import kotlin.math.pow

class NumberWriter {

    private val decimalNumberTypes = listOf(Float::class, Double::class, BigDecimal::class, DoubleAdder::class)

    private val tensFromTwoToNineRange = 20..99
    private val hundredsRange = 100..999

    private val unitsNamesMap = mapOf(
        0L to "zero", 1L to "um", 2L to "dois", 3L to "três", 4L to "quatro",
        5L to "cinco", 6L to "seis", 7L to "sete", 8L to "oito", 9L to "nove"
    )
    private val tensOfOneNamesMap = mapOf(
        10L to "dez", 11L to "onze", 12L to "doze", 13L to "treze", 14L to "catorze", 15L to "quinze",
        16L to "dezesseis", 17L to "dezessete", 18L to "dezoito", 19L to "dezenove"
    )
    private val tensFromTwoToNineNamesMap = mapOf(
        2L to "vinte", 3L to "trinta", 4L to "quarenta", 5L to "cinquenta",
        6L to "sessenta", 7L to "setenta", 8L to "oitenta", 9L to "noventa"
    )
    private val hundredsNamesMap = mapOf(
        0L to "cem", 1L to "cento", 2L to "duzentos", 3L to "trezentos", 4L to "quatrocentos",
        5L to "quinhentos", 6L to "seiscentos", 7L to "setecentos", 8L to "oitocentos", 9L to "novecentos"
    )
    private val singularTenBasedNamesMap = mapOf(
        3 to "mil", 6 to "milhão", 9 to "bilhão", 12 to "trilhão", 15 to "quatrilhão", 18 to "quintilhão"
    )
    private val pluralTenBasedNamesMap = mapOf(
        3 to "mil", 6 to "milhões", 9 to "bilhões", 12 to "trilhões", 15 to "quatrilhões", 18 to "quintilhões"
    )

    fun writeNumber(number: Number): String {
        return if (number::class in decimalNumberTypes) {
            val numberParts = String.format("%.2f", number).split(",").map { it.toLong() }
            var numberName = "${getIntegerNumberName(numberParts[0])} ${getCurrencyString(numberParts[0])}"
            if (numberParts[1] > 0)
                numberName = numberName.plus(" e ${getIntegerNumberName(numberParts[1])} ${getCentsString(numberParts[1])}")
            numberName
        } else {
            "${getIntegerNumberName(number.toLong())} ${getCurrencyString(number.toLong())}"
        }
    }

    private fun getIntegerNumberName(number: Long): String {
        return when (number) {
            in unitsNamesMap.keys -> unitsNamesMap[number]!!
            in tensOfOneNamesMap.keys -> tensOfOneNamesMap[number]!!
            in tensFromTwoToNineRange -> getTenBasedName(number, tensFromTwoToNineNamesMap)
            in hundredsRange -> getTenBasedName(number, hundredsNamesMap)
            else -> getTenBasedName(number)
        }
    }

    private fun getCurrencyString(number: Long) = if (number > 1) "reais" else "real"

    private fun getCentsString(number: Long) = if (number > 1) "centavos" else "centavo"

    private fun getTenBasedName(number: Long, namesMap: Map<Long, String> = emptyMap()): String {
        var power = number.toString().length - 1
        if (power > 2) power = (power / 3) * 3
        val baseTen = 10.toDouble().pow(power).toLong()
        val baseNumber = number / baseTen
        val firstNumber = baseNumber * baseTen

        return when (power) {
            in 1..2 -> {
                val baseName = if (number == 100L) namesMap[0L] else namesMap[baseNumber]
                if (number == firstNumber) baseName!! else "$baseName e ${getIntegerNumberName(number - firstNumber)}"
            }
            else -> {
                val baseName = if (baseNumber > 1) pluralTenBasedNamesMap[power] else singularTenBasedNamesMap[power]
                val difference = number - firstNumber
                var numberString = "${getIntegerNumberName(baseNumber)} $baseName"
                if ((difference == 0L) && (power >= 6)) numberString = "$numberString de"
                if (difference > 0) numberString = "$numberString e ${getIntegerNumberName(difference)}"
                numberString
            }
        }
    }

}