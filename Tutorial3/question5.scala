object question5 {

  def easyPace(km:Int):Int=km*8;
  def tempo(km:Int):Int=km*7;

  def main(args: Array[String]): Unit = {
    println(easyPace(2)+tempo(3)+easyPace(2)+" Minutes")
  }

}

