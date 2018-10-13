/** Exercise 01: Basic User Input and Interaction
  * Copyright (c) 2018 RedFantom
  * Available under GNU GPLv3, see LICENSE.md.md
  */


object Exercise_01 extends App {
  print("Please enter your name: ")
  var name = scala.io.StdIn.readLine()
  print("What is your age? ")
  var age = scala.io.StdIn.readInt()
  printf("%s turns 100 in %d years.", name, 100 - age)
}
