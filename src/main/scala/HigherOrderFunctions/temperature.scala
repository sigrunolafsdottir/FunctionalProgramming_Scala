package HigherOrderFunctions

object temperature extends App {

  case class WeeklyWeatherForecastt(temperatures: Seq[Double]) {

    private def convertCtoF(temp: Double) = temp * 1.8 + 32

    def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)

  }
  println(WeeklyWeatherForecastt(Seq(1,5,3,4, 10)).forecastInFahrenheit)

}
