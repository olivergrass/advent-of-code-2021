package utils

def fromFile(fileName: String, encoding: String = "UTF-8"): String =
  val source = scala.io.Source.fromFile(fileName, encoding)
  try source.mkString finally source.close()
  