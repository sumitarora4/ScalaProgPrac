package Exercises.ClassesFunTraits

object Problem11_implicitUUID {

  def main(args: Array[String]): Unit = {

    case class Car(name: String, price: Double)

    // 1) first approach use a separate class with logic and implicit function
    class CarUUID(car: Car) {
        def uuid: String = s"${car.name} - ${car.name.hashCode}"
//      we can also use val instead of def here
//      val uuid: String = s"${car.name} - ${car.name.hashCode}"
    }
    object CarExtensions1{
      implicit def uuid(car: Car): CarUUID = new CarUUID(car)
    }

    //2) Better approach - use implicit class(which has logic) instead of implicit function
    object CarExtensions2 {
      implicit class CarUUID(car: Car) {
        def uuid: String = s"${car.name} - ${car.name.hashCode}"
      }
    }

    val bmw3 = Car("bmw 3 series", 20000)
    val bmw5 = Car("bmw 5 series", 50000)
    val vwPassat = Car("vw passat", 10000)
    val vwGolf = Car("vw golf", 12000)
    val mazda3 = Car("mazda 3", 15000)

    val carList = List(bmw3, bmw5, vwPassat, vwGolf, mazda3)

    import CarExtensions2._
    carList.foreach(car => println(car.uuid))
  }
}
