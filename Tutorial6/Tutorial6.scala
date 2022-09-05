object Tutorial6 extends App {

//  Alphabet
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


//  part A

//  Encrypt Function
  val Encrypt = (C:Char,key:Int,alpha:String)=>alpha((alpha.indexOf(C.toUpper)+key)%alpha.size);
//  Decrypt Function
  val Decrypt = (C:Char,key:Int,alpha:String)=>alpha((alpha.indexOf(C.toUpper)-key)%alpha.size);


//  Part B

//  Cipher function
  val cipher = (algo:(Char,Int,String)=>Char,inputString:String,key:Int,alpha:String)=>inputString.map(algo(_,key,alpha))

  val enc= cipher(Encrypt,"hello",2,alphabet)

  println("Encrypt : "+enc)

  val dec = cipher(Decrypt,enc,2,alphabet)
  println("Decrypt : "+dec)





}
