package Intro.mypackage



object helloworld {

  def giveMeFive(): Int = 5

  val kub = (x: Int) => x * x * x

  val x : Int = 3

  def main(args: Array[String]): Unit = {

    var y : Int = 5
    val glad = () => "Heja heja"
    def giveMeFive2(): Int = {5}

    println("Hello, Scala developer! "+x+" "+y+" "+giveMeFive() + " " +kub(5)+" "+glad())

    print("Enter your first name: ")
    val firstName = scala.io.StdIn.readLine()

    print("Enter your last name: ")
    val lastName = scala.io.StdIn.readLine()

    println(s"Your name is $firstName $lastName")

  }
}
