package variables

object StrInterpolationobjectProperty {
  def main(args: Array[String]) = {

    // create a case class:
    case class Student(student_id: Int, student_name: String)

    // create an object of this case class:
    var student1: Student = Student(1, "Sam")

    // create another object of this case class:
    var student2: Student = Student(2, "John")

    // String interpolation of class properties requires: ${objectName.propertyName}

    println(s"The id and name of student1 object of case class Student ${student1.student_id} and ${student1.student_name}")
    println(s"The id and name of student2 object of case class Student ${student2.student_id} and ${student2.student_name}")

  }
}