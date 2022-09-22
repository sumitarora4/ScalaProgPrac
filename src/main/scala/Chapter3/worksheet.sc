class Shape(val x: Int, val y: Int){
  def description: String = s"Shape at ( $x , $y)"
}

class  Rectangle(x: Int, y: Int, val width: Int, val height: Int)
extends Shape(x, y){

  override def description: String = super.description + s" Rectanglge $width & $height"
}

val rect = new Rectangle(x = 0 , y = 3, width = 3, height = 2)
rect.description

// -----------------------------

case class City(name: String, urbanArea: Int)

object City{
  val London = City("London", 1234)
  val NY = City("Newyork", 12)
}

case class Person(first: String, last: String, city: City)

object Person{
  def apply(fullName: String, city: City): Person = {
    val splitName = fullName.split(" ")
    Person(splitName(0), splitName(1), city)
  }
}

Person("Sumit", "Arora", City.London)
Person("Abha Tripathi Arora", City.London)
Person.apply("Abeer Arora", City.NY)