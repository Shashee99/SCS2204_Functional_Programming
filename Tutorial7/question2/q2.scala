package Tutorial7.question2

object q2 extends App {
//  x=3/4, y=5/8, z=2/7.
 val x = new Rational(3,4);
  val y = new Rational(5,8);
  val z = new Rational(2,7);
  val res = x.sub(y).sub(z);
  println(res)
}
class Rational(x: Int, y: Int) {
  require(y>0,"Error cannot divide by 0")
  private val g = gcd(Math.abs(x), y);
  def numer = x / g;
  def deno = y / g;

  def sub(r:Rational) = new Rational((this.numer*r.deno-r.numer*this.deno),deno*r.deno);
  override def toString: String = numer + "/" + deno;

  private def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y);

}