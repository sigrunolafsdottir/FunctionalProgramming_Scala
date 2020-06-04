package Intro.OvnUppg3b_videoBlocks

object VideoBlocks extends App{

  def enoughTime(fullLen: Int, takenLen: Int, pStartH: Int, pStartM: Int, pStopH: Int, pStopM: Int): Boolean = {

    def getProgramLengthInMinutes(): Int ={
      def deltaH = pStopH - pStartH
      def deltaM = pStopM - pStartM
      60*deltaH + deltaM
    }

    def lengthLeftInMinutes(): Int ={
      fullLen - takenLen
    }

    def doesProgramFitOnVideoTape(deltaVideo: Int, lenProgram: Int): Boolean ={
      if (deltaVideo - lenProgram >= 0) true
      else false
    }

    return doesProgramFitOnVideoTape(lengthLeftInMinutes(), getProgramLengthInMinutes())
  }

  println(enoughTime(90, 30, 20, 0, 20, 30))
  println(enoughTime(90, 30, 20, 45, 21, 15))
  println(enoughTime(90, 30, 20, 30, 21, 15))
  println(enoughTime(90, 30, 20, 15, 21, 30))
  println(enoughTime(90, 80, 20, 0, 20, 30))
}

