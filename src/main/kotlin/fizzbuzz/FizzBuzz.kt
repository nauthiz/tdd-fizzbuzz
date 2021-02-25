package fizzbuzz

/**
 * @author Naoki Shibata
 */
object FizzBuzz {
    fun evaluate(number: Int): String {
        return when {
            number % 15 == 0 -> "FizzBuzz"
            number % 3 == 0 -> "Fizz"
            number % 5 == 0 -> "Buzz"
            else -> return number.toString()
        }

    }
}
