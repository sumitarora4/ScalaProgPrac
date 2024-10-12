package Recursion

import scala.annotation.tailrec

object SumOfList {

  def main(args: Array[String]): Unit = {

//    Normal recursion
    def sumOfList(list: List[Int]): Int = {

      list match {
        case Nil => 0
        case head :: tail => head + sumOfList(tail)
      }
    }

   println( "Normal Recursion Result: "+sumOfList(List(1,2,3,4,5)))
  }


//  tail recursion
  def sum(list: List[Int]): Int = {
@tailrec
    def sumTailRec(list: List[Int], result: Int): Int ={
      list match {
        case Nil => result
        case head :: tail => sumTailRec(tail, head + result)
       }
    }

    sumTailRec(list,0)
  }

  println("Tail Recursive Solution:"+ sum(List(1,2,3,4,5)))

}
