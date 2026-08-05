fun main() {
    val number = 5
    var result = 1L
    for (i in 1..number) {
        result *= i
    }
    println("Factorial of $number is $result")
}
