package Exercises.Numbers

object RemoveConsecutiveDuplicates {

  def main(args: Array[String]): Unit = {

    val list = Seq(1,2,2,3,4,4,2,2,4)

    val res = list.foldRight[List[Int]](Nil){
      case(x, xs) =>
        if(xs.isEmpty || xs.head != x){
          x :: xs
        }
        else{
          xs
        }
    }

    println(res)


  /*  list.foldLeft[List[Int]](Nil){
      case (x, xs) =>
        if (xs.isEmpty || xs.head != x) {
          x :: xs
        }
        else {
          xs
        }
    }*/

  }
}
