package Intro.OvnUppg1_AnimalClasses

//Övningsuppgift 1c
trait PrintableAnimal{
  def printAnimalType(): Unit = {
    println("I am an unknown animal")
  }
  def printNumberOfLegs(): Unit = {
    println("I have an unknown number of legs ")
  }
  def printEverything(): Unit = {
    println("There is not much to know about me")
  }
}


class AnimalA  (var animalType: String, var legs: Int ) extends PrintableAnimal {

  override def printAnimalType(): Unit = {
    println(animalType)
  }
 override def printNumberOfLegs(): Unit = {
    println(legs)
  }
  override def printEverything(): Unit = {
    println(s"I'm a $animalType with $legs legs.")
  }

  override def toString: String =
    s"I'm a $animalType with $legs legs."
}


class AnimalB extends PrintableAnimal ()  {
  private var _legs = 0
  private var _animalType = "dog"

  def legs = _legs
  def legs_= (newValue: Int): Unit = {
     _legs = newValue
  }

  def animalType = _animalType
  def animalType_= (newValue: String): Unit = {
    _animalType = newValue
  }

  override def printAnimalType(): Unit = {
    println(animalType)
  }

  override def printNumberOfLegs(): Unit = {
    println(legs)
  }
  override def printEverything(): Unit = {
    println(s"I'm a $animalType with $legs legs.")
  }

  override def toString: String =
    s"I'm a $animalType with $legs legs."
}
