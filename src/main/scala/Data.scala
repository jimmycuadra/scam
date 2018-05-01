package scam

import scala.io.Source

import java.nio.file.Path

import play.api.libs.json.Json

object Data {
  def loadData(path: Path): Option[Map[String, String]] = {
    val source = Source.fromFile(path.toString())
    val contents = try source.getLines().mkString("\n") finally source.close()
    val json = Json.parse(contents)
    json.asOpt[Map[String, String]]
  }
}
