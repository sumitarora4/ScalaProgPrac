package Exercises.Numbers

object SmallestInVector extends App {

  val aVector = Vector(0, 10, 20, 47, -2, 99, -98)
  val asortedVector = aVector.sorted

  println("smallest=" + asortedVector.head)
  println("largest=" + asortedVector.tail.reverse.head)

  //  inbuild function
  println("smallest=" + aVector.min)
  println("largest=" + aVector.max)
}
