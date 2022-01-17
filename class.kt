class Person(val firstName: String "Peter", val lastName:String = "Packer"){
 
//local properties in a class
var nickName:String? = null
    set(value){
      field =value
      println("the new nickname is $value")
    }
    get(){
         println("the reurned value is $field")
         return field

    }
    fun printInfo(){
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickName) $lastName")
    }

//primary constructors within class declaration
//secondary constructors
// init {

//     firName = _firstName
//     lastName = _lastName
// }

}