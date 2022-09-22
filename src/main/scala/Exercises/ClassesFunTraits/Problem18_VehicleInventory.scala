package Exercises.ClassesFunTraits

object Problem18_VehicleInventory {

  case class VehicleType(name: String)

  trait VehicleInventory{

    def create(vehicleType: VehicleType)
    def read(vehicleType: VehicleType)
    def update(vehicleType: VehicleType)
    def delete(vehicleType: VehicleType)

  }

  class VehicleInventorySystem extends  VehicleInventory{

    override def create(vehicleType: VehicleType): Unit = println(s"create vehicle= $vehicleType")

    override def read(vehicleType: VehicleType): Unit = println(s"read vehicle= $vehicleType")

    override def update(vehicleType: VehicleType): Unit = println(s"update vehicle= $vehicleType")

    override def delete(vehicleType: VehicleType): Unit = println(s"delete vehicle= $vehicleType")
  }

  def main(args: Array[String]): Unit = {

    val vehicleTypeObj = VehicleType("bmw car 5 series")

    val vehicleInventorySystemObj = new VehicleInventorySystem

    vehicleInventorySystemObj.create(vehicleTypeObj)
    vehicleInventorySystemObj.read(vehicleTypeObj)
    vehicleInventorySystemObj.update(vehicleTypeObj)
    vehicleInventorySystemObj.delete(vehicleTypeObj)

  }


}
