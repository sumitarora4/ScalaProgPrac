package Exercises.ClassesFunTraits

object Problem4_BasketValidator extends App {

  class BasketValidator {
    def validator[T](item: T): Unit = {
      item match {
        case  i: String => println(s"found valid item $i")
        case  i: Int => println(s"Item $i of type Int is not valid")
        case  i: Double => println(s"Item $i of type Double is not valid")
        case  _ => println(s"Item $item should be removed from the basket")
      }
    }
  }

//  companion object
  object BasketValidator{
    def apply(): BasketValidator = new BasketValidator()
  }

  val basket = List("Cupcake", 2.99, 100L, 7, "Ice Cream")
  basket.map(BasketValidator().validator(_))
}
