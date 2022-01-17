
interface IdProvider {
    fun getId():String
}
class Entity  private constructor(val id:String){
    companion object Factory :IdProvider{
        override fun getId():String{
            return "123"
        }
        const val id = "id"
        fun create () = Entity(getId())
    }
}


fun main(args: Array<String>){
val entity = Entity.Factory.create() // Entity campanion for java
   Entity.id
}



enum class EntityType{
  HELP,  EASY, MEDIUM, HARD

    fun getFormattedName() = name.toLowerCase(). capitalize()
}

//thread safe singleton class in kotlin
object EntityFactory{
    fun create (type:EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY->type.name
            EntityType.MEDIUM->type.getFormattedName()
            EntityType.HARD->type.name
            EntityType.HELP->type.getFormattedName()
        }
        return when(type){// error cant instiantiate a sealed classs
          EntityType.Easy -> Entity.Easy(id, name)
          EntityType.MEDIUM -> Entity.Medium(id,name)
          EntityTYpe.HARD -> Entity.Hard(id,name, 2f)
          EntityType,HELP -> Entity.Help
          

            
    }
}
sealed class Entity constructor(){
    object Help :Entity(){
        val name = "help"
    }
data class Easy(val id:String, val name:String):Entity()
data class Medium(val id:String, val name:String):Entity()
data class Hard(val id:String, val name:String, val multiplier: Float):Entity()
  
fun Entity.Medium.printInfo(){ //function extensions / properties
    println("Medium class: $id")
}
    val Entity.Medium.info: String //properties extension
      get() = "some info"
}


fun main(args: Array<String>){
val entity:Entity = EntityFactory.create(EntityType.HELP) // Entity campanion for java
 val msg = when(entity){
     ENtity.Help ->  "help class"
     ENtity.Easy -> "easy class"
     ENtity.Medium -> "medium class"
     ENtity.Hard ->     "hard class"
 }
 Entity.Medium("id", "name").printInfo()
 println(msg)

val entity1 = Entity.Easy("id","name")
val entity2 = entity1.copy(name ="new name")

// if (entity1 == entity2){ //=== is referencial equality
//     prinltn("they are equal")
// }
// else{
//     println("they are not equal")
// }

val entity1 = Entity.Easy("id","name")
val entity2 = entity1.copy(EntityType.Medium)
if(entity2 is Entity.Medium){
    entity2.printInfo()
    entity2.info
}else{

}


}
 // add additional functionalities to an existing class. function
//and properties extensions.