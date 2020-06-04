package Recursion

object Fibonacci_variety extends App {

  def fib(prevPrev: Int, prev: Int, no: Int, counter: Int): Int ={
    val next = prevPrev + prev
    if (no == counter) {
      return next
    }
    fib(prev, next, no, counter+1)
  }

  def getFibonacciNo(no: Int): Int ={
    if (no == 1 || no == 2) no
    else fib(1, 2, no, 3)
  }

  println(getFibonacciNo( 6))

}
