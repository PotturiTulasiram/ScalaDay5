package FunctionsInScala

object Functions extends App {

  val func = new MyFunction[Int,Int]{
    override def apply(ele: Int): Int = ele*ele
  }

  println(func(2))

  // Scala Has functions Types like function1 to function22 --- function1 ==> function takes one argument and gives a result
  val adder = new Function[Int,Int] {
    override def apply(ele:Int) : Int = ele+4
  }

  println(adder(2))

  //Function3 => function[A,B,C]
  val add = new Function2[Int,Int,Int] {
    override def apply(v1: Int, v2: Int): Int = v1+v2
  }


  println(add(2,5))
  //Function Types can also be represented as Function2[A,B,R] === (A,B) => R

  val concat = new Function2[String,String,String] {
    override def apply(v1: String, v2: String): String = v1+v2
  }
  println(concat("Hi,","How are you?"))


  //Curried  Function
  val fun = new Function[Int, Function1[Int,Int]] {
    override def apply(v1: Int): Int => Int = new Function[Int,Int] {
      override def apply(v2: Int): Int = v1+v2
    }
  }

  println(fun(2)(3))
}
trait MyFunction[A,B]{
  def apply(ele:A):B
}

