import java.util.Scanner
import kotlin.math.pow

class Basics {
    //    Write a program to print whether a number is even or odd, also take input from the user.
    private val scanner: Scanner = Scanner(System.`in`);

    fun isEvenOrOdd() {
        print("Enter a number: ");
        val num: Int = scanner.nextInt();

        if (num % 2 == 0) {
            println("Even")
        };
        else {
        }
        println("Odd");
    }

    //    Take name as input and print a greeting message for that particular name.
    fun greeting() {
        print("Enter your name: ");
        val name: String = scanner.nextLine();

        println("Howdy $name");
    }

//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    fun simpleInterest () {
        val MONTHS_IN_YEAR: Byte = 12;
        val PERCENT: Byte = 100;

        print("Principal: ");
        val principal: Int = scanner.nextInt();

        print("Annual Interest Rate: ");
        val annualInterest: Float = scanner.nextFloat();
        val monthlyInterest: Float = annualInterest / MONTHS_IN_YEAR / PERCENT;

        print("Years: ");
        val years: Byte = scanner.nextByte();
        val numberOfPayments: Short = (years * MONTHS_IN_YEAR).toShort();

        val mortgage: Double = principal *
                ((monthlyInterest * (1 + monthlyInterest.toDouble()).pow(numberOfPayments.toDouble()))
                / ((1 + monthlyInterest.toDouble()).pow(numberOfPayments.toDouble()) - 1));

        println(String.format("%.2f", mortgage));
    }

//    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    fun calculate() {
        print("Enter first number: ");
        val num1: Int = scanner.nextInt();

        print("Enter second number: ")
        val num2: Int = scanner.nextInt();

        print("Enter a operator to calculate two number: ")
        val operator: String = scanner.next();

    when (operator) {
        "+" -> print(num1 + num2)
        "-" -> print(num1 - num2)
        "*" -> print(num1 * num2)
        "/" -> print(num1 / num2)
    };

//        if (operator == "+")
//            print(num1 + num2);
//        else if (operator == "-")
//            print(num1 - num2);
//        else if (operator == "*")
//            print(num1 * num2);
//        else if (operator == "/")
//            print(num1 / num2);
    }

//    Take 2 numbers as input and print the largest number.
    fun printLargestNumber() {
        print("Enter first number: ");
        val num1: Int = scanner.nextInt();

        print("Enter second number: ");
        val num2: Int = scanner.nextInt();

        if (num1 > num2)
            print(num1);
        else
            print(num2);
    }

//    Input currency in rupees and output in USD.
    fun convertRupeesToUsd() {
        print("Enter rupees: ");
        val rs: Int = scanner.nextInt();

        val dollar: Double = rs / 79.52;

        print("Rupees $rs,  ${String.format("%.2f", dollar)} USD");
    }

//    To calculate Fibonacci Series up to n numbers.
    fun fibonacci() {
        print("Enter a number: ");
        val num: Byte = scanner.nextByte();

        if (num <= 1) {
            print(num);
            return;
        }

        var first: Int = 0;
        var second: Int = 1;

        for (i in 2..num) {
            val temp = first + second;

            first = second;
            second = temp;
        }

        println(second);
    }

//    To find out whether the given String is Palindrome or not.
    fun isPalindrome(str: String): Boolean {
        var s: Int = 0;
        var e: Int = str.length - 1;

        while (s <= e) {
            if (str[s] != str[e])
                return false;

            s++;
            e--;
        }

        return true;
    }

//    To find Armstrong Number between two given number.
    fun isArmStrong(num: Int): Boolean {
        var n: Int = num;
        var sum: Int = 0;
        val digits = mutableListOf<Int>();

        while(n > 0) {
            val lastDigit: Int = n % 10;
            digits.add(lastDigit)
            n /= 10;
        }

        val p = digits.size;

//        while(n > 0) {
//            val lastDigit: Int = n % 10;
//            sum += (lastDigit.toDouble().pow(p.toDouble())).toInt();
//            n /= 10;
//        }

        sum = digits.map { it.toDouble().pow(p).toInt() }.sum()

        return num == sum;
    }
}
