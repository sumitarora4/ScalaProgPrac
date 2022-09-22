package Exercises.ClassesFunTraits

object Problem14_VehicleAbstract {

  def main(args: Array[String]): Unit = {

    abstract class Vehicle( val property: String)

    case class Car(override val property: String) extends Vehicle(property: String)
    case class Bike(override val property: String) extends Vehicle(property: String)

    object VehicleReport{
      def printVehicles[S <: Vehicle](vehicleList: List[S]): Unit= {
        vehicleList.foreach(x => println(x.property))
      }
    }

    val bmw3: Car = Car("bmw 3 series")
    val vwgolf: Car = Car("vw golf")
    val bmwg: Bike = Bike("bmw g 310 r bike")
    val fire: Bike = Bike("fire storm bike")
    val vehicleList = List(bmw3, vwgolf, bmwg, fire)

    VehicleReport.printVehicles(vehicleList)

  }
}
