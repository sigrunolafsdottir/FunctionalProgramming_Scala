package HigherOrderFunctions

object SalaryRaiserExtended extends App{

  def promotion(salaries: List[Double],
                promotionFunction: List[Double] => List[Double]): List[Double] =
    promotionFunction(salaries)


  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)

  val allSalaries = List(10000.0, 20000.0, 30000.0, 40000.0)
  println(promotion(allSalaries, smallPromotion))
  println(promotion(allSalaries, hugePromotion))

}
