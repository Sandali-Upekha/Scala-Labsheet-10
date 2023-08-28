object Main {
  def calAvg(Celtemps: List[Double]): Double = {
    val Fahrtemps = Celtemps.map(celsius => (celsius * 9 / 5) + 32)

    val sumInFahrenheit = Fahrtemps.reduce((temp1, temp2) => temp1 + temp2)

    val averageFahrenheit = sumInFahrenheit / Fahrtemps.length.toDouble

    averageFahrenheit
  }


  def main(args: Array[String]): Unit = {
    print("Enter temperatures in Celsius:")
    val input = scala.io.StdIn.readLine()
    val temperatures = input.split(" ").map(_.toDouble).toList

    println("Average Fahrenheit temperature: " + calAvg(temperatures) )

  }
}