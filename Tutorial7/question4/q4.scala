package Tutorial7.question4

object q4 extends App {
  val Bank = new Bank();
  val ac1 = new Account("111", 2020, 40000);
  val ac2 = new Account("222", 2019, -4000);
  val ac3 = new Account("111", 2018, -80000);
  Bank.addAccount(ac1)
  Bank.addAccount(ac2)
  Bank.addAccount(ac3)
//4.1 List of Accounts with negative balances
  println("List of Accounts with negative balances")
  Bank.negativebalanceaccounts;

//  4.2 Calculate the sum of all account balances
  println("sum of all account balances" + Bank.sumofallbalances)


//  4.3 Calculate the final balances of all accounts after apply the interest
  println("Calculate the final balances of all accounts after apply the interest")
  Bank.addInterest
  Bank.Allacounts;



}

class Bank {
  var bankDB: List[Account] = List();

  def addAccount(acc: Account) = {
    bankDB = bankDB :+ acc;
  }

  def Allacounts = bankDB.foreach(println)

  def negativebalanceaccounts = bankDB.filter(_.balance < 0).foreach(println);

  def sumofallbalances = bankDB.map(_.balance * 1).sum;

  def addInterest = {
    bankDB.filter(_.balance < 0).foreach(_.balance *= 1.1)
    bankDB.filter(_.balance > 0).foreach(_.balance *= 1.05)
  }

}


class Account(id: String, ac: Int, bal: Double) {
  val nic: String = id;
  val acnumber: Int = ac;
  var balance: Double = bal;

  def withdraw(a: Double) =
    this.balance = this.balance - a;

  def deposit(a: Double) =
    this.balance = this.balance + a

  def transfer(a: Account, amount: Double) = {
    this.withdraw(amount);
    a.balance = a.balance + amount;
  }


  override def toString = "[" +"NIC - "+ nic + ":" +"A/C - "+ acnumber + ":" +"Balance - "+ balance + "]";
}