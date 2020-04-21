package arraydemo

object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    val numbers = Array(10, 20, 30, 40)

    // Get first number in array with apply.
    val first = numbers.apply(0)
    println(first)

    var firstNum = numbers(0)
    println(firstNum)

    // Get last number.
    val last = numbers.apply(numbers.length - 1)
    println(last)

    var lastNum = numbers(numbers.length - 1)
    println(lastNum)

    var nums: Array[Int] = new Array[Int](5)
    nums(0) = 12
    nums(1) = 24
    nums(3) = 36
    nums(4) = 48

    // before overridding value at 4th index:
    println(nums.mkString(" "))

    // after overridding value at 4th index:
    nums(4) = 1000
    println(nums.mkString(" "))

  }

}
