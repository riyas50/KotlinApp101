@file: JvmName("exConstructor")
class exConstructor constructor(n: String = "Test"){
//constructor keyword is not necessary
    //the above constructor method is
    //not viable when using multiple line
    //of constructors
    //for that you need to use init

    var Name : String = ""
    var Roll : Int = 0

    //constructor overloading
    constructor(n:String, crollno:Int) : this(n){
        Roll = crollno
    }

    init {

        Name = n
        Roll = 10

    }

    fun Show(){

        println(Name)
        println(Roll)
    }



}