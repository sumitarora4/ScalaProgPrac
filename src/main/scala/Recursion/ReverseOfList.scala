package Recursion

import scala.annotation.tailrec

object ReverseOfList extends App{

  def reverse(list: List[Int]): List[Int] = {

    @tailrec
    def reverseTailRec(remainingList: List[Int], accumulator: List[Int]): List[Int] = {
      remainingList match{
        case Nil => accumulator
        case x::xs => reverseTailRec(xs, x::accumulator)
      }
    }

    reverseTailRec(list, Nil)
  }

  println(reverse(List(2,5,6)))
}
