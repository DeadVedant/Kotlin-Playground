fun main() {
    val str = "kayak"
    val isPalindrome = str.equals(str.reversed(), ignoreCase = true)
    if (isPalindrome) {
        println("$str is a Palindrome!")
    } else {
        println("$str is NOT a Palindrome.")
    }
}
