package Tutorial8

object Question1 extends App {

  val p1 = Point(0, 0);
  val p2 = Point(5,2);

  def distance(p1: Point, p2: Point): Double = {
    var X = p1.x - p2.x;
    var Y = p1.y - p2.y;

    Math.sqrt((X * X) + (Y * Y))
  }

  //  add points
  val add = p1 + p2;
  println(add)

  //  invert
 add.invert;
  println(add);
  //  distance
  println(distance(p1, p2))
}


case class Point(var x: Int,var y: Int) {
  def +(that: Point) = Point(this.x + that.x, this.y + that.y);

  def move(a: Int, b: Int) = Point(this.x + a, this.y + b);

  def invert={
    var temp1 = this.x;
    var temp2 = this.y;

    this.x=temp2;
    this.y=temp1;
  }

}