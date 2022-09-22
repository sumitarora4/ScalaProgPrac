package Exercises.ClassesFunTraits

object Problem17_CartItem {

   final case class CartItem(name: String, quantity: Int, price: Double)

  // case class should be final so that no class and case class can extend it
//   class test(age: Int) extends CartItem("sumit", age,3.3)

  object ShoppingCart{

    def totalCost(cartItem: CartItem, couponCode: Option[String]): Double = {
          couponCode match{
            case Some(x) => {
              if (x == "COUPON_1234") {
                val totalCost = cartItem.quantity * cartItem.price
                val discount = totalCost * 10 / 100
                totalCost - discount
              }
              else 0.0
            }
            case None => cartItem.quantity * cartItem.price
          }
    }
  }

  def main(args: Array[String]): Unit = {

    val cartItemObj  = CartItem("Chocolate", 10, 2.50)

    val withOutCoupon = ShoppingCart.totalCost(cartItemObj,None)
    println(s"total cost without coupon: $withOutCoupon")

    val withCoupon = ShoppingCart.totalCost(cartItemObj, Some("COUPON_1234"))
    println(s"total cost with coupon: $withCoupon")

  }
}
