object question3 {
  val toUpper = (x: String) => x.toUpperCase()
  val toLower = (x: String) => x.toLowerCase()


  def formatNames(name: String)(indexList:Int*)(fun: (String) => String):String = {
    if (indexList.isEmpty) {
      fun(name)
    }
    else {
      var outcome: String = "";
      var i: Int = 0;
      while (i < name.length) {
        if (indexList.contains(i)) {
          outcome = outcome + fun(name.charAt(i).toString)
        }
        else {
          outcome = outcome + name.charAt(i).toString
        }
        i = i + 1;
      }
      outcome
    }
  }


  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(5)(toUpper))

  }
}
