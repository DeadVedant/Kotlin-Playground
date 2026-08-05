fun main() {
    val num = 17
    var isPrime = true
    if (num <= 1) isPrime = false
    else {
        for (i in 2..num / 2) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }
    if (isPrime) println("$num is a Prime Number.")
    else println("$num is not a Prime Number.")
}
