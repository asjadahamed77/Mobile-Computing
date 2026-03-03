fun sumOfEvenNumbers(numbers: List<Int>) {
    var sum = 0
    for (num in numbers) {
        if (num % 2 == 0) {
            sum += num
        }
    }
    println("Sum of even numbers: $sum")
}

fun findMaximum(numbers: List<Int>) {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    println("Maximum number: $max")
}

fun fizzBuzz() {
    for (i in 1..50) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

fun countVowels(text: String) {
    var count = 0
    val vowels = "aeiouAEIOU"

    for (char in text) {
        if (char in vowels) {
            count++
        }
    }

    println("Number of vowels: $count")
}

fun removeDuplicates(numbers: List<Int>) {
    val uniqueList = mutableListOf<Int>()

    for (num in numbers) {
        if (!uniqueList.contains(num)) {
            uniqueList.add(num)
        }
    }

    println("List without duplicates: $uniqueList")
}

fun reverseList(strings: List<String>) {
    val reversedList = mutableListOf<String>()

    for (i in strings.size - 1 downTo 0) {
        reversedList.add(strings[i])
    }

    println("Reversed list: $reversedList")
}

fun factorial(n: Int) {
    var result = 1L

    for (i in 1..n) {
        result *= i
    }

    println("Factorial of $n is $result")
}

fun sumOfPositive(numbers: List<Int>) {
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}

fun numberGuessingGame() {
    val correctNumber = 7
    var guess: Int?

    do {
        print("Guess a number between 1 and 10: ")
        guess = readLine()?.toIntOrNull()

        if (guess != correctNumber) {
            println("Wrong guess! Try again.")
        }

    } while (guess != correctNumber)

    println("Correct! You guessed the number.")
}

fun printPattern() {
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}