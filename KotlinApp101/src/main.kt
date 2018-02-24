@file: JvmName("main")
import java.util.*

fun main(args : Array<String>) {

    //first line of app
    //just print a line
    println("String print out")
    println("=====================")
  println("Hello World!")

//a variable of type string. note S is capital
  var name : String = "Riyas Aboobaker"
  println("My Name is: " + name)

    //a constant definition. The type is automatically determined.
  val thisValue = 3
  println("The value of the variable thisValue is: " + thisValue)

    //print the max and min value of type integer
    println("max and min value of type Int")
    println("=====================")
 println("Max value of an integer is: " + Int.MAX_VALUE)
 println("Min value of an integer is: " + Int.MIN_VALUE)

    //array definition of type any
 var myArray = arrayOf("This","That",1,3,2,"etc")

    //array definition of a specific type in this case Int.
    var intArray : Array<Int> = arrayOf(10,20,30,40)

    //for loop example to print the values of previously defined arrays
    println("for loop with array")
    println("=====================")
 for(x in myArray)
 {
  println("Array Value is : " + x)
 }
    for (y in intArray)
    {
        println("intArray Values are: " + y)
    }

    //If Else Statement examples
    var a = 2
    var b = 4
    var result : Int = 0

    println("If statement")
    println("===============")
    if (a == b)
        println("variable a is equal to variable b")
    else
        println("variable a is not equal to variable b")

    result = if (a > b) {
        a
    }
    else {
        b
    }

    println("The result is " + result)

    //switch case is called when in kotlin
    //example below
    //a = 4
    println("when statement")
    println("================")
    when(a)
    {
        1 -> println("a is 1")
        2 -> println("a is 2")
        else -> println("Not found!")
    }

    println("when statement with result assigned ")
    println("================")
    var resultWhen : String = ""
    resultWhen = when(a)
    {
        1 -> "a is 1"
        2 -> "a is 2"
        else -> "Not found!"
    }
    println(resultWhen)

//String functions and ranges
    //range is defined with a .. operator
    println("String functions and ranges")
    println("===========================")
    var range = 1..5 //result will be from 1 to 5
    for (z in range)
        println("Range reverse values: " + z)

    println("reverse range")
    println("===========================")
    var range2 = 5 downTo 1 //result will be from 5 to 1
    for (p in range2)
        println("Range values: " + p)
    println()
    println("reverse range with step")
    println("===========================")
    var range3 = 5 downTo 1 step 2 //result will be from 5 to 1
    for (p in range3)
        println("Range values: " + p)
    println()
    println("reverse range another defining method")
    println("===========================")
    var range4 = 5.downTo(1) //result will be from 5 to 1
    for (p in range4)
        println("Range values: " + p)
    println()
    println("ranges - another reverse method")
    println("===========================")
    var range5 = 1..5 //result will be from 1 to 5
    for (z in range5.reversed())
        println("Range reverse values: " + z)

println()
    println("string functions")
    println("====================")
    var strNew1 = "Riyas Aboobaker"
    if (strNew1.equals("riyas aboobaker"))
        print("Case sensistive comparison: true")
    else
        print("Case sensitive comparison: false")

    println()
    println("string functions")
    println("====================")
    //var strNew1 = "Riyas Aboobaker"
    if (strNew1.equals("riyas aboobaker",true))
        print("Case insensistive comparison: true")
    else
        print("Case insensitive comparison: false")

    println()
    println("String to int and print length of the string")
    var thisString1 : String = "4"
    println("length of this string is : " + thisString1.length)
    println("The value of thisString1+1 is : " + (thisString1.toInt() + 1))

    println("Substring of strNew1(" + strNew1 + ") first 5 character is : " + strNew1.substring(0..4))

    println("You can refer variable with $ symbol like php. Like strNew1 is: $strNew1")


    //#5 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Classes and Objects and Null Handling
    println("#5 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Classes and Objects and Null Handling")

    var s1 = student()
    //print class fields using instance name
    println("Student Name: ${s1.name}")
    println("Student Roll#: ${s1.roll}")

    s1.name = "Muhammad Reyhaan"
    s1.roll = 25
    //print class variables from class function
    s1.printStudentDetails()

    //#6 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Loops, Lists, Tree Maps and Function Expressions
    println("#6 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Loops, Lists, Tree Maps and Function Expressions ")

    println("List and Loop")
    var list = listOf(11,12,13,14,15)
    for((i,x) in list.withIndex())
        println(i.toString() + " " + x.toString())

    println("Treemap and Loop")
    var tree = TreeMap<String,Int>()
    tree["Riyas"] = 100
    tree["Reyhaan"] = 1000
    tree["Naja"] = 300
    tree["Eshal"] = 400

    for((Name,Score) in tree)
        println("Name: " + Name + " Score: " + Score.toString())

    println("The result fun add() is : " + add(3,5))
    println("The result fun add1() is : " + add1(3,5))

    //#7 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Working with Java and Kotlin Together
    println("#7 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Working with Java and Kotlin Together")

    //run java code from Kotlin
    println("Hello from Kotlin!")
    System.out.println("Hello from Java!")

    println("From Kotlin: " + "3".toInt())
    System.out.print("From Java: ")
    println(Integer.parseInt("5"))

    //learned how to convert java code to Kotlin
    //learnined calling a Kotlin function within java
    //learned how to name a kotlin kt.class class file to avoid the kt postfix using @File JVMName("name here...")

    //#8 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE :
    // Extension & Infix Functions and Try Catch Expressions
    var a1 = "23a" //change this to a string value to throw exception
    var b1 : Int = 0

    //regular try catch
    try{

        b1 = a1.toInt()

    }catch (e : NumberFormatException){

        println("The given string is not a valid number!")

    }
    println("Regular try catch output:  $b1")


    //try catch as expression
    var b2 : Int = try{

        a1.toInt()

    }catch (e : NumberFormatException){

        0

    }

    println("Try catch as expression output : $b2")


    //extensions : here we are extending a student class with a function to show name1 and roll1 variables
    var student2 = student()
    student2.name1 = "Naja"
    student2.roll1 = 100
    student2.Show()

    var student3 = student()
    student3.name1 = "Eshal"
    student3.roll1 = 101
    student3.Show()

    var sum : Int = student2 add student3 //infix example
    println("The sum of Roll Numbers : $sum")


    //TODO
    //#9 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Operator Overloading
    var opovS1 = student()
    var opovS2 = student()

    opovS1.name1 = "Riyas"
    opovS1.roll1 = 1

    opovS2.name1= "Naja"
    opovS2.roll1 = 2

    var opovS3 : student = opovS1 + opovS2

    opovS3.Show()


    //#10 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE :Default & Named Parameters and types of Contructors
    println("#10 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE :Default & Named Parameters and types of Contructors")
    //default / named parameters
    defnamedShow()
    defnamedShow("Riyas")
    defnamedShow("Riyas","Naja")

    //constructors
    //exConstructor class used
    var exCon1 = exConstructor("Riyas Aboobaker")
    exCon1.Show()

    var exCon2 = exConstructor("Riyas Naja",100)
    exCon2.Show()

    //#11 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE:Complete Inheritance, Constructor& Function Overriding
    println("#11 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE:Complete Inheritance, Constructor& Function Overriding")

    //inheriting class Doctor without function override
    var E1 = Engineer()
    println("inheriting class Doctor without function override")
    E1.show() //output will be "In Doctor Class"

    //inheriting class Doctor1 with function override
    var E2 = Engineer1()
    println("inheriting class Doctor1 with function override")
    E2.show()

    //inheritance, constructor, super class constructor passing from inheriting class
    println("inheritance, constructor, super class constructor passing from inheriting class")
    var E3 = Engineer2("Riyas Aboobaker","Software")
    E3.show1()
    E3.show2()



    //#12 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Interfaces and Abstract Classes
    println("#12 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Interfaces and Abstract Classes")
    println("Abstract Classes")
    var classb = B()
    var classc = C()
    classb.add()
    classc.add()

    println("Interfaces")
    var ic = IC()
    ic.add()
    ic.subtract()
    ic.show()

    //TODO
    //#13 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Data Classes, Object Keyword & Inner Classes
    println("#13 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Data Classes, Object Keyword & Inner Classes")
    //Data Classes example
    println("Data Classes example")
    var dS1 = DataclassTest("Riyas",1)
    var dS2 = DataclassTest("Naja",2)
    var dS3 = dS1.copy()
    println(dS1)
    println(dS2)
    println(dS3)
    print("compare dS1 and dS2 : ")
    println(dS1 == dS2)
    print("compare dS1 and dS3 : ")
    println(dS1 == dS3)

    //interface static usage
    var SI1 = object : staticInterface {
        override fun show() {
            println("In Show var SI1")
        }
    }
    SI1.show()

    //objects and usage
    classroom.students.add(studentCls("Riyas",1))
    classroom.students.add(studentCls("Naja",2))
    classroom.students.add(studentCls("M.Reyhaan",3))
    classroom.students.add(studentCls("Eshal Fathima",4))
    //call show all data from object
    classroom.showAll()

    //use the this keyword to print the data of a class
    println("use the this keyword to print the data of a class")
    var thiscls = studentCls("thisTest",0)
    thiscls.thisShow()

    //#14 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Companion Object and Backtick
    println("#14 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Companion Object and Backtick")
    //companion object allows to write functions that act as static functions inside a class
    println("companion object allows to write functions that act as static functions inside a class")
    CompFunClass.show()

    //BackTick `` used to define a fun name which is a keyword
    CompFunClass.`in`()

    //#15 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Read Input & Arrays and Lists
    println("#15 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Read Input & Arrays and Lists")
    //println("Take input from keyboard")
    //print("Enter your Name: ")
    //var inName = readLine() //commented to avoid wait for input for the rest of code execution
    //println("\n Your Name is: $inName \n\n")

    println("#15 Arrays and Lists")
    println("Array example - any data type")
    var arVar = arrayOf(1,2,3,4,5,"Riyas","Navas")
    for (arX in arVar){
        println(arX)
    }
    println("Array example - specific type, in this example integer")
    var arVar1 =  intArrayOf(1,2,3,4,5) //this only permits int values in array
    for (arX1 in arVar1){
        println(arX1)
    }

    println("Initialize array and set values later example")
    var arVar2 = IntArray(5)

    arVar2.set(0,10)
    arVar2.set(1,20)
    arVar2.set(2,30)
    arVar2.set(3,40)
    arVar2.set(4,50)

    for (arX2 in arVar2){
        println(arX2)
    }

    println("defining and using a string array. You must use keyword arrayOfNulls<String>")
    var arVar3 = arrayOfNulls<String>(5)
    arVar3.set(0,"Riyas")
    arVar3.set(1,"Naja")
    arVar3.set(2,"Reyhaan")
    arVar3.set(3,"Eshal")
    arVar3.set(4,"Navas")

    for (arX3 in arVar3){
        println(arX3)
    }

    println("#15 List")
    println("Standard list")
    var lstVar1 = listOf(1,2,3,4,5)
    for (lstX1 in lstVar1){
        println(lstX1)
    }

    println("List with initialization and add values to it later.")
    println("TODO list with add value later, must use mutableListOf<T>()")
    var lstVar2 = mutableListOf<Int>()
    lstVar2.add(11)
    lstVar2.add(12)
    lstVar2.add(13)
    lstVar2.add(14)
    lstVar2.add(15)

    for (lstX2 in lstVar2){
        println(lstX2)
    }

    //#16 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Higher Order functions and Filter and Map Functions
    println("#16 KOTLIN FOR ANDROID DEVELOPERS FULL COURSE : Higher Order functions and Filter and Map Functions")
    println("another method to print list of array foreach attached to the array variable")
    var arVar4 = intArrayOf(1,2,3,4,5,6)
    var even = arVar4.filter { it % 2 == 0 }
    var odd = arVar4.filter { it % 2 != 0 }
    var twice = arVar4.map { it * 2 }
    arVar4.forEach { println(it) } //it is a keyword in kotlin //this is called higher order functions
    println("Only even values from arVar4")
    even.forEach { println(it) } //even already filtered with mod operator which results 0
    println("Only odd values from arVar4")
    odd.forEach { println(it) }
    println("twice the values. Showing example of map higher order function")
    twice.forEach { println(it) }

} //end of main function
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//class for companion object and static like function
class CompFunClass {

