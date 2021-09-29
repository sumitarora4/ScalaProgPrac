package Exercises.Strings

/**
 * remove few items seq/list from a seq/list
 */
object RemoveSelectiveItems extends App{

                val basket = Seq("Milk", "Cheese", "Donuts", "Apples", "Bananas")

                // 1) syntax sugar for boolean function
                        val fruitItemsFunction:(String) => Boolean = (s) => s == "Apples" || s == "Bananas"

                val basketWithoutFruits1 = basket.filterNot(fruitItemsFunction)
                println(basketWithoutFruits1.mkString(","))

                // 2) normal boolean function
                        def fruitItemsFunction2(item: String): Boolean ={
                        item match{
                                case  "Apples"  => true
                                        case  "Bananas"  => true
                                        case _ => false
                                }
                        }

                val basketWithoutFruits2 = basket.filterNot(fruitItemsFunction2)
                println(basketWithoutFruits2.mkString(","))


                // 3) direct Contains check from fruitItems Seq
                        val fruitItems = Seq("Apples", "Bananas")
                val basketWithoutFruits = basket.filterNot{x =>
                        fruitItems.contains(x)
                        }

                println(basketWithoutFruits.mkString(","))

                // FORMATTED RESULTS IN XML
                println(basketWithoutFruits.mkString("<items values= \"", "|", "\"></items>"))

                }
