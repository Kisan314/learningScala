object HelloWorld {
  def main(args: Array[String]): Unit = {
      println("Hello World")

    var result = add(2,5)
    println("addition of 2 and 5 is " + result)

  }

  def add(x:Int,y:Int):Int = {

    var z = x+y
    return z
  }
}
