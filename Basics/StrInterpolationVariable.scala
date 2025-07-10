package variables

object StrInterpolationVariable {
  def main(args: Array[String]) = {

    var x: Int = 5
    var y: String = "five"

    println(s"The value of the variable is $x and is $y")
  }
}