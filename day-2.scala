import utils._

def finalPos(input: String): Int = 
  var forward: Int = 0
  var depth: Int = 0
  var aim: Int = 0
  
  input
    .split('\n')
    .map(x => x.trim.split(' '))
    .foreach(x => x(0) match { 
      case "forward" => forward += x(1).toInt; depth += aim * x(1).toInt
      case "down" => aim += x(1).toInt
      case "up" => aim -= x(1).toInt
      case _ => println("error")
    })

  depth * forward

@main def day2: Unit =
  println(finalPos(fromFile("day-2-input.txt")))
