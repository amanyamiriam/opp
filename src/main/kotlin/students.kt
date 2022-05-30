class Students {
    var course = ""
    var units = ""
    var fees = ""
}

fun main() {
    val c2 = Students ()
    c2.course = "MIT"
    c2.units = "Kotlin"
    c2.fees = "48500"

    println(c2.course)
    println(c2.units)
    println(c2.fees)
}