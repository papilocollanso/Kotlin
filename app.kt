
val name:String = "Nate"
var name: String? = null

fun (args: Array<String>){ 
    greeting = "Hello"
    val greetingToPrint = when(greeting){
        null ->"Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}
