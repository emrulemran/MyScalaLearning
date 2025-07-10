package variables

object VariableDeclaration extends App {

  var x = 25
  println(x)

  var y: Int = 10
  println(y)

  val a = 100

  println(a)

  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"
  println(favoriteDonut)

  //  Lazy initialization: Sometimes you may wish to delay the initialization of some variable until at the point where it is consumed by your application.
  // This is usually referred to as lazy initialization and we need to make use of the lazy keyword

  lazy val donutService = "initialize some donut service"

  println(donutService)

  //  Scala Supported Types:
  val donutsBought: Int = 5
  println("The type of the variable " + donutsBought + " is " + donutsBought.getClass())

  val bigNumberOfDonuts: Long = 100000000L
  println("The type of the variable " + bigNumberOfDonuts + " is " + bigNumberOfDonuts.getClass())

  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()
  println("The type of the variable " + nothing + " is " + nothing.getClass())
  
  
  
  // Declare a variable with no initialization: We've use the wildcard operator _ when defining our variable. Somewhere later in our code base, we can then assign a String value for our variable which in our case was "Plain Donut" String value.
  
  var abc:Int = _
  abc = 10
  println(abc)
  
  
  
}