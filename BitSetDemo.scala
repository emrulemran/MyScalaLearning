object BitSetDemo {

  import scala.collection.immutable.BitSet;

  def main(args: Array[String]): Unit = {

    var numBitSet = BitSet(12, 34, 34, 5, 65, 7, 67, 8, 7, 3, 23, 3, 45)

    println(numBitSet)

    numBitSet.foreach((x: Int) => print(x + " "))


    for (i <- numBitSet) {
      println(i)
    }

    // adding another element
    numBitSet += 1100
    println(numBitSet)

    // removing another element
    numBitSet -= 67
    println(numBitSet)
    
  }

}
