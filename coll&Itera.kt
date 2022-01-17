fun sayHello(greeting:String, vararg  itemsToGreet:List<String>) ={
     itemsToGreet.forEach{
         itemToGreet->
         println("$greeting $itemToGreet")
     }
}

fun main(args: Array<String>) {
//  val  interestingThings = arrayOf("Kotlin","pogramming","comic Book")
//  val interestingThingss = mutablelistOf("Kotlin","pogramming","comic Book")
//  val map = mutablemapOf(1 to "a", 2 to "b", 3 to "c")
 map.forEach { key,value ->println("$key -> $value")
     val person =Person("Nate", "Smith")
     person.printInfo()
 }
//  map.put(4,"o")
//  interestingThing.add("Dogs")
 //kotlin are immutable by defaults
 
//  println(interestingThings.size)
//  println(interestingThings[0])
//  println(interestingThings.get(0))
 
// interestingThings.forEachIndexed { index,interestingThing ->
//  println("$interesThings is at $index")

// }


