package syntax.lesson13_null

fun main(){
    var nullableString: String? = "Andrey"
    println(nullableString?.uppercase())

//    val PI: Double = 3.14
    val PI: Double? = null
    println("The pi constant ${PI ?: "3.14"}")
}