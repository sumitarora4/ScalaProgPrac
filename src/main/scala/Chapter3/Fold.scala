package Chapter3

object Fold {

  def main(args: Array[String]){
    
    val list: Seq[Int] = Seq(1,3,5,6,8,2)
    // in fold function you can define initial value like 0 from which you will
    // add Seq values
    val sum: Int= list.fold(0)((a,b) => a + b)
    println("sum="+ sum)
    
    
    val list2 = Seq("Sumit", "Kumar", "Arora")
    
    val concat2 = list2.fold("")((a,b) => a + "-"+b)
    println(concat2)
    
    
    // reduce function only returns value from same datatype, That also means we can control the type of the object to return.
    // because its initial value is the first value from the list
    val list3 = Seq("Sumit", "Kumar", "Arora")
    
    val concat3 = list3.reduce((a,b) => a + "-"+b)
    println(concat3)
    
    
  }
}