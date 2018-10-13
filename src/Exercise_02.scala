/** Exercise 02: Basic User Input and Interaction
  * Copyright (c) 2018 RedFantom
  * Available under GNU GPLv3, see LICENSE.md.md
  */


object Exercise_02 extends App {
  print("Please enter a number: ")
  val num: Int = scala.io.StdIn.readInt()
  if (num % 2 == 0) {
    if (num % 4 == 0)
      println("Your number was a multiple of four.")
    else
      println("Your number was even.")
  } else
    println("Your number was odd.")
}
