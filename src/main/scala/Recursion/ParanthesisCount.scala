package Recursion

object ParanthesisCount extends App{

  def paranthesisCount(word :String, count: Int) : Int = {
    if (word.size == 0) return count
    if (word.head == '(') {
      paranthesisCount(word.tail, count + 1)
    }
    else if (word.head == ')') {
      paranthesisCount(word.tail, count -1)

    }
    else return paranthesisCount(word.tail, count)
  }

  def areParanthesisEqual(word :String): Boolean ={
    if (paranthesisCount(word, 0) == 0) true else false
  }


  println(areParanthesisEqual("((v))"))
  println(areParanthesisEqual("(((((v))"))

}
