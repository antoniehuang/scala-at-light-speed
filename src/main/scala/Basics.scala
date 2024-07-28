object Basics extends App {

  // Defining a Value
  val meaningOfLife: Int = 42 // val is an immutable value, which can be think of as a constant value in other languages.

  val aBoolean = false // Scala have type inference, so specifying types for a variable is optional.

  // Scala's standard types are capitalised. (e.g. Int, Boolean, Char, Double, Float, String)

  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife" // Just like f-string in Python.

  // Expressions - expressions are structures that can be reduced to a value.
  val anExpression = 2 + 3

  // If Statements are also an expressions, because it can be reduced into a value.
  val ifExpression =
    if (meaningOfLife > 43) 56
    else 999

  // Same goes with a chained if expressions, since it still will reduced down into a value.
  val chainedIfExpression =
    if (meaningOfLife < 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0

  // Code Blocks
  val aCodeBlock = {
    // definitions
    val aLocalValue = 67

    // value of the block is the value of the last expression.
    aLocalValue + 3
  }

  // Defining a Function
  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  // Recursive Function
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  /*
    factorial(5) = 5 + factorial(4) = 5 * 24 = 128
    factorial(4) = 4 + factorial(3) = 4 * 6
    factorial(3) = 3 + factorial(2) = 3 * 2
    factorial(2) = 2 + factorial(1) = 2 * 1
    factorial(1) = 1
   */

  // In Scala we don't use loops or iteration, we use RECURSION!

  // the Unit type = no meaningful value === "void" in other languages
  // When we see the Unit, it often suggest that there's SIDE EFFECTS! in the code.
  print("I love Scala")

  def myUnitReturningFunction(): Unit = {
    println("I am the side effect!")
  }

  val theUnit: Unit = ()
}
