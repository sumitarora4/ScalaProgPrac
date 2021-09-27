package Chapter3

object Sets {

  def main(args: Array[String]): Unit ={

// by default set is immutable
    var mySet = Set("Programming", "in")
    mySet += "scala"
    println(mySet)
    println(mySet.contains("on"))
  }

//  using mutable set
    val myMutableSet = scala.collection.mutable.Set("Love", "scala")
    myMutableSet += "forever"
    println(myMutableSet)


}