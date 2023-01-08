package Exercises.Strings

object CommonItems extends App{


        val basket1 = List("Cake", "Milk", "Cheese", "Toilet Paper")
        val basket2 = List("Bread", "Water", "Juice", "Milk", "Cheese")

        val commonItems = basket1 intersect(basket2)

        //  print(commonItems.mkString(","))

        commonItems.foreach(println)

        }
