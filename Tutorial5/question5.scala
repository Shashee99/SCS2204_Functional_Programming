object question5 extends App {

  def evenAddition(N:Int):Int= {
    if(N==0) return 0;
    else
      if (N%2==0) return N+evenAddition(N-1);
      else evenAddition(N-1);
  }
  print(evenAddition(10))
}
