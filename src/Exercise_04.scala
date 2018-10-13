/** Exercise 04: Divisors
  * Copyright (c) 2018 RedFantom
  * Available under GNU GPLv3, see LICENSE.md.md
  */
import scala.collection.mutable.ListBuffer


object Exercise_04 extends App {
  print("Please enter a number: ")
  val num: Int = scala.io.StdIn.readInt()
  var list: ListBuffer[Int] = ListBuffer[Int]()
  for(i: Int <- 1 to num) {
    if (num % i == 0) {
      list += i
      printf("%d is a divisor of %d.\n", i, num)
    }
  }
  if (list.length == 2)
    println("Yay! Your number is a prime!")
}
