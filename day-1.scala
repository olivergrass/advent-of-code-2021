
def count(input: String): Int =
  input
    .split('\n')
    .map(_.toInt)
    .sliding(2)
    .filter(x => x(0) < x(1))
    .size

def fromFile(fileName: String, encoding: String = "UTF-8"): String =
  val source = scala.io.Source.fromFile(fileName, encoding)
  try source.mkString finally source.close()
  
@main def day1: Unit =
  println(count(fromFile("day-1-input.txt")))
