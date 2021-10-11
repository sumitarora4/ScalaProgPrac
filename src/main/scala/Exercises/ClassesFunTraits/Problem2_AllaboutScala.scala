package Exercises.ClassesFunTraits

/**
all these question are from
http://allaboutscala.com/tutorials/scala-exercises-solutions/
*/
object Problem2_AllaboutScala extends App{

  case class ShoppingCart(name: String, price: Double, quantity: Int)

  val item1 = ShoppingCart("vanilla ice cream", 2.99, 10)
  val item2 = ShoppingCart("chocolate biscuits", 3.99, 3)
  val item3 = ShoppingCart("cupcakes", 4.99, 5)

  val basket = List(item1,item2, item2)

  def printCartItems(basket: List[ShoppingCart]) = {
// we can use map or foreach function anyone of your choice to iterate basket
    basket.map{
      item =>
      println(s"${item.quantity} ${item.name} at $$${item.price} each")
    }
  }

  def printSelectiveCartItems(basket: List[ShoppingCart]) = {

    basket.map{
      x =>
      x.name match {
        case "vanilla ice cream" => println(s"found a vanilla ice cream")
        case _ => println(s"found another item")
      }
    }
  }

  printCartItems(basket)
  printSelectiveCartItems(basket)


}
