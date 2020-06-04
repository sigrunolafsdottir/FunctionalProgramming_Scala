package Intro.OvnUppg2_GuessTheNumber

import java.util.concurrent.ThreadLocalRandom


object RandomGame extends App{
    var randomNumber : Int = ThreadLocalRandom.current.nextInt(1, 10 + 1)
    println("Gissa en siffra mellan 1 och 10")
    while(true) {
      val guessed: Int = scala.io.StdIn.readInt();
      if (randomNumber == guessed) {
        println("Det var rätt.")
        randomNumber = ThreadLocalRandom.current.nextInt(1, 10 + 1)
        println("Gissa en siffra mellan 1 och 10")
      }
      else {
        if (randomNumber > guessed) {
          println("För lågt, gissa igen")
        }
        else if (randomNumber < guessed) {
          println("För högt, gissa igen")
        }
      }
    }
}
