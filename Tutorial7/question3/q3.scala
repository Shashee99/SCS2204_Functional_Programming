package Tutorial7.question3

object q3 extends App {

  val ac1 = new Account("111", 2000, 4000.00);
  val ac2 = new Account("222", 3000, 4000.00);
  println(ac1)
  ac1.transfer(ac2, 1000);
  println(ac1)
  println(ac2)
}

class Account(id: String, ac: Int, bal: Double) {
  val nic: String = id;
  val acnumber: Int = ac;
  var balance: Double = bal;

  def transfer(a: Account, amount: Double) = {
    if (this.balance <= amount) {
      println("Account balance is not sufficient to transfer the amount");
    } else {
      this.balance = this.balance - amount;
      a.balance = a.balance + amount;
    }
  }

  override def toString = "[" +"NIC - "+ nic + ":" +"A/C - "+ acnumber + ":" +"Balance - "+ balance + "]";
}