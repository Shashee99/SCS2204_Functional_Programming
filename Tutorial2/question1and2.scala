object question1and2 extends App{

  /* multiple assigment in the form of k = i = j = 2 is not available for scala variable*/

  var k:Int = 2;
  var i:Int = k;
  var j:Int = i;

  var m:Int = 5;
  var n:Int = m;

  var f:Float = 12.0f;
  var g:Float = 4.0f;

  var c:Char = 'X';

  println(k+12*m)   /*(a) is a valid expression and it prints 62*/
  println(m/j)      /*(b) is a valid expression and it prints 2*/
  println(m/j*j)     /*(c) is a valid expression and it prints 4*/
  println(f+10*5+g)   /*(d) is a valid expression and it prints 66.0*/
 /*println(++i * n);  ++ is not valid expression but we can change it as below and it prints 15 as out put*/
  println((i+1)*n)



}
