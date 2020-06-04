package HigherOrderFunctions

object Ovn1d_MomsFunctionBuilder extends App{

  def momsFunctionBuilder(moms: Int): List[Double] => List[Double] = {
      (prices: List[Double]) =>
        prices.map(price => price * moms)
  }

  val pricesExclusiveMoms = List(100.0, 200.0, 80.0)
  def mySalaryFunction = momsFunctionBuilder(6)
  println(mySalaryFunction(pricesExclusiveMoms))

}
