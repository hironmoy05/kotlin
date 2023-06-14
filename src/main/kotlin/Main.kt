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

fun main(args: Array<String>) {
    val ba: Basics = Basics();
    val con: ConditionalLoops = ConditionalLoops();

    val nums: Array<Int> = arrayOf(85, 90, 95, 91, 93);
    con.calculateAverageMarks(nums);
}

