// Variables, Basic types
fun main() {

    println("Hello World")
    println("This is my second kotlin program")

    val zenj = "Zenjutahi Njogu"
    val zenjsMath: Int = 75 * 10
    println(zenj)
    println(zenjsMath)

    println()

    val apples = 10
    val oranges = 3
    val sumOfFruit: Int = apples + oranges
    println("Average of the fruits is: ${sumOfFruit / 3}")

    // produces decimals when we use Double label
    val days = 141
    val weeks: Double = days / 7.0
    println("$days days in weeks is $weeks weeks" )

    println()
    println("My name is $zenj")

    // Working with Conditions
    println()
    println("Enter a life Number: ")
    val lives = readLine()!!.toInt()

    val isGameOver = (lives < 1)

    if (isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive")
    }

    val message: String
    message = when {
        lives < 18 -> "You're too young to vote"
        lives == 100 -> "Congratulations"
        else -> "You can vote!"
    }
    println(message)

}
