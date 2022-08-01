object question3 {
  val toUpper =(x:String) => x.toUpperCase()
  val toLower = (x:String) => x.toLowerCase()
  val firsttwo_toUpper = (x:String) => x.substring(0,2).toUpperCase()+x.substring(2,x.length)
  val firstandlast_toUpper = (x:String) => x.substring(0,1).toUpperCase()+x.substring(1,x.length-1)+x.substring(x.length-1,x.length).toUpperCase()

  val formatNames=(name:String,f:(String) => String)=>f(name)
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny",toUpper))
    println(formatNames("Niroshan",firsttwo_toUpper))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",firstandlast_toUpper))
  }
}
