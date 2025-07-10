package variables

object StrInterpolationEvaluateExpr {

  // String interpolation with expressions by using the curly braces

  def main(args: Array[String]) = {

    var num: Int = 10

    println(s"Are we going to get 10 dollars? ${num == 10}")

  }
}