package Exercises.Numbers

import scala.annotation.tailrec

// Merge two Sorted List and get sorted list as a result
// Note: this solution will not work with unsorted lists
object MergeList extends App{

  def merge(i: List[Int], j: List[Int]): List[Int] =
  {
//    @tailrec
    def mergeTailRec(i: List[Int], j: List[Int]): List[Int] = {

      (i, j) match {
        case (Nil, Nil) => Nil
        case (x :: xs, Nil) => i
        case (Nil, y :: ys) => j
        case (x :: xs, y :: ys) =>
          if (x <= y) {
            x :: mergeTailRec(i.tail, j)
          }
          else {
            y :: mergeTailRec(i, j.tail)
          }
      }
    }

    mergeTailRec(i, j)
  }
  println(merge(List(1,4,7,9), List(3,4,5,11,12,14)))
}
