package abstracts

abstract class Templates {
    var count: Int = 0

    open fun templateFunction() {
        println("Default template")
    }
}