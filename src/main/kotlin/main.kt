class Car {
    var brand = ""
    var model = ""
    var year = 0
}
fun main() {
   val c1 = Car()
   c1.brand = "Ford"
   c1.model = "Mustang"
   c1.year = 1968

    val c2 = Car()
    c2.brand = "toyota"
    c2.model = "Corolla"
    c2.year = 1998

   println(c1.brand)
   println(c1.model)
   println(c1.year)

    println(c2.brand)
    println(c2.model)
    println(c2.year)

}