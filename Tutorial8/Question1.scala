package Tutorial8

object Question1 extends App {

  val p1 = Point(0, 0);
  val p2 = Point(7, 7);

  def distance(p1: Point, p2: Point): Double = {
    val X = p1.x - p2.x;
    val Y = p1.y - p2.y;

    Math.sqrt((X * X) + (Y * Y))
  }

  //  add points
  val add = p1 + p2;
  println(add)

  //  invert
  val invert_add = add.invert;
  println(invert_add);
  //  distance
  println(distance(p1, p2))
}


case class Point(x: Int, y: Int) {
  def +(that: Point) = Point(this.x + that.x, this.y + that.y);

  def move(a: Int, b: Int) = Point(this.x + a, this.y + b);

  def invert = Point(this.y, this.x);

}