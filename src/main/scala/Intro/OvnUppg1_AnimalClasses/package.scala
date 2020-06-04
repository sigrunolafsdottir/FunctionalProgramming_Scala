package Intro.OvnUppg1_AnimalClasses


object helloworld {

  def main(args: Array[String]): Unit = {

    //Övningsuppgift 1a
    val a = new Animal("cat", 4)
    val b = new Animal("bird", 2)

    println(a.animalType+" "+a.legs)
    b.printAnimalType()
    b.printNumberOfLegs()

    new Animal("spider", 8).printEverything()

    //Övningsuppgift 1b
    val d = new Animal2
    d.legs = 2
    d.animalType = "human"

    d.printAnimalType()
    d.printNumberOfLegs()

//Övninsguppgift c
    val e = new AnimalA("cat", 4)
    val f = new AnimalA("bird", 2)

    println(e.animalType+" "+e.legs)
    f.printAnimalType()
    f.printNumberOfLegs()

    val g = new AnimalB
    g.legs = 2
    g.animalType = "human"

    g.printAnimalType()
    g.printNumberOfLegs()

    //Övningsuppgift d
    val animals = Seq(a,b,d,e)
    animals.foreach(println)
    for (n <- animals) println(n)

    //Övningsuppgift e
    val javaAnimal = new AnimalJava("syrsa", 6)
    javaAnimal.printEverything()
    val zoo = Seq(a,b,javaAnimal)
    for (n <- zoo) println(n)


  }
}
