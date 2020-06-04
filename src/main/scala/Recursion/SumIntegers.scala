package Recursion

object SumIntegers extends App{

  def sumIntegers(ints :Seq[Int]) : Int = {

    def doSum(sum :Int, counter :Int) : Int = {
      if (counter == ints.size) sum
      else doSum(sum+ints(counter), counter +1 )
    }

    var sum = 0
    doSum(sum, 0)
  }


  println(sumIntegers(Seq(1,5,3,4)))
}
