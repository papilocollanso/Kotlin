// higher order functions take functions as parameter or return
//a function

fun printfilteredStrings(list:list<String>,predicate:((String)->Boolean)?){
    list.forEach{it:String
       if(predicate?.invoke(it)==true){
         println(it)
       }
    }
}

val predicate:(String) -> Boolean = {it:String
     it.startwith(prefix:"J")

}
fun getPrintPredicate():(String)->Boolean{ // you can pass it below
    return {it.startwith(prefix:"J")}
}


fun main(args: Array<String>){
    val list = listOf("kotlin", "javascript", "java", "c++")
    printfilteredStrings(list) {it:String

        it.startwith("k") //or predicate directly
        //helps us store functions as variable
    }
    printfilteredStrings(list,predict:null)
    printfilteredStrings(list, getPrintPredicate)
}