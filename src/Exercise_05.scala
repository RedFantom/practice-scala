/** Exercise 05: Overlap
  * Copyright (c) 2018 RedFantom
  * Available under GNU GPLv3, see LICENSE.md.md
  */


object Exercise_05 extends App {

  def toListOfInt(s: String) : Seq[Int] = {
    val i: String = s.strip().stripPrefix("[").stripSuffix("]")
    val j: Seq[String] = i.split(",").map(_.strip)
    return j.map(_.toInt)
  }

  println("Please enter two lists of elements.")
  val l1 = toListOfInt(scala.io.StdIn.readLine())
  val l2 = toListOfInt(scala.io.StdIn.readLine())

  val l = l1.intersect(l2)
  printf("The overlap between the two lists is: %s",
    l.mkString(", "))
}
