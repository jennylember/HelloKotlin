package abstracts

open class TemplateA : Templates() {

    override fun templateFunction() {
        count++
        println("Count: $count")
    }
}