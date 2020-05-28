package practice

class ExceptionExample2 {
  def checkAge(age: Int) = {
    if (age < 18)
      throw new ArithmeticException("You are not eligible")
    else println("You are eligible")
  }
}

object MainObject {
  def main(args: Array[String]) {
    var obj = new ExceptionExample2()
    obj.checkAge(10)

  }
}  
