package Chapter3

// find out average using map and reduce function
object Average {
  
  def main(args: Array[String]){
    
    val collection: List[Int] = List(1,5,2,5,7,3)
    
    //  make a tuple by appending 1 with every value
    val colMap: List[(Int, Int)]= collection.map( r => (r,1))
    println(colMap)
    
    // adding values at their corresponding positions and make a tuple
    val res: (Int, Int) = colMap.reduce((a,b) => (a._1 + b._1 ,a._2 + b._2 ))
    
    val avg = res._1 /res._2
    
    println("avg="+avg)
    
  }
}