package Chapter3

object EitherLeftRight extends App{

  /**
   * A method to demonstrate how to declare that a method returns an Either,
   * and code that returns a Left or Right. 'Left' is a String that represents
   * the potential error, and 'Right' is an Int that contains the value you
   * want when everything goes well.
   * https://alvinalexander.com
   */
  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }

/*  def divideAbyB(a:Int, b: Int): Either[String, Int] = {
    a/b
  }*/

  println(divideXByY(1, 0))
  println(divideXByY(1, 1))

//   a few different ways to use Either, Left, and Right
  divideXByY(1, 0) match {
    case Left(s) => println(s"Error: $s")
    case Right(i) => println(s"Answer: $i")
  }

  divideXByY(1, 1) match {
    case Left(s) => println(s"Error: $s")
    case Right(i) => println(s"Answer: $i")
  }
}
