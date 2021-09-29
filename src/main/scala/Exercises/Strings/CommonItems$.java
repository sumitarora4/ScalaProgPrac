package Exercises.Strings;object CommonItems extends App{


        val basket1 = Set("Cake", "Milk", "Cheese", "Toilet Paper")
        val basket2 = Set("Bread", "Water", "Juice", "Milk", "Cheese")

        val commonItems = basket1 intersect(basket2)

        //  print(commonItems.mkString(","))

        commonItems.foreach(println)

        }
