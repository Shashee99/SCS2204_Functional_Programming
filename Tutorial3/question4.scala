object question4 {

  def bookPrice(amount:Double):Double=amount*24.95;

  def discount(totalamount: Double):Double=totalamount*.4;

  def shippingCost(amount:Double):Double= amount match {
    case x if x>50 => (3*50)+(x-50)*.75
    case x if x<=50 => (3*x)
  }
  def wholesaleCost(amount:Double):Double=bookPrice(amount)-discount(bookPrice(amount))+shippingCost(amount);
  def main(args: Array[String]): Unit = {
    println(wholesaleCost(60))
  }

}
