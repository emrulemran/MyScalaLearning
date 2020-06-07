package test

object StringLengthWithoutWhiteSpace{

  def countLenWOWhiteSpaces(x: String): Int = {
    return (x.length() - x.count(_ == ' '))
  }

  def main(args: Array[String]): Unit = {
    println("The length without WS is: " + countLenWOWhiteSpaces("this is an easy task"))

  }

}
