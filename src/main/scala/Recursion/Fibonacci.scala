package Recursion

object Fibonacci extends App {

  println(fib(1, 2))

  def fib(prevPrev: Int, prev: Int) {
    val next = prevPrev + prev
    println(next)
    if (next > 100) System.exit(0)
    fib(prev, next)
  }

}
