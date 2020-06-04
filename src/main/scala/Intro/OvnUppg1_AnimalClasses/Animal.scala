package Intro.OvnUppg1_AnimalClasses

//Övninsguppgift 1a
class Animal  (var animalType: String, var legs: Int ) {

  def printAnimalType(): Unit = {
    println(animalType)
  }
  def printNumberOfLegs(): Unit = {
    println(legs)
  }
  def printEverything(): Unit = {
    println(s"I'm a $animalType with $legs legs.")
  }

  override def toString: String =
    s"I'm a $animalType with $legs legs."

}

//Övninsguppgift 1b
class Animal2 ()  {
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

  def printAnimalType(): Unit = {
    println(_animalType)
  }

  def printNumberOfLegs(): Unit = {
    println(_legs)
  }
  def printEverything(): Unit = {
    println(s"I'm a $animalType with $legs legs.")
  }

  override def toString: String =
    s"I'm a $animalType with $legs legs."
}
