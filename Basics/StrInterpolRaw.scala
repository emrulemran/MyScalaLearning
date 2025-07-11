package variables

object StrInterpolRaw extends App {

  var donutName: String = "glazed"

  println(raw"My favorite donut is\t$donutName")

  // escape character:
  println("this is amy's birthday")
  println("He said, \"I will pay the bill on time.\" But he missed the deadline")

}