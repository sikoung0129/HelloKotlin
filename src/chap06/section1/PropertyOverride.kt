package chap06.section1

open class First{
    open val x: Int = 0
    get() {
        println("first x")
        return field
    }
    val y: Int = 0
}

class Second: First(){
    override val x: Int = 0
        get() {
            println("second x")
            return field + 3
        }
}

fun main(){
    val second = Second()
    println(second.x)
    println(second.y)

}