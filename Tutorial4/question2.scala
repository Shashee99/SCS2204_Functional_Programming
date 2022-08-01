object question2 {


  val number= (x:Int) => x match{
    case 0 => "Zero"
    case x if x<0 => "Negative"
    case x if x%2==0 => "Even"
    case _ => "Odd"

  }

  def main(args: Array[String]): Unit = {

    print("Enter Number : ")
    val num = scala.io.StdIn.readInt()
    println("Number is "+number(num))


  }

}