    companion object {
        @JvmStatic //required to make the fun static and callable from java class
        fun show(){
            println("This function is inside a companion object")
        }

        //this is a fun defined with a name 'in' which is a keyword. To escape we use backtick "``"
        fun `in`() {
            println("This is a keyword funtion escaped with back tick")
        }
    }
}

//object definition, this uses class studentCls
object classroom {
    var students = arrayListOf<studentCls>()
    fun showAll(){
        for (i in students){
            println(i)
        }
    }
}
//data class defined for object example
data class studentCls(var n:String,var r:Int){
    var name : String = n
    var roll : Int = r

    //usage of this keyword to print the data in data class
    fun thisShow() {
        println(this)
    }
}

//interface static usage
interface staticInterface {
    fun show()
}

//data classes
data class DataclassTest(var n:String, var r:Int) {
    var name : String = n
    var rollNo : Int = r
}

//interfaces
interface IA {
    fun add() //in interface abstract keyword not required.
    //interface functions are by default abstract functions
    fun show() {
    println("In Show IA")
    }
}
interface IB {
    fun subtract()

    fun show() {
        println("In Show IB")
    }
}

class IC : IA,IB {
    override fun add(){
    println("in add function!")
    }

    override fun subtract() {
        println("in subtract function!")
    }

    override fun show() {
        super<IA>.show()
        super<IB>.show()
    }
}

//abstract class
open abstract class A {
    abstract fun add() //abstract class abstract functions are just declarations
    //actual functions are in inherited classes with override keyword
}

class B : A() {
    override fun add(){
        println("in class b add function!")
    }
}

class C : A() {
    override fun add(){
        println("in class c add function!")
    }
}
//class
open class Doctor2(b:String) {
    var type : String =""
    init {
        type = b
    }

    fun show2(){
        println("In Doctor2, Type: $type")
    }
}
class Engineer2(a:String,c:String) : Doctor2(c){
    var name : String = ""

    init {
        name = a
    }
    fun show1(){
        println("In Engineer2, Name: $name")
    }
}


//class Doctor and Engineer used to show inheriting without override
//to inherit a class you need to open it using open keyword,
//by default it is a final which cannot be inherited
open class Doctor {
    fun show(){
        println("In Doctor Class")
    }
}
class Engineer : Doctor(){
    //No code required
    //show is called from inherited Doctor class
}

//class Doctor1 and Engineer1 used to show inheriting with function override
//to inherit a class you need to open it using open keyword,
//to override a function you need to add open keyword in-front of the function in inherited class
//by default it is a final which cannot be inherited, and function can't be overridable
open class Doctor1 {
    open fun show(){
        println("In Doctor-1 Class")
    }
}
class Engineer1 : Doctor1(){

    override fun show(){
        println("In Engineer-1 Class")
    }
}


//default / named parameters
fun defnamedShow(a:String = "Default a",b:String = "Default b"){
    println("Param a: " + a)
    println("Param b: " + b)
}

infix  fun student.add(s: student):Int {
    println("s.roll " + s.roll1)
    println("this.roll " + this.roll1)
    return s.roll1 + this.roll1
}

fun add(a:Int,b:Int):Int{
    return a + b
}

fun add1(a:Int,b:Int):Int = a+b

fun student.Show(){
    print("Name 1 : " + this.name1 + "\n")
    print("Roll 1 : " + this.roll1 + "\n")
}

//operator overloading function
//here + (plus) is overloaded
//reference https://kotlinlang.org/docs/reference/operator-overloading.html
operator fun student.plus(s:student):student{
    var opovS4 = student()
    opovS4.name1 = this.name1 + " " + s.name1
    opovS4.roll1 = this.roll1 + s.roll1
    return opovS4
}