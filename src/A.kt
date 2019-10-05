class A(override val property: Boolean = false) : MyInterface {
    override fun function1() {
        println("It's function1 from class A")
        println("$property")
    }

    override fun function2() {
        println("It's function2 from class A")
    }

}