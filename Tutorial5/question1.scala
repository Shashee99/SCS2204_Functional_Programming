object question1 extends App {

  def gcd (a:Int , b:Int ):Int= b match {
    case 0 => a;
    case x if x>a => gcd(x,a)
    case x => gcd(x,a%x);
  }

  def prime(p:Int , n:Int=2):Boolean= n match {
    case x if (x==p) => true;
    case x if gcd(p,x)>1 => false;
    case x => prime(p,x+1);
  }

  println(prime(5));
  println(prime(8));

}
