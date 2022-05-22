import kotlin.math.*

fun main() {

}

fun calculatePercentageOfCharacterAInList(list: List<String>): Double {

    var characterACounter = 0

    if (list.isEmpty()) { return -1.0 }

        list.forEach {
            if (it != "a" && it != "b") {
                return -1.0
            } else if (it == "a") {
                characterACounter++
            }
        }

         return (characterACounter.toDouble() / list.size * 100).roundTo1Digit()

}


fun Double.roundTo1Digit(): Double = round(this * 10) / 10