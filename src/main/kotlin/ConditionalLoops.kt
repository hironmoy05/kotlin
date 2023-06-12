import java.util.Scanner

class ConditionalLoops {
    val scanner: Scanner = Scanner(System.`in`);

    // 1. Area Of Circle Java Program
    fun areaOfCircle(radius: Int) {
        val area: Float = (Math.PI * radius * radius).toFloat()

        println(area.toFloat())
    }

    // 2. Area of Triangle
    fun areaOfTriangle(base: Int, height: Int) {
        val area: Float = ((base * height) / 2).toFloat();

        println(area);
    }

    // 3. Area of rectangle
    fun areaOfRectangle(length: Int, width: Int) {
        val area: Float = (length * width).toFloat();

        val formattedArea: String = String.format("%.2f", area);
        println(formattedArea)
    }

    fun areaOfIsosceles(side: Double, base: Double) {
        val area = base * Math.sqrt(4 * Math.pow(side, 2.0) - Math.pow(base, 2.0)) / 4

        val formattedArea = String.format("%.2f", area)
        println(formattedArea)
    }

    fun areaOfParallelogram(base: Double, side: Double) {
        val area = base * side

        val formattedArea = String.format("%.2f", area)
        println(formattedArea)
    }

    fun areaOfRhombus(diagonal1: Double, diagonal2: Double) {
        val area = diagonal1 * diagonal2 / 2

        val formattedArea = String.format("%.2f", area)
        println(formattedArea)
    }

    fun areaOfEquilateralTriangle(side: Double) {
        val area = Math.sqrt(3.0) / 4 * Math.pow(side, 2.0)

        val formattedArea = String.format("%.3f", area)
        println(formattedArea)
    }

    fun perimeterOfCircle(radius: Double) {
        val circumference = 2 * Math.PI * radius

        val formattedCircumference = String.format("%.2f", circumference)
        println(formattedCircumference)
    }

    fun perimeterOfEquilateralTriangle(side: Double) {
        val circumference = side * 3

        val formattedCircumference = String.format("%.2f", circumference)
        println(formattedCircumference)
    }

    fun perimeterOfParallelogram(side1: Double, side2: Double, side3: Double, side4: Double) {
        val circumference = side1 + side2 + side3 + side4

        val formattedCircumference = String.format("%.2f", circumference)
        println(formattedCircumference)
    }

    fun perimeterOfRectangle(length: Double, breadth: Double) {
        val circumference = length * 2 + breadth * 2

        val formattedCircumference = String.format("%.2f", circumference)
        println(formattedCircumference)
    }

    fun perimeterOfSquare(side: Double) {
        val circumference = side * 4

        val formattedCircumference = String.format("%.2f", circumference)
        println(formattedCircumference)
    }

    fun perimeterOfRhombus(side: Double) {
        val circumference = side * 4

        val formattedCircumference = String.format("%.2f", circumference)
        println(formattedCircumference)
    }

    fun volumeOfCone(radius: Double, height: Double) {
        val volume = 1.0 / 3 * (Math.PI * Math.pow(radius, 2.0) * height)

        val formattedVolume = String.format("%.2f", volume)
        println(formattedVolume)
    }

    fun volumeOfPrism(length: Double, width: Double) {
        val volume = length * width

        val formattedVolume = String.format("%.2f", volume)
        println(formattedVolume)
    }

    fun volumeOfCylinder(radius: Double, height: Double) {
        val volume = Math.PI * Math.pow(radius, 2.0) * height

        val formattedVolume = String.format("%.2f", volume)
        println(formattedVolume)
    }

    fun volumeOfSphere(radius: Double) {
        val volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3.0)

        val formattedVolume = String.format("%.2f", volume)
        println(formattedVolume)
    }

    fun volumeOfPyramid(base: Double, height: Double) {
        val volume = 1.0 / 3 * base * height

        val formattedVolume = String.format("%.2f", volume)
        println(formattedVolume)
    }

    fun curvedSurfaceAreaOfCylinder(radius: Double, height: Double) {
        val curvedSurfaceArea = 2 * Math.PI * radius * height

        val formattedCurvedSurfaceArea = String.format("%.2f", curvedSurfaceArea)
        println(formattedCurvedSurfaceArea)
    }

    fun totalSurfaceAreaOfCube(side: Double) {
        val totalSurfaceArea = 6 * Math.pow(side, 2.0);

        val formattedTotalSurfaceArea = String.format("%.2f", totalSurfaceArea);
        println(formattedTotalSurfaceArea);
    }

    fun fibonacciSeries(numberOfTerms: Int) {
        var first: Int = 0;
        var second: Int = 1;

        print("$first $second ");

        for (i in 2..numberOfTerms) {
            val sum: Int = first + second;

            print("$sum ");
            first = second;
            second = sum;
        }
    }

    // Subtract the Product and Sum of Digits of an Integer
    /*
        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15
    */
    fun productAndSum(n: Int) {
        var num: Int = n;
        var p: Int = 1;
        var s: Int = 0;

        while(num > 0) {
            val lastDigit: Int = num % 10;
            p *= lastDigit;
            s += lastDigit;

            num /= 10;
        }

        println("Subtract sum from product ${p - s}");
    }

    // Input a number and print all the factors of that number (use loops).
    fun printFactors(n: Int) {
        if (n == 2) {
            println(n);
            return;
        }

        for (i in 2 until n) {
            if (n % i == 0)
                print("$i ");
        }
    }

    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    fun printSum() {
        var sum: Int = 0;
        while(true) {
            print("Enter a number: ");
            val num = scanner.nextInt();

            if (num == 0)
                break;

            sum += num;
        }

        println("Sum of the numbers you entered: $sum");
    }

    // Take integer inputs till the user enters 0 and print the largest number from all.
    fun largestNum() {
        var max: Int = Integer.MIN_VALUE;

        while(true) {
            val num: Int = scanner.nextInt();

            if (num == 0)
                break;

            max = num.coerceAtLeast(max);
        }

        println("The numbers you entered, from which this is the largest one $max");
    }
}