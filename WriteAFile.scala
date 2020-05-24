package inout

import java.io.PrintWriter
import java.io.File

object WriteAFile {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("C:\\Users\\Desktop\\output\\Test.txt"))


    for (i <- 1 to 10) {
      writer.write(i + ": Hello Scala\n")

    }

    writer.close()
  }
}
