package Exercises.ClassesFunTraits

object Problem10_CarStockOrder extends App{


  case class Car(name: String, price: Double)

//  define an aliased type named CarStock that will in effect, alias, Scala's Tuple2 type
//  and represent a tuple or pair of Car and Int.
  type CarStock = Tuple2[Car, Int]

  val vwpassatStock = new CarStock(Car("vw passat", 10000), 100)
  val vwGolfStock = new CarStock(Car("vw golf", 12000), 50)
  val bmw3Stock = new CarStock(Car("bmw 3 series", 20000), 200)
  val bmw5Stock = new CarStock(Car("bmw 5 series", 50000), 75)
  val mazdaStock = new CarStock(Car("mazda 3", 15000), 49)

  val carStockList = List(vwpassatStock, vwGolfStock, bmw3Stock, bmw5Stock, mazdaStock)

  orderByLowestStock((carStockList))

  def orderByLowestStock(carStockList:  List[(Car, Int)])= {
//   1) normal way to use foreach
    carStockList.sortBy(_._2).foreach( x => println(s"${x._1.name} stock = ${x._2}"))

//    2) foreach using case pattern
      carStockList.sortBy(_._2).foreach{case(car, stock) => println(s"${car.name} stock = $stock")}
    }


}
