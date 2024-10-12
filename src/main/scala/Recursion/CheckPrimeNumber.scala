package Recursion

object CheckPrimeNumber extends App {

  def prime(i: Int): Boolean = {

    def primeTailRec(currentDivisor: Int): Boolean = {

      if (currentDivisor > Math.sqrt(Math.abs(i))) true
      else i % currentDivisor != 0 && primeTailRec(currentDivisor + 1)

    }

    if (i == 1 || i == 0 || i == -1) false
    else primeTailRec(2)
  }

  println(prime(1))
  println(prime(2))
  println(prime(22))
  println(prime(11))
  println(prime(2003))
}
