import kotlin.math.log10

fun factorial(number: Int): Int {
    if (number <= 1)
        return 1;

    return factorial(number - 1) * number
}

class Employee(
    val name: String,
    var position: String,
) {
    var label: String = "$name ($position)"
}

class Dog(val name: String) {
    var hunger: Int = 43;
    fun feed() {
        println("Feeding $name");
        hunger = 0;
    }
}

class Scores() {
    val totalScore: Int = 0;
    val personalBestScore: Int = 0;
    fun bestScore(totalScore: Int, currentScore: Int) {
        if (totalScore < currentScore)
            println(currentScore);
        else
            println(totalScore)
    }
}

class Player(
    private val name: String,
    private val surname: String,
) {
    var totalScore = 0
    var personalBestScore = 0
    fun fullName(): String {
        return "$name $surname";
    }
}

fun main(args: Array<String>) {
    val ba: Basics = Basics();
    val con: ConditionalLoops = ConditionalLoops();

    con.sumOfNegNumPosEvenOddNum();
}

