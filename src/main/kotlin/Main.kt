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

    println(con.calculatePermutation(5, 2));
}

