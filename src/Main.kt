
fun main (args: Array<String>) {
    println("Hello, Kotlin!")
    lesson1()
    lesson2()
    lesson3()
    var a: Int = lesson4function1()
    println(a)
    var b: Long = lesson4function2(100, 6000)
    println(b)
    lesson4function3()
    var c = lesson4function4(10, 5.4)
    println(c)
//    lesson5null()
//    lesson5null2()
    lesson6()
    lesson7()
}

fun lesson1 () {
    var name: String = "Alex"
    println("Hello, " + name + "!")
    println("Hello, $name! I love you so much!")
    println("Hello, \$name!")
    println("Hello "+ "\\" + "\$name!")
    var a: Int = 5
    var b: Int = 10
    println("A + B = ${a+b}")
}

fun lesson2 () {
    val userKotlin = UserKotlin("jane@kotlin.com")
    println("Kotlin example: ${userKotlin.email}")
}

fun lesson3 () {
    var a1: Int = 5
    var a2: Long = 100
    var a3: Double = 0.9e4
    var a4: Float = 0.9F
    var a5: Char = 'f'
    var a6: Boolean = true
    var a7: Boolean = false
    var a8: String = "Hello!"
    var a9: Byte = 6
    var b1: Int = a3.toInt()
    var b2: String = a5.toString()
    var b3: Char = a4.toChar()
    println("$a1, $a2, $a3, $a4, $a5, $a6, $a7, $a8, $a9, $b1, $b2, $b3")
}

fun lesson4function1(): Int {
    return 100
}
fun lesson4function2(a: Int, b: Int): Long {
    return a*b.toLong()
}

fun lesson4function3(){
    println("This function is void!")
}

fun lesson4function4(a: Int, b: Double) = a * b

fun lesson5null() {
    val st: String = getSt()
    val size: Int
    size = st.length
    println(size)
}

fun getSt(): String{
    throw KotlinNullPointerException()
    return "hello"
}

fun lesson5null2() {
    val st: String? = getSt2()
    val size: Int
    size = st!!.length
    println(size)
}

fun getSt2(): String?{
    return null
}

fun lesson6() {
    val student1 = Student("Evgeniia", "Lemberskaia", 2, mutableSetOf(5, 5, 5, 5, 5))
    println(student1)
    println(student1.firstName)
    println(student1.secondName)
    println(student1.numberOfGroup)

}

fun lesson7() {
    println(Color.PINK)
    println(Color.PINK.name)
    println(Color.PINK.ordinal)
    println(Color.WHITE.ordinal)
    println(Color.BLACK.ordinal)
}

