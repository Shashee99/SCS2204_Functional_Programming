package Tutorial7.question1

object q1 extends App{
 val x = new Rational(1,2);
  val negativeX = x.neg;
  println(negativeX)
}
class Rational(x: Int, y: Int) {
  require(y>0,"Error cannot divide by 0")
  private val g = gcd(Math.abs(x), y);
  def numer = x / g;
  def deno = y / g;

  def  neg = new Rational(-this.numer,this.deno);
  override def toString: String = numer + "/" + deno;

  private def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y);

}
