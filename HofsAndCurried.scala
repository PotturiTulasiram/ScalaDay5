package FunctionsInScala

object HofsAndCurried extends App {
  //Higher Order Functions are those take a funcrtion as a parameter pr return a function
  //example
  def nTimes(f:Int=>Int,n:Int,x:Int) :Int = {
    if(n<=0) x
    else nTimes(f,n-1,f(x))
  }
  val f:Int => Int = x=>x+1
  println(nTimes(f,4,1))


  //Curried Funcrions
  val adder : Int => Int => Int = (x:Int) => (y:Int) => x+y
  val add3 = adder(3)
  println(add3(3))//print(adder(3)(3))

  //functions with multiple parameters
  def formater(s:String)(f:Double) : String = s.format(f)

  val standardFormat : (Double => String) = formater("%4.2f")
  val preciseFormat : (Double => String) = formater("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}
