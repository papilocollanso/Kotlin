fun main(args:Array<String>){
    val list = listOf("kotlin", "java", "C++","Javascript",null,null)
    list
       .filterNotNull{
           itt.startwith("J")
       }
       .associate{it to it.length}
       .take(it:3)
       .takeLast(it:3)
       .map{
           it.length
       }
    .forEach{it:Map.Entry<String,Int>
    println("${it.value}, ${it.key}")
}
val language = list.first()
val language = list.last() 
val language = list.filterNotNull().findLast{it.startWith(prefix:"Java")}.orEmpty()
println(language)
}