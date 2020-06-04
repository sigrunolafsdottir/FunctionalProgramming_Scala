package HigherOrderFunctions

object Ovn1b_MomsFunctions extends App{

  def normalMoms(prices: List[Double]): List[Double] =
    prices.map(price => price * 1.25)

  def livsmedelsMoms(prices: List[Double]): List[Double] =
    prices.map(price => price * 1.12)

  def bokMoms(prices: List[Double]): List[Double] =
    prices.map(price => price * 1.06)

  def momsfritt(prices: List[Double]): List[Double] =
    prices.map(price => price)

  val allPricesExclusiveMoms = List(30.0, 100.0, 80.0)
  println(normalMoms(allPricesExclusiveMoms))
  println(livsmedelsMoms(allPricesExclusiveMoms))
  println(bokMoms(allPricesExclusiveMoms))
  println(momsfritt(allPricesExclusiveMoms))

}
