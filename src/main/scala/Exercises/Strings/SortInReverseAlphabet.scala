package Exercises.Strings

import scala.collection.immutable.TreeMap

object SortInReverseAlphabet extends  App {

  print(ReverseAlphabet.childrenToAge.mkString(","))

}

object ReverseAlphabet extends  Ordering[String]{
  override def compare(x: String, y: String): Int = y.compareTo(x)

  val childrenToAge = TreeMap(
            ("Bill",9),
            ("Jonny",8),
            ("Tommy",11),
            ("Cindy", 13)
            )(ReverseAlphabet)
}


