package dev.stevie.numberwriting

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NumberWriterIntegerTest {

    private val numberWriter = NumberWriter()

    @Test
    fun `Test write numbers in different types`() {
        val one = 1L
        assertEquals("um real", numberWriter.writeNumber(one.toByte()))
        assertEquals("um real", numberWriter.writeNumber(one.toShort()))
        assertEquals("um real", numberWriter.writeNumber(one.toInt()))
        assertEquals("um real", numberWriter.writeNumber(one))
    }

    @Test
    fun `Test write units`() {
        assertEquals("zero real", numberWriter.writeNumber(0))
        assertEquals("um real", numberWriter.writeNumber(1))
        assertEquals("dois reais", numberWriter.writeNumber(2))
        assertEquals("três reais", numberWriter.writeNumber(3))
        assertEquals("quatro reais", numberWriter.writeNumber(4))
        assertEquals("cinco reais", numberWriter.writeNumber(5))
        assertEquals("seis reais", numberWriter.writeNumber(6))
        assertEquals("sete reais", numberWriter.writeNumber(7))
        assertEquals("oito reais", numberWriter.writeNumber(8))
        assertEquals("nove reais", numberWriter.writeNumber(9))
    }

    @Test
    fun `Test write tensOfOne`() {
        assertEquals("dez reais", numberWriter.writeNumber(10))
        assertEquals("onze reais", numberWriter.writeNumber(11))
        assertEquals("doze reais", numberWriter.writeNumber(12))
        assertEquals("treze reais", numberWriter.writeNumber(13))
        assertEquals("catorze reais", numberWriter.writeNumber(14))
        assertEquals("quinze reais", numberWriter.writeNumber(15))
        assertEquals("dezesseis reais", numberWriter.writeNumber(16))
        assertEquals("dezessete reais", numberWriter.writeNumber(17))
        assertEquals("dezoito reais", numberWriter.writeNumber(18))
        assertEquals("dezenove reais", numberWriter.writeNumber(19))
    }

    @Test
    fun `Test write tensFromTwoToNine`() {
        assertEquals("vinte reais", numberWriter.writeNumber(20))
        assertEquals("trinta reais", numberWriter.writeNumber(30))
        assertEquals("quarenta reais", numberWriter.writeNumber(40))
        assertEquals("cinquenta reais", numberWriter.writeNumber(50))
        assertEquals("sessenta reais", numberWriter.writeNumber(60))
        assertEquals("setenta reais", numberWriter.writeNumber(70))
        assertEquals("oitenta reais", numberWriter.writeNumber(80))
        assertEquals("noventa reais", numberWriter.writeNumber(90))
        assertEquals("vinte e um reais", numberWriter.writeNumber(21))
        assertEquals("trinta e dois reais", numberWriter.writeNumber(32))
        assertEquals("quarenta e três reais", numberWriter.writeNumber(43))
        assertEquals("cinquenta e quatro reais", numberWriter.writeNumber(54))
        assertEquals("sessenta e cinco reais", numberWriter.writeNumber(65))
        assertEquals("setenta e seis reais", numberWriter.writeNumber(76))
        assertEquals("oitenta e sete reais", numberWriter.writeNumber(87))
        assertEquals("noventa e oito reais", numberWriter.writeNumber(98))
    }

    @Test
    fun `Test write hundreds`() {
        assertEquals("cem reais", numberWriter.writeNumber(100))
        assertEquals("duzentos reais", numberWriter.writeNumber(200))
        assertEquals("trezentos reais", numberWriter.writeNumber(300))
        assertEquals("quatrocentos reais", numberWriter.writeNumber(400))
        assertEquals("quinhentos reais", numberWriter.writeNumber(500))
        assertEquals("seiscentos reais", numberWriter.writeNumber(600))
        assertEquals("setecentos reais", numberWriter.writeNumber(700))
        assertEquals("oitocentos reais", numberWriter.writeNumber(800))
        assertEquals("novecentos reais", numberWriter.writeNumber(900))
        assertEquals("cento e dez reais", numberWriter.writeNumber(110))
        assertEquals("duzentos e vinte reais", numberWriter.writeNumber(220))
        assertEquals("trezentos e trinta reais", numberWriter.writeNumber(330))
        assertEquals("quatrocentos e quarenta reais", numberWriter.writeNumber(440))
        assertEquals("quinhentos e cinquenta reais", numberWriter.writeNumber(550))
        assertEquals("seiscentos e sessenta reais", numberWriter.writeNumber(660))
        assertEquals("setecentos e setenta reais", numberWriter.writeNumber(770))
        assertEquals("oitocentos e oitenta reais", numberWriter.writeNumber(880))
        assertEquals("novecentos e noventa reais", numberWriter.writeNumber(990))
        assertEquals("cento e um reais", numberWriter.writeNumber(101))
        assertEquals("cento e dezenove reais", numberWriter.writeNumber(119))
        assertEquals("cento e vinte e três reais", numberWriter.writeNumber(123))
        assertEquals("duzentos e trinta e quatro reais", numberWriter.writeNumber(234))
        assertEquals("trezentos e quarenta e cinco reais", numberWriter.writeNumber(345))
        assertEquals("quatrocentos e cinquenta e seis reais", numberWriter.writeNumber(456))
        assertEquals("quinhentos e sessenta e sete reais", numberWriter.writeNumber(567))
        assertEquals("seiscentos e setenta e oito reais", numberWriter.writeNumber(678))
        assertEquals("setecentos e oitenta e nove reais", numberWriter.writeNumber(789))
        assertEquals("oitocentos e noventa e um reais", numberWriter.writeNumber(891))
        assertEquals("novecentos e um reais", numberWriter.writeNumber(901))
        assertEquals("novecentos e vinte e um reais", numberWriter.writeNumber(921))
        assertEquals("novecentos e noventa e nove reais", numberWriter.writeNumber(999))
    }

    @Test
    fun `Test write thousands`() {
        assertEquals("um mil reais", numberWriter.writeNumber(1_000))
        assertEquals("um mil e dois reais", numberWriter.writeNumber(1_002))
        assertEquals("dois mil e treze reais", numberWriter.writeNumber(2_013))
        assertEquals("dois mil e trinta e quatro reais", numberWriter.writeNumber(2_034))
        assertEquals("três mil e quatrocentos e cinquenta e seis reais", numberWriter.writeNumber(3_456))
        assertEquals("cinco mil e setecentos reais", numberWriter.writeNumber(5_700))
        assertEquals("nove mil e novecentos e noventa e nove reais", numberWriter.writeNumber(9_999))
        assertEquals("dez mil reais", numberWriter.writeNumber(10_000))
        assertEquals("dez mil e oito reais", numberWriter.writeNumber(10_008))
        assertEquals("vinte e um mil e setenta e oito reais", numberWriter.writeNumber(21_078))
        assertEquals("trinta e quatro mil e quinhentos e sessenta e sete reais", numberWriter.writeNumber(34_567))
        assertEquals("setecentos e oitenta e nove mil e três reais", numberWriter.writeNumber(789_003))
        assertEquals("oitocentos e noventa mil e quarenta e oito reais", numberWriter.writeNumber(890_048))
        assertEquals(
            "quatrocentos e cinquenta e seis mil e setecentos e oitenta e nove reais",
            numberWriter.writeNumber(456_789)
        )
        assertEquals(
            "novecentos e noventa e nove mil e novecentos e noventa e nove reais",
            numberWriter.writeNumber(999_999)
        )
    }

    @Test
    fun `Test write millions`() {
        assertEquals("um milhão de reais", numberWriter.writeNumber(1_000_000))
        assertEquals("doze milhões de reais", numberWriter.writeNumber(12_000_000))
        assertEquals("um milhão e dois reais", numberWriter.writeNumber(1_000_002))
        assertEquals("dois milhões e trinta e quatro reais", numberWriter.writeNumber(2_000_034))
        assertEquals("três milhões e quatrocentos e cinquenta e seis reais", numberWriter.writeNumber(3_000_456))
        assertEquals(
            "quatro milhões e cinco mil e seiscentos e setenta e oito reais",
            numberWriter.writeNumber(4_005_678)
        )
        assertEquals("quatro milhões e um mil e seiscentos e setenta e oito reais", numberWriter.writeNumber(4_001_678))
        assertEquals(
            "cinco milhões e cinquenta e seis mil e setecentos e oitenta e nove reais",
            numberWriter.writeNumber(5_056_789)
        )
        assertEquals("seis milhões e setecentos e oitenta e nove mil e doze reais", numberWriter.writeNumber(6_789_012))
        assertEquals(
            "setenta e oito milhões e novecentos e um mil e duzentos e trinta e quatro reais",
            numberWriter.writeNumber(78_901_234)
        )
        assertEquals(
            "setecentos e oitenta e nove milhões e doze mil e trezentos e quarenta e cinco reais",
            numberWriter.writeNumber(789_012_345)
        )
        assertEquals(
            "novecentos e noventa e nove milhões e novecentos e noventa e nove mil e novecentos e noventa e nove reais",
            numberWriter.writeNumber(999_999_999)
        )
    }

    @Test
    fun `test write billions`() {
        assertEquals("um bilhão de reais", numberWriter.writeNumber(1_000_000_000))
        assertEquals("cinquenta bilhões de reais", numberWriter.writeNumber(50_000_000_000))
        assertEquals("um bilhão e dois reais", numberWriter.writeNumber(1_000_000_002))
        assertEquals("dois bilhões e trinta e quatro reais", numberWriter.writeNumber(2_000_000_034))
        assertEquals("três bilhões e quatrocentos e cinquenta e seis reais", numberWriter.writeNumber(3_000_000_456))
        assertEquals(
            "quatro bilhões e cinco mil e seiscentos e setenta e oito reais",
            numberWriter.writeNumber(4_000_005_678)
        )
        assertEquals(
            "cinco bilhões e sessenta e sete mil e oitocentos e noventa reais",
            numberWriter.writeNumber(5_000_067_890)
        )
        assertEquals(
            "seis bilhões e setecentos e oitenta e nove mil e doze reais",
            numberWriter.writeNumber(6_000_789_012)
        )
        assertEquals(
            "sete bilhões e oito milhões e novecentos e um mil e duzentos e trinta e quatro reais",
            numberWriter.writeNumber(7_008_901_234)
        )
        assertEquals(
            "sete bilhões e um milhão e novecentos e um mil e duzentos e trinta e quatro reais",
            numberWriter.writeNumber(7_001_901_234)
        )
        assertEquals(
            "oito bilhões e noventa milhões e cento e vinte e três mil e quatrocentos e cinquenta e seis reais",
            numberWriter.writeNumber(8_090_123_456)
        )
        assertEquals(
            "nove bilhões e doze milhões e trezentos e quarenta e cinco mil e seiscentos e setenta e oito reais",
            numberWriter.writeNumber(9_012_345_678)
        )
        assertEquals(
            "dez bilhões e cento e vinte e três milhões e quatrocentos e cinquenta e seis mil e setecentos e oitenta e nove reais",
            numberWriter.writeNumber(10_123_456_789)
        )
        assertEquals(
            "duzentos e trinta e quatro bilhões e quinhentos e sessenta e sete milhões e oitocentos e noventa mil " +
                    "e cento e vinte e três reais",
            numberWriter.writeNumber(234_567_890_123)
        )
    }

    @Test
    fun `test write trillions`() {
        assertEquals("um trilhão de reais", numberWriter.writeNumber(1_000_000_000_000))
        assertEquals("vinte trilhões de reais", numberWriter.writeNumber(20_000_000_000_000))
        assertEquals("dois trilhões e trinta e quatro reais", numberWriter.writeNumber(2_000_000_000_034))
        assertEquals(
            "três trilhões e quatrocentos e cinquenta e seis reais",
            numberWriter.writeNumber(3_000_000_000_456)
        )
        assertEquals(
            "quatro trilhões e cinco mil e seiscentos e setenta e oito reais",
            numberWriter.writeNumber(4_000_000_005_678)
        )
        assertEquals(
            "cinco trilhões e seis mil e setecentos e oitenta e nove reais",
            numberWriter.writeNumber(5_000_000_006_789)
        )
        assertEquals(
            "seis trilhões e setenta e oito mil e novecentos e um reais",
            numberWriter.writeNumber(6_000_000_078_901)
        )
        assertEquals(
            "sete trilhões e oitocentos e noventa mil e cento e vinte e três reais",
            numberWriter.writeNumber(7_000_000_890_123)
        )
        assertEquals(
            "oito trilhões e nove milhões e doze mil e trezentos e quarenta e cinco reais",
            numberWriter.writeNumber(8_000_009_012_345)
        )
        assertEquals(
            "nove trilhões e um milhão e duzentos e trinta e quatro mil e quinhentos e sessenta e sete reais",
            numberWriter.writeNumber(9_000_001_234_567)
        )
        assertEquals(
            "dez trilhões e vinte e três milhões e quatrocentos e cinquenta e seis mil e setecentos e oitenta e nove reais",
            numberWriter.writeNumber(10_000_023_456_789)
        )
        assertEquals(
            "duzentos e trinta e quatro trilhões e quinhentos e sessenta e sete milhões e oitocentos e noventa mil e " +
                    "cento e vinte e três reais",
            numberWriter.writeNumber(234_000_567_890_123)
        )
        assertEquals(
            "trezentos e quarenta e cinco trilhões e seis bilhões e setecentos e oitenta e nove milhões e doze mil " +
                    "e trezentos e quarenta e cinco reais",
            numberWriter.writeNumber(345_006_789_012_345)
        )
        assertEquals(
            "quatrocentos e cinquenta e seis trilhões e setenta e oito bilhões e novecentos e um milhões e " +
                    "duzentos e trinta e quatro mil e quinhentos e sessenta e sete reais",
            numberWriter.writeNumber(456_078_901_234_567)
        )
        assertEquals(
            "quinhentos e sessenta e sete trilhões e oitocentos e noventa bilhões e cento e vinte e três milhões e " +
                    "quatrocentos e cinquenta e seis mil e setecentos e oitenta e nove reais",
            numberWriter.writeNumber(567_890_123_456_789)
        )
    }

    @Test
    fun `test write quadrillions`() {
        assertEquals("um quatrilhão de reais", numberWriter.writeNumber(1_000_000_000_000_000))
        assertEquals("doze quatrilhões de reais", numberWriter.writeNumber(12_000_000_000_000_000))
        assertEquals("um quatrilhão e dois reais", numberWriter.writeNumber(1_000_000_000_000_002))
        assertEquals("dois quatrilhões e trinta e quatro reais", numberWriter.writeNumber(2_000_000_000_000_034))
        assertEquals(
            "três quatrilhões e quatrocentos e cinquenta e seis reais",
            numberWriter.writeNumber(3_000_000_000_000_456)
        )
        assertEquals(
            "quatro quatrilhões e quatro mil e quinhentos e trinta e três reais",
            numberWriter.writeNumber(4_000_000_000_004_533)
        )
        assertEquals(
            "cinco quatrilhões e vinte e um mil e setecentos e oitenta reais",
            numberWriter.writeNumber(5_000_000_000_021_780)
        )
        assertEquals(
            "seis quatrilhões e setecentos e cinquenta e três mil e setecentos e quarenta e seis reais",
            numberWriter.writeNumber(6_000_000_000_753_746)
        )
        assertEquals(
            "sete quatrilhões e quatro milhões e oitocentos e trinta e seis mil e seiscentos e quarenta e três reais",
            numberWriter.writeNumber(7_000_000_004_836_643)
        )
        assertEquals(
            "oito quatrilhões e cinquenta e sete milhões e quinhentos e vinte e dois mil e duzentos e vinte e três reais",
            numberWriter.writeNumber(8_000_000_057_522_223)
        )
        assertEquals(
            "nove quatrilhões e trezentos e cinquenta milhões e setecentos e quarenta e cinco mil e oitocentos e cinquenta e seis reais",
            numberWriter.writeNumber(9_000_000_350_745_856)
        )
        assertEquals(
            "dez quatrilhões e dois bilhões e setecentos e quarenta milhões e oitocentos e vinte e dois mil e trinta e quatro reais",
            numberWriter.writeNumber(10_000_002_740_822_034)
        )
        assertEquals(
            "duzentos e trinta e três quatrilhões e setenta e seis bilhões e quinhentos e quarenta e oito milhões e " +
                    "duzentos e trinta e quatro mil e trinta e quatro reais",
            numberWriter.writeNumber(233_000_076_548_234_034)
        )
        assertEquals(
            "oitocentos e quarenta e seis quatrilhões e quatrocentos e dez bilhões e seiscentos e cinquenta e cinco milhões e " +
                    "setecentos e trinta e oito mil e trinta e quatro reais",
            numberWriter.writeNumber(846_000_410_655_738_034)
        )
        assertEquals(
            "setecentos e sessenta e três quatrilhões e oito trilhões e oitocentos e trinta e oito bilhões e " +
                    "trezentos e dois milhões e seiscentos e setenta e sete mil e trinta e quatro reais",
            numberWriter.writeNumber(763_008_838_302_677_034)
        )
        assertEquals(
            "trezentos e oitenta e três quatrilhões e quarenta e três trilhões e setecentos e seis bilhões e " +
                    "trezentos e trinta milhões e novecentos e sessenta e três mil e trinta e quatro reais",
            numberWriter.writeNumber(383_043_706_330_963_034)
        )
        assertEquals(
            "novecentos e quarenta quatrilhões e novecentos e oitenta e sete trilhões e duzentos e trinta bilhões e " +
                    "quinhentos e trinta e cinco milhões e duzentos e setenta e nove mil e trinta e quatro reais",
            numberWriter.writeNumber(940_987_230_535_279_034)
        )
    }

    @Test
    fun `test write quintillion`() {
        assertEquals("um quintilhão de reais", numberWriter.writeNumber(1_000_000_000_000_000_000))
        assertEquals("dois quintilhões de reais", numberWriter.writeNumber(2_000_000_000_000_000_000))
        assertEquals("três quintilhões e dois reais", numberWriter.writeNumber(3_000_000_000_000_000_002))
        assertEquals("quatro quintilhões e sessenta e dois reais", numberWriter.writeNumber(4_000_000_000_000_000_062))
        assertEquals("cinco quintilhões e duzentos e dois reais", numberWriter.writeNumber(5_000_000_000_000_000_202))
        assertEquals(
            "seis quintilhões e oito mil e setecentos e cinquenta e um reais",
            numberWriter.writeNumber(6_000_000_000_000_008_751)
        )
        assertEquals(
            "sete quintilhões e vinte e nove mil e duzentos e quarenta e cinco reais",
            numberWriter.writeNumber(7_000_000_000_000_029_245)
        )
        assertEquals(
            "oito quintilhões e oitocentos e sessenta e um mil e quatrocentos e cinquenta e seis reais",
            numberWriter.writeNumber(8_000_000_000_000_861_456)
        )
        assertEquals(
            "sete quintilhões e um milhão e oitocentos e vinte e dois mil e novecentos e cinquenta e dois reais",
            numberWriter.writeNumber(7_000_000_000_001_822_952)
        )
        assertEquals(
            "seis quintilhões e trinta e nove milhões e novecentos e treze mil e quinhentos e cinquenta e dois reais",
            numberWriter.writeNumber(6_000_000_000_039_913_552)
        )
        assertEquals(
            "cinco quintilhões e quatrocentos e um milhões e novecentos e setenta e nove mil e novecentos e dez reais",
            numberWriter.writeNumber(5_000_000_000_401_979_910)
        )
        assertEquals(
            "quatro quintilhões e um bilhão e setecentos e quarenta e um milhões e novecentos e setenta e dois mil e " +
                    "quatrocentos e quarenta e um reais", numberWriter.writeNumber(4_000_000_001_741_972_441)
        )
        assertEquals(
            "três quintilhões e onze bilhões e oitocentos e cinquenta e dois milhões e cento e nove mil e " +
                    "duzentos e trinta e quatro reais", numberWriter.writeNumber(3_000_000_011_852_109_234)
        )
        assertEquals(
            "dois quintilhões e oitocentos e dezessete bilhões e novecentos e sessenta e três milhões e " +
                    "seiscentos e oito mil e oitocentos e cinco reais",
            numberWriter.writeNumber(2_000_000_817_963_608_805)
        )
        assertEquals(
            "um quintilhão e três trilhões e novecentos e dezoito bilhões e cento e dois milhões e " +
                    "quatrocentos e setenta e cinco mil e oitocentos e cinco reais",
            numberWriter.writeNumber(1_000_003_918_102_475_805)
        )
        assertEquals(
            "dois quintilhões e oitenta e dois trilhões e oitocentos e vinte e sete bilhões e duzentos e noventa e três milhões e " +
                    "setecentos e cinquenta e seis mil e oitocentos e cinco reais",
            numberWriter.writeNumber(2_000_082_827_293_756_805)
        )
        assertEquals(
            "três quintilhões e oitocentos e trinta e um trilhões e setecentos e trinta e seis bilhões e " +
                    "trezentos e oitenta e quatro milhões e dezenove mil e oitocentos e cinco reais",
            numberWriter.writeNumber(3_000_831_736_384_019_805)
        )

        assertEquals(
            "quatro quintilhões e cinco quatrilhões e cento e dois trilhões e duzentos e oitenta e três bilhões e " +
                    "setecentos e quarenta e um milhões e novecentos e oitenta e sete mil e novecentos e oitenta e cinco reais",
            numberWriter.writeNumber(4_005_102_283_741_987_985)
        )
        assertEquals(
            "cinco quintilhões e cinquenta e um quatrilhões e dezenove trilhões e setecentos e trinta e seis bilhões e " +
                    "oitocentos e cinquenta e dois milhões e setecentos e cinquenta e três mil e quinhentos e sessenta e nove reais",
            numberWriter.writeNumber(5_051_019_736_852_753_569)
        )
        assertEquals(
            "seis quintilhões e quinhentos e vinte e sete quatrilhões e novecentos e vinte e oito trilhões e trezentos e oitenta e quatro bilhões e " +
                    "novecentos e sessenta e três milhões e novecentos e cinquenta e um mil e cento e vinte e cinco reais",
            numberWriter.writeNumber(6_527_928_384_963_951_125)
        )
        assertEquals(
            "nove quintilhões e duzentos e vinte e três quatrilhões e trezentos e setenta e dois trilhões e trinta e seis bilhões e " +
                    "oitocentos e cinquenta e quatro milhões e setecentos e setenta e cinco mil e oitocentos e sete reais",
            numberWriter.writeNumber(9_223_372_036_854_775_807)
        )
    }

}