import kotlin.math.*

fun main() {

}

fun calculatePercentageOfCharacterAInList(list: List<String>): Double {

    var characterACounter = 0
    var isValid = true

    return if (list.isNotEmpty()) {

        list.forEach {
            if (it != "a" && it != "b") {
                isValid = false
            } else if (it == "a") {
                characterACounter++
            }
        }

        if (isValid) {
            (characterACounter.toDouble() / list.size * 100).roundTo1Digit()
        } else -1.0

    } else -1.0

}


fun Double.roundTo1Digit(): Double = round(this * 10) / 10