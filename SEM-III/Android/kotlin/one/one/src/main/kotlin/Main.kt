// MAIN Function :
fun main(){

//  vararg (printSum function)
    println(printSum(1,2,3,4,5,6,7,8,9,10))

//  working with null
    workingWithNull(null)
    workingWithNull("hello")

//  Ternary operator : Using if...else
    print("MAXIMUM value : ")
    print(if (5 > 10) 5 else 10)




}


//  working with null values :
fun workingWithNull(values : String?){
    if(values != null && values.length > 0)
        println("Length of the string : ${values.length}")
    else
        println("String is null or empty")
}
// vararg : pass any  number of argument to the function
fun printSum(vararg values : Int) : Int{
    var sum : Int = 0
    for(value in values){
        sum += value
    }
    return sum
}












































//class Parent1(name : String)
//open class Parent2(open var name : String, open var number : Int){
//    open fun gando() {
//        println("$name and $number")
//    }
//}
//class Parent3(override var name : String, override var number : Int) : Parent2(name,number){
//    override fun gando() {
//        println("koi ne vandho !😁")
//    }
//}
//
//
//
//fun main() {
//    println(Parent3("ghelo", 200).gando())
////    println(Parent1("hello"))
////    println(Parent2("gando", 100).gando())
//    println(a)
//
////    first way...
//    Greeter("Manoj").greet()
//
////    second way...
//    val g = Greeter(" Vala")
//    g.greet()
//
//    println("Function====================================")
//    defaultFunction()
//    parameterizedFunction("Kotlin")
//    printWithDefaultValue("Kotlin")
//    printWithDefaultValue("Android","miss")
//    println(returnValueFunction(10))
//    println(sameInAnotherWay(5))
//
//    println("VarArgs ====================================")
//    printAll("one","two","three","four")
//
//    println("Null Safety ====================================")
//    nullSafety()
//
//    println("Loops ====================================")
//    loops()
//
//    myFun()
//
//
//
//}
//
//
//
//fun myFun() {
//    print("\n\nEnter any value : ")
//    var value = readLine()!!.toInt()
//    if(value >= 40){
//        println("ghar bhegu thane")
//    }else{
//        println("lay le haji sir no")
//    }
//}
//
//class Greeter(val name : String){
//    fun greet() {
//        println("Hello $name!")
//    }
//}
//var a : Int = 10
//
//
//
//// Function==============================================================================
//fun defaultFunction(){
//    println("Default function")
//}
//fun parameterizedFunction(name : String) : Unit{
//    println("name : $name")
//}
//fun printWithDefaultValue(name : String, greeting : String = "mr."){
//    println("$greeting $name")
//}
//fun returnValueFunction(value : Int) : Int {
//    val square = value * value
//    return square
//}
//fun sameInAnotherWay(value : Int) = value * value
//fun functionForNullableLength(value : String?) : Int? {
//    return value!!.length
//}
//// VarArgs================================
//fun printAll(vararg table : String) {
//    for (i in table)
//        print("$i, ")
//}
//// Null Safety============================
//fun nullSafety() {
//    var notNullType = "this is not nullable"
//    println(notNullType)
//
//    var nullable : String? = "This can be nullable Darling!"
////    nullable = null
//    println(nullable)
//    println("Length : ${functionForNullableLength(notNullType)}")
//    println("Length : ${functionForNullableLength(nullable)}")
//}
//
//// Loops =================================
//fun loops(){
//    var i = 1
//    println("While(){  } Loop...")
//    while (i <= 5){
//        print(i)
//        i++
//    }
//    println("Do{ }While() Loop...")
//    do {
//        print(i)
//        i++
//    }while (i <= 10)
//    println("For Loop...")
//    for(i in 11..15)                    // first way
//        print(i)
//
//    var data = arrayOf("one","two","three")  // second way
//    for(datum in data)
//        print(datum)
//}
//
