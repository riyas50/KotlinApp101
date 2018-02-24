@file:JvmName("student")
class student {
    var name : String? = null //to assign null need to put a ? to data type
    var roll : Int? = null //to assign null need to put a ? to data type

    var name1 : String = "Riyas"
    var roll1 : Int = 25

    fun printStudentDetails(){
        println("Student Name: $name")
        println("Student Roll#: $roll")
    }
}