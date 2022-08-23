object question3 extends App {

  def sum(n:Int):Int= n match {

    case 1 => 1;
    case 0 => 0;
    case x => x+sum(n-1)

  }
  print(sum(10))

}
