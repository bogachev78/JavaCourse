package syntax.lesson12_string_templates

fun main() {
    val nameOfManager = "Andrey Bogachev"
    println("Hello, $nameOfManager")

    var firstNumber = 4
    var secondNumber = 8
    println("The sum a + b = ${firstNumber + secondNumber}")
}