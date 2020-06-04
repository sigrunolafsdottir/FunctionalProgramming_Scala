package HigherOrderFunctions

object SalaryFunctionBuilder extends App{

  def salaryBuilder(raiseInPercentage: Int): List[Double] => List[Double] = {
      (salaries: List[Double]) =>
        salaries.map(salary => salary + salary * raiseInPercentage)
  }

  val allSalaries = List(10000.0, 20000.0, 30000.0, 40000.0)
  def mySalaryFunction = salaryBuilder(10)
  println(mySalaryFunction(allSalaries))

}
