package stringz

object StringInterpolation {

  def main(args: Array[String]): Unit = {

    //    s interpolator:
    //    Prepending 's' before a string allows us to use variables in it with '$'

    var name: String = "John";
    var city: String = "New York City";
    println(s"Hi, I am $name and I live in $city")

    var num1: Int = 12;
    var num2: Int = 24;
    println(s"The sum of $num1 and $num2 is ${num1 + num2}");

    // f interpolator: used for formatting

    val value = 77.00000000
    val grade: Char = 'A'
    println(s"The number is $value")
    println(f"The number is $value%.2f")
    println(f"$name%s says the number is $value%.3f and it is grade $grade%c")

    // raw interpolator prints raw (as it is) string:
    println("Raw string: " + raw"$name%s says the number is $value%.3f and it is grade $grade%c")
    println("Formatted string: " + f"$name%s says the number is $value%.3f and it is grade $grade%c")
    println("Formatted string: " + f"$name%s says the number is $value%.3f \n and it is grade $grade%c")
  }
}