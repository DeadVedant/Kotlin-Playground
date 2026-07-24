fun main() {
    val num = 7
    var isPrime = true

    for (i in 2 until num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    println(if (isPrime) "Prime" else "Not Prime")
}
