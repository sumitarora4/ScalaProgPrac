package FunProgramming

/**
 * https://www.baeldung.com/scala/higher-order-functions
 * */
object HOF extends App{

  // Higher order function which return a function

  def mathOperation(name: String):(Int,Int) => Int = (x: Int, y: Int) =>
  {
    name match {
      case "add" => x + y
      case "mul" => x * y
      case "sub" => x - y
    }
  }

  def add: (Int,  Int) => Int = mathOperation("add")
  def mul:(Int, Int) => Int = mathOperation("mul")
  def sub:(Int, Int) => Int = mathOperation("sub")

  println(add(1,2))
  println(mul(1,2))
  println(sub(1,2))
 }
