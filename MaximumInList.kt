fun main() {
    val numbers = listOf(10, 45, 3, 89, 22)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Maximum number: $max")
}