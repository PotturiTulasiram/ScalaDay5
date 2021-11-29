package FunctionsInScala

object AnonymouFunctions extends App {
  val add = new Function[Int,Int] {
    override def apply(v1: Int): Int = v1+2
  }

  //Anonymous Function for above function is as below
  val add1 = (x: Int) => x+2 // or val add: Int => Int = x => x+2
  println(add1(2))

  //For Multiple parameters
  val add2num: (Int,Int) =>Int = (a:Int,b:Int) => a+b

  println(add2num(2,3))

  //No parameters

  val s:() => Int = ()=>45
  //Anonymous Functions with no parameters should be called as below
  println(s())//Not println(s)

  val Increment: Int => Int = _+1  //equivalent to x => x+1
  val adder: (Int,Int) => Int = _+_ //equivalent to (x,y) => x+y

  val func1  = (x:Int) => (y:Int) => x+y
}
