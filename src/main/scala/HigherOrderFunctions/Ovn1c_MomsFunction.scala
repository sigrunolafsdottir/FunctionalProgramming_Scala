package HigherOrderFunctions

object Ovn1c_MomsFunction extends App{

  def calculateInclusiveMoms(prices: List[Double],
                momsFunction: List[Double] => List[Double]): List[Double] =
    momsFunction(prices)

  def normalMoms(prices: List[Double]): List[Double] =
    prices.map(price => price * 1.25)

  def livsmedelsMoms(prices: List[Double]): List[Double] =
    prices.map(price => price * 1.12)

  def bokMoms(prices: List[Double]): List[Double] =
    prices.map(price => price * 1.06)

  def momsfritt(prices: List[Double]): List[Double] =
    prices.map(price => price)

  val allPricesExclusiveMoms = List(30.0, 100.0, 80.0)
  println(calculateInclusiveMoms(allPricesExclusiveMoms, normalMoms))
  println(calculateInclusiveMoms(allPricesExclusiveMoms, livsmedelsMoms))
  println(calculateInclusiveMoms(allPricesExclusiveMoms, bokMoms))
  println(calculateInclusiveMoms(allPricesExclusiveMoms, momsfritt))

}
