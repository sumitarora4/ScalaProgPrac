package Exercises.ClassesFunTraits

object Problem19_CarsBikes {

  abstract class VehicleType(name: String)

  case class Car(name: String) extends VehicleType(name)
  case class Bike(name: String) extends VehicleType(name)

  trait VehicleInventory[V]{

    def create(vehicle: V)
    def read(vehicle: V)
    def update(vehicle: V)
    def delete(vehicle: V)

  }

  class VehicleInventorySystem[V] extends  VehicleInventory[V]{

    override def create(vehicleType: V): Unit = println(s"create vehicle= $vehicleType")
    override def read(vehicleType: V): Unit = println(s"read vehicle= $vehicleType")
    override def update(vehicleType: V): Unit = println(s"update vehicle= $vehicleType")
    override def delete(vehicleType: V): Unit = println(s"delete vehicle= $vehicleType")
  }

  def main(args: Array[String]): Unit = {

    val carBmw5 = Car("bmw car 5 series")
    val carMazda5 = Car("mazda car 3 series")
    val bikeHonda = Bike("honda bike firestorm")
    val bikeBmwR = Bike("bmw bike r 2000")

    val vehicleInventorySystemObj = new VehicleInventorySystem[VehicleType]

    vehicleInventorySystemObj.create(carBmw5)
    vehicleInventorySystemObj.read(carMazda5)
    vehicleInventorySystemObj.update(bikeHonda)
    vehicleInventorySystemObj.delete(bikeBmwR)

  }


}
