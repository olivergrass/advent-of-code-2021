import utils._

def count(input: String): Int =
  input
    .split('\n')
    .map(_.toInt)
    .sliding(3)
    .map(_.sum)
    .sliding(2)
    .filter(x => x(0) < x(1))
    .size

@main def day1: Unit =
  println(count(fromFile("day-1-input.txt")))
