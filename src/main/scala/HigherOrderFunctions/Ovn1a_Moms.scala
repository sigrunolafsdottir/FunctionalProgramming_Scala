package HigherOrderFunctions

object Ovn1a_Moms extends App{

  val pricesExclusiveVAT = Seq(120, 700, 80)

  //3 ways to calculate moms
  val momsCalculation = (x: Int) => x * 1.25
  println(pricesExclusiveVAT.map(momsCalculation))

  println(pricesExclusiveVAT.map(x => x * 1.25))

  println(pricesExclusiveVAT.map(_ * 1.25))

}
