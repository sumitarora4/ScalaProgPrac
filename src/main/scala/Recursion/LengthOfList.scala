package Recursion

import scala.annotation.tailrec

object LengthOfList extends App{

  def length(list: List[Int]): Int = {

    @tailrec
    def lengthTailRec(remainingList: List[Int], counter: Int): Int = {

      remainingList match{
        case Nil => counter
        case x:: xs => lengthTailRec(xs, counter +1)
      }
    }
    lengthTailRec(list, 0)
  }

  println(length(List(1,2,3)))
}
