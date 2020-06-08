package test

object ReverseString {

  def revStr(text: String): String = {

    return text.reverse;
  }

  def main(args: Array[String]): Unit = {
    println(revStr("abcd"))
  }
}
