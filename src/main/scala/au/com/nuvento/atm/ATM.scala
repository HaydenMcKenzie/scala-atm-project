package au.com.nuvento.atm

import au.com.nuvento.atm.commands.Operations
import scala.io.StdIn.*
import scala.util.control.Breaks.break


object ATM {

  def userInteraction(): Unit = {
    // Main input
    val mathOperation = readLine()

    // Error handling
    if (mathOperation == "q") {
      println("Thank you")
      System.exit(0)
    }

    // Enter two numbers
    println("Enter first number: ")
    val firstNumber = readInt()
    println("Enter second number: ")
    val secondNumber = readInt()

    // add, minus, multiply or divide
    if (mathOperation == "1") {
      println(s"Your number is: " + Operations.add(firstNumber, secondNumber))
    } else if (mathOperation == "2") {
      val thirdNumber = firstNumber - secondNumber

      if (thirdNumber < 0) {
        println(s"$thirdNumber is under 0")
        break
      }
      println(s"Your number is: " + Operations.minus(firstNumber, secondNumber))
    } else if (mathOperation == "3") {
      println(s"Your number is: " + Operations.multiply(firstNumber, secondNumber))
    } else if (mathOperation == "4") {
      println(s"Your number is: " + Operations.divide(firstNumber, secondNumber))
    } else {
      println(s"$mathOperation is not an operation")
    }

    // Restart
    print("Enter an operation (1, 2, 3, 4): ")
    userInteraction()
  }

  def main(arg: Array[String]) = {
    while (true) {
      print("Enter an operation (1, 2, 3, 4): ")

      userInteraction()
    }
  }

}
