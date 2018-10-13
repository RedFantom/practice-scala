/** Exercise 03: Lists
  * Copyright (c) 2018 RedFantom
  * Available under GNU GPLv3, see LICENSE.md.md
  */


object Exercise_03 extends App {
  println("Please enter a list of elements in `[1, 2, 3]` format.")
  val string = scala.io.StdIn.readLine().stripPrefix("[").stripSuffix("]")
  val elements: Array[String] = string.split(",")
  val integers: Array[Int] = elements.map(_.strip().toInt)
  print("You entered the numbers: ")
  print(integers.mkString(", "))
}
