fun main() {
    val count = 10
    var n1 = 0
    var n2 = 1

    print("Fibonacci Series ($count terms): ")
    for (i in 1..count) {
        print("$n1 ")
        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
    println()
}
