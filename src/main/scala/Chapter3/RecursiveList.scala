package Chapter3

object RecursiveList extends App{

  def reverse(list: List[Int]): List[Int] = {

   /* def reverseTailRec(list:List[Int], result: List[Int]): List[Int] = {

      if(list.isEmpty) result
      else reverseTailRec(list.tail, list  )
    }

    reverseTailRec(list, Nil)*/

    list.foldLeft(List.empty[Int]){ (x,y) => y::x

    }
  }

  println(reverse(List(1,2,3)))




}
