interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person:Person){
        println(providerInfo)
        person.printInfo()
    }
}
interface SessionInfoProvider{
    fun getSessionId():String
}



open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override fun printInfo(person: Person){

          println("additional print statement")
     
    }
    override fun getSessionId(): String{
      return  sessionIdPrefix
   
  }

    override val providerInfo : String
    get() = "BasicInfoProvider"
  protected open val sessionIdPrefix = "Session"
}

fun main(args: Array<String>){
    val provider = object : PersonInfoProvider {
        override val providerInfo:String
        get() = "New Info Provider"
        
        fun getSessionId() ="id" 
    }
    provider.sessionIdPrefix // error protected and not available to kotlin public Api
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
      if(infoProvider !is SessionInfoProvider){
          println("not session info provider")
      }
      else{
          println("is a session info provider")
          infoProvider.getSessionId() 
      }
}