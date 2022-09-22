package Chapter3

object Maps {

  def main(args: Array[String]): Unit = {

//    by default map is immutable
    var myMap = Map[Int, String]()
    myMap += (1 -> "programming")
    myMap += (2 -> "in")
    myMap += (3 -> "scala")
    print(myMap)

//    using mutable map
    val myMutableMap = scala.collection.mutable.Map[Int, String]()
    myMutableMap += (1 -> "programming")
    myMutableMap += (2 -> "in")
    myMutableMap += (3 -> "scala")
    print(myMutableMap)

  }

}
