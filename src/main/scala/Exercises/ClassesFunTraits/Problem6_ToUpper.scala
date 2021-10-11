package Exercises.ClassesFunTraits

object Problem6_ToUpper extends App{

  def toUpper(str : String):String = {
    str.toUpperCase
  }

  def toLower(str: String): String = {
    str.toLowerCase
  }

  // using function as an arguments
  def formatNames(name: String)(functionName: String =>  String): String = {
    functionName(name)
  }

  println(formatNames("Bob")(toUpper(_)))
  println(formatNames("SUMIT")(toLower(_)))

}
