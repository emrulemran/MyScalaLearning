package test
import scala.collection.mutable.ArrayBuffer
object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    var names = ArrayBuffer[String]()
    names += "lily"
    names += "tulip"
    names += "dahlia"
    names += "holly"
    names += "pansy"
    names += "chrysanthemum"

    println(names)

    // also
    val persons = collection.mutable.ArrayBuffer("abdul", "bari", "chowdhury")

    // add one element
    persons += "dawoodi"

    // add two or more elements (method has a varargs parameter)
    persons += ("espahani", "ferdousi")

    // add multiple elements with any TraversableOnce type
    persons ++= Seq("gillani", "hyderabadi")

    // append one or more elements (uses a varargs parameter)
    persons.append("irani", "jibrani")
    println(persons)

    // remove one element
    persons -= "jibrani"
    println(persons)

    persons --= Seq("hyderabadi", "irani")
    println(persons)

    // remove()
    persons.remove(0)
    println(persons)

    // remove()
    persons.remove(1, 4)
    println(persons)

    //clear()
    persons.clear
    println(persons)

    // isEmpty
    println(persons.isEmpty)

  }
}
