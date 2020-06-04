package Recursion

object WriteBackwards extends App{

  def writeBackwards(ch :List[Char]) : Unit = {
    if (ch.size == 0) return
    writeBackwards (ch.tail)
    println(ch.head)
  }

  println(writeBackwards(List('h','e','l','l','o')))

}
