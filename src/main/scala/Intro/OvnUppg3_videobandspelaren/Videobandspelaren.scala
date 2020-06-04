package Intro.OvnUppg3_videobandspelaren

object Videobandspelaren extends App {

  def getProgramLengthInMinutes(pStartH: Int, pStartM: Int, pStopH: Int, pStopM: Int): Int ={
    def deltaH = pStopH - pStartH
    def deltaM = pStopM - pStartM
    60*deltaH + deltaM
  }

  def lengthLeftInMinutes(fullLen: Int, takenLen: Int): Int ={
    fullLen - takenLen
  }

  def doesProgramFitOnVideoTape(lenVideo: Int, lenProgram: Int): Boolean ={
    if (lenVideo - lenProgram >= 0) true
    else false
  }

  def enoughTime(fullLen: Int, takenLen: Int, pStartH: Int, pStartM: Int, pStopH: Int, pStopM: Int): Boolean = {
    def pLen = getProgramLengthInMinutes(pStartH: Int, pStartM: Int, pStopH: Int, pStopM: Int)
    def vLen = lengthLeftInMinutes(fullLen: Int, takenLen: Int)
    return doesProgramFitOnVideoTape(vLen, pLen)
  }

  println(enoughTime(90, 30, 20, 0, 20, 30))
  println(enoughTime(90, 30, 20, 45, 21, 15))
  println(enoughTime(90, 30, 20, 30, 21, 15))
  println(enoughTime(90, 30, 20, 15, 21, 30))
  println(enoughTime(90, 80, 20, 0, 20, 30))
}
