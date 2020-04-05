package arraydemo

class ArrayTest {

  def showArrayValues(arr: Array[Character]) {
    for (a <- arr) // Traversing array elements
      print(a + " ")
    println("The 3rd element is: " + arr(2)) // accessing 3rd element elements using index 2
  }
}

object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    // a single-dimensional array
    var arr: Array[Int] = Array(1, 2, 3, 4, 5)

    // Traversing through array elements:
    for (a <- arr) {
      println(a)
    }

    // a single-dimensional array with defined size, output: 5 zeros
    var anarr = new Array[Int](5)
    for (a <- anarr) {
      println(a)
    }

    anarr(0) = 10
    anarr(1) = 20
    anarr(2) = 30
    anarr(3) = 40
    anarr(4) = 50
    // traversing through array after adding element values:
    for (a <- anarr) {
      println(a)
    }

    // Iterating by foreach Loop:
     anarr.foreach((x:Int)=>println(x + " ")) 
    
    
    var ca: Array[Character] = Array('a', 'c', 'd', 'e', 'f')

    var at = new ArrayTest
    at.showArrayValues(ca)

  }
}



package arraydemo
/*
 * Syntax:
 * var arrayName = Array.ofDim[ArrayType](NoOfRows,NoOfColumns) or
 * var arrayName = Array(Array(element...), Array(element...), ...)
 *
 */

object MultiDimArray {
  def main(args: Array[String]): Unit = {

    var arr = Array.ofDim[Int](2, 5) // a multidimensional array

    // Assigning values to first array
    arr(0)(0) = 1
    arr(0)(1) = 3
    arr(0)(2) = 5
    arr(0)(3) = 7
    arr(0)(4) = 9

    // Assigning values to second array
    arr(1)(0) = 2
    arr(1)(1) = 4
    arr(1)(2) = 6
    arr(1)(3) = 8
    arr(1)(4) = 10

    // getting the specific item (for e.g. 8) from the 2-d array:
    println(arr(1)(3))

    // Traversing elements by using loop
    for (i <- 0 to 1) { // <----  1 means there are 2 arrays
      for (j <- 0 to 4) { // <----  4 means there are 5 elements in each array
        print(arr(i)(j) + " ")
      }
      println()
    }

    // another example:
    var arr1 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))
    var arr2 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))
    var arr3 = Array.ofDim[Int](2, 5)

    for (i <- 0 to 1) { // Traversing elements using loop
      for (j <- 0 to 4) {
        arr3(i)(j) = arr1(i)(j) + arr2(i)(j)
        print(arr3(i)(j) + " ")

      }
      println()
    }

  }
}
