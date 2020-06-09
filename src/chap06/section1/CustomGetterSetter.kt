package chap06.section1

class User(_id:Int, _name:String, _age:Int){
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get() {
            if(tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
        set(value) {
            println("the name was changed")
            field = value.toUpperCase()
        }

    var age: Int = _age
}


fun main(){
    val user1 = User(1,"killdong",35)
    user1.name =""
    println("user3.name = ${user1.name}")
}
