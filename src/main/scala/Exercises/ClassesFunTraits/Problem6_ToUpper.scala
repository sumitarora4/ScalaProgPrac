package Exercises.ClassesFunTraits

object Problem6_ToUpper extends App{

  def toUpper(str : String):String = {
    str.toUpperCase
  }

  // normal method definition
/*
  def toLower1(str: String): String = {
    str.toLowerCase
  }*/

  // function value
//  val toLower2: String => String = str => str.toLowerCase()

  // function value
  val toLower3 = (str: String) => str.toLowerCase()

  // using function as an arguments
  def formatNames(name: String)(functionName: String =>  String): String = {
    functionName(name)
  }

  println(formatNames("Bob")(toUpper))  // not passing any parameter by default it will take _
  println(formatNames("SUMIT")(toLower3(_)))

}
