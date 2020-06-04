package Recursion

object FindMax extends App{

  def findMax(ints :Seq[Int]) : Int = {

    def evaluate(max :Int, counter :Int) : Int = {
      if (counter == ints.size) max
      else evaluate(if (ints(counter) > max) ints(counter) else max, counter +1 )
    }

    var max = 0
    evaluate(max, 0)
  }


  println(findMax(Seq(1,5,3,4, 10)))
}
