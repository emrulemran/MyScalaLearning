package variables

object StrInterpolFormatted extends App {

  var city = "NYC"
  var nab = "Queens"

  println(f"I live in$city%2s$nab")

  println(f"I live in$nab%20s $city")

  var price = 2.34

  println(f"gas price is $$$price%.5f") // Escaping $ with $$

}