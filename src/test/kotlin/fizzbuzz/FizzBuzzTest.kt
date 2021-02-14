package fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

/**
 * @author Naoki Shibata
 */
internal class FizzBuzzTest {
    @TestFactory
    fun `入力値が3の倍数の場合、Fizzを返す`() = run {
        val cases = listOf(
            3,
            6
        )

        cases.map { case ->
            dynamicTest("入力値が${case}の場合、Fizzを返す") {
                assertThat(FizzBuzz.evaluate(case)).isEqualTo("Fizz")
            }
        }
    }

    @TestFactory
    fun `入力値が5の倍数の場合、Buzzを返す`() = run {
        val cases = listOf(
            5,
            10
        )

        cases.map { case ->
            dynamicTest("入力値が${case}の場合、Buzzを返す") {
                assertThat(FizzBuzz.evaluate(case)).isEqualTo("Buzz")
            }
        }
    }

    @TestFactory
    fun `入力値が3と5の倍数の場合、FizzBuzzを返す`() = run {
        val cases = listOf(
            15
        )

        cases.map { case ->
            dynamicTest("入力値が${case}の場合、FizzBuzzを返す") {
                assertThat(FizzBuzz.evaluate(case)).isEqualTo("FizzBuzz")
            }
        }
    }

    @TestFactory
    fun `それ以外の場合、数値を返す`() = run {
        val cases = listOf(
            1,
            2,
            4,
        )

        cases.map { case ->
            dynamicTest("入力値が${case}の場合、数値を返す") {
                assertThat(FizzBuzz.evaluate(case)).isEqualTo(case.toString())
            }
        }
    }
}
