package Chapter3

object Reduce extends App {
 
  val list = Seq(2,4,6,1,5,7)
  
  val maxOfList = list.reduce((x,y) => x max y)
  println("maxOfList="+maxOfList)
  
  
  
}