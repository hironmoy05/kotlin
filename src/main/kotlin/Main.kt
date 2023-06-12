import java.util.Arrays

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

    var a: Int = 5;

    println(6 + ++a);
    println(6 + a);

}

