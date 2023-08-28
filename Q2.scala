object Q2 {
  def countLetters(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)

    val totalLetterOccurrences = wordLengths.reduce((len1, len2) => len1 + len2)

    totalLetterOccurrences
  }

  def main(args: Array[String]): Unit = {
    print("Enter the list of words: ")
    val input = scala.io.StdIn.readLine()
    val words = input.split(" ").toList

    println("Total count of letter occurrences: " + countLetters(words))
  }
}
