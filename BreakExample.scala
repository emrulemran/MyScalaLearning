package practice

class BreakExample {

}

object breakExample {
  import scala.util.control.Breaks._

  def main(args: Array[String]): Unit = {

    breakable {
      for (i <- 1 to 10 by 2) {
        if (i == 7)
          break // Break used here
        else
          println(i)
      }
    }

  }
}
