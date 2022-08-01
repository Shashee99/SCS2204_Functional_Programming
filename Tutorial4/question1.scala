object question1 extends App{

  def interest(n:Double):Double={
    n match {
      case x if 0<x && x<=20000 => x*0.02
      case x if  20000<x && x<=200000 => x*0.04
      case x if 200000<x && x<=2000000 => x*0.035
      case x if 200000>x => x*0.06
    }
  }

  print(interest(100000))

}
