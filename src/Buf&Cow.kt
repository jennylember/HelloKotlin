import kotlin.random.Random

fun main() {

    val value: Set<Int> = secretValue()
    println("Привет! Это игра Быки и Коровы! Я загадал 4-х значное число! Угадывай!")
    var i = 0
    var buf = 0
    var cow: Int
    var answer: MutableSet<Int>

    while (buf != 4) {
        println("Твоя попытка:")
        answer = getAnswer()
        i++
        buf = checkBuf(answer, value)
        cow = checkCow(answer, value, buf)
        println("$buf Б, $cow К")
    }
    println("Ты угадал! Количество попыток $i!")
    println(value)
}

fun checkBuf(answer: Set<Int>, value: Set<Int>): Int {
    var buf = 0
    value.zip(answer) { a, b -> if (a == b) buf ++ }
    return buf
}

fun checkCow(answer: Set<Int>, value: Set<Int>, buf: Int): Int {
    var cow = 0
    for (n in answer)
        if (value.contains(n))
            cow++
    cow -= buf
    return cow
}

fun secretValue(): Set<Int> {
    val secret = mutableSetOf<Int>()
    while (secret.size != 4) {
        val n: Int = Random.nextInt(0, 9)
        if (!secret.contains(n))
            secret.add(n)
    }
    return secret
}

fun getAnswer(): MutableSet<Int> {
    val answer = mutableSetOf<Int>()
        var enterValue = readLine()
    while (enterValue!!.length != 4 ) {
        println("Число должно быть четырехзначное!")
        enterValue = readLine()
    }
    if (enterValue.isNotEmpty()) {
        for (n in enterValue) {
            val a: Int = (n.toInt() - '0'.toInt())
            answer.add(a)
        }
    }
    else
        println("Ты не ввел число!")
    return answer
}