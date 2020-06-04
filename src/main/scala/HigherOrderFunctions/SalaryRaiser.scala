package HigherOrderFunctions

object SalaryRaiser extends App{

  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)

  val allSalaries = List(10000.0, 20000.0, 30000.0, 40000.0)
  println(smallPromotion(allSalaries))
  println(greatPromotion(allSalaries))
  println(hugePromotion(allSalaries))

  private def promotion(salaries: List[Double],
                        promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  println(promotion(allSalaries, allSalaries => allSalaries * 1.1))
  println(promotion(allSalaries, allSalaries => allSalaries * allSalaries))

}
