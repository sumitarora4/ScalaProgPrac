package Exercises.ClassesFunTraits

object Problem3_ArbitraryParameters extends App {

  def arbitraryParameters(args: Int*): String = {

    val ag: Seq[Int] = args
    val result = args.mkString("::")
    result

  }

  print(arbitraryParameters(10,12,34))

}
