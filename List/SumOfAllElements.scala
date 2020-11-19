package listdemo

object SumOfAllElements {
  def main(args: Array[String]): Unit = {
    val numbers = (1 to 10).toList
    var sum = 0
    numbers.foreach(sum += _)
    println(sum)

    var total = 0
    for (x <- numbers) {
      total += x
    }
    println(total)

  }
}
