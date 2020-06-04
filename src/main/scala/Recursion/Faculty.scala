package Recursion

object Faculty extends App{

  println(factorial(5))
  println(factorial2(5))

  // 1 - basic recursive factorial method
  def factorial(n: Int): Int = {
    if (n == 0) 1
    else  n * factorial(n-1)
  }

  // 2 - with tail recursion
  def factorial2(n: Int): Int = {
    def factorialAccumulator(acc: Int, n: Int): Int = {
      if (n == 0) acc
      else factorialAccumulator(n*acc, n-1)
    }
    factorialAccumulator(1, n)
  }

}
