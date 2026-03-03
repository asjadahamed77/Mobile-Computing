fun main() {
    val numbers = listOf(-2, 5, -1, 7, 3)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}