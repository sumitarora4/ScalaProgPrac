package Chapter3

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureForComprehension extends App{

//  create future
  val f1 = Future{Thread.sleep(800) ; 1}
  val f2 = Future{Thread.sleep(200); 2}
  val f3 = Future{Thread.sleep(400); 3}

//   run them in parallel in a for-comprehension
  val result: Future[Int] = for{
    r1 <- f1
    r2 <- f2
    r3 <- f3
  }yield (r1 + r2 + r3)

//  do whatever with the result
  result.onComplete{
    case Success(value) => println("result=" + value)
    case Failure(exception) => exception.printStackTrace()
  }

  Thread.sleep(3000)



}
