package Recursion

import scala.annotation.tailrec

object AppendList extends App{

  def append(list: List[Int], secondList: List[Int]): List[Int] = {

    @tailrec
    def appendTailRec(list: List[Int], secondList: List[Int]): List[Int] ={
      list match {
        case Nil => secondList
        case x::xs => appendTailRec(xs,x::secondList)
      }
    }

    appendTailRec(list.reverse, secondList)
  }

  println(append(List(1,2,3), List(5,9,10)))
}
