package Exercises.Strings

// I/P - {sumit_kuamr_arora, sumit.kumar.arora, amit-gupta, amit.gupta}
// O/P - {sumit kumar arora, amit gupta}

object Problem1_NameFilter extends App{

  val aSet = Set("sumit_kumar_arora", "Sumit.kumar.arora", "amit-gupta", "amit.gupta")

  val newSet = aSet.map{
    x => x.toUpperCase().replaceAll("[^A-Za-z0-9]"," ")
  }

  println(newSet)

}
