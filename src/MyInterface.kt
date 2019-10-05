interface MyInterface {
    val property: Boolean
    get() = true

    fun function1()
    fun function2() {
        println("Default function2")
    }
}