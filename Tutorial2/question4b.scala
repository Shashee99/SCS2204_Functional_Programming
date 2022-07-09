object question4b {

  /*attendees = 120 +(15-ticket_price)/5*20
   profit = revenue - cost
  * revenue = ticket_price * attendees
  * cost = 500 + 3*attendees
  * */
  def calAttendees(price:Int):Int=120+((15-price)/5)*20;
  def calRevenue(price:Int):Int=price*calAttendees(price);
  def calCost(price:Int):Int = 500 + 3*calAttendees(price);
  def calProfit(price:Int):Int=calRevenue(price)-calCost(price);

  def main(args: Array[String]): Unit = {

    println(calProfit(10))
    println(calProfit(15))
    println(calProfit(20))
    println(calProfit(25)) /*profit is maximum when price is 25*/
    println(calProfit(30))




  }



}
