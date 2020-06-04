package Recursion

object CalculateInterest extends App{

  def getInterest(amount :Int, years: Int, interest: Int) : Double = {
    if (years == 0) amount
    else getInterest ((amount + amount*interest / 100), years-1, interest)
  }


  println(getInterest(100, 2, 10))

}
