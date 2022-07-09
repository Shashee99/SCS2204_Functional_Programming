object question3 extends App {
  var a: Int = 2;
  var b: Int = 3;
  var c: Int = 4;
  var d: Int = 5;
  var k: Float = 4.3f;


  /* a)
  println( - -b * a + c *d - -); is not a valid expression
  But we can modify above expression as below */
  b = b - 1;
  println(b * a + c * d);
  d = d - 1;

  /*  b)
    println(a++); is not a valid expression
  But we can modify above expression as below */
  println(a);
  a = a - 1;

  //  c) println (–2 * ( g – k ) +c); is not a valid expression because g is not declared

  /*  d)
    println(c = c ++); is not a valid expression
   But we can modify above expression as below */
  println(c)
  c = c + 1


  /*  e)
    println(c =++ c * a ++); is not a valid expression
    But we can modify above expression as below */
  c = c + 1;
  println(c * a);
  a = a + 1;

}
