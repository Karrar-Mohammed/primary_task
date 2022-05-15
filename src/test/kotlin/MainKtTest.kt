import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_returnPercentageOfA_whenCorrectListGiven() {
        //given
        val list = listOf("a", "b", "b")
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(33.3, result)
    }

    @Test
    fun should_returnPercentageOfA_whenAComeInTheEndOfTheList() {
        //given
        val list = listOf("b", "b", "b", "a")
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(25.0, result)
    }


    @Test
    fun should_return0_whenNoAInList() {
        //given
        val list = listOf("b", "b", "b")
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(0.0, result)
    }

    @Test
    fun should_returnMinus1_whenWrongListGiven() {
        //given
        val list = listOf("c", "ab", "d")
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(-1.0, result)
    }

    @Test
    fun should_returnMinus1_whenListContainWrongItem() {
        //given
        val list = listOf("a", "a", "b", "c", "a")
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(-1.0, result)
    }

    @Test
    fun should_returnMinus1_whenNumberInList() {
        //given
        val list = listOf("3", "4", "12")
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(-1.0, result)
    }

    @Test
    fun should_returnMinus1_whenEmptyListGiven() {
        //given
        val list = emptyList<String>()
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(-1.0, result)
    }

    @Test
    fun should_returnMinus1_whenMoreThanOneCharacterInOneItem() {
        //given
        val list = listOf("aaa", "bbb", "bbb")
        //when
        val result = calculatePercentageOfCharacterAInList(list)
        //then
        assertEquals(-1.0, result)
    }

}