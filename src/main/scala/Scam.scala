package scam

class Scam(private val input: Map[String, String]) {
  private val data = collection.mutable.Map(input.toSeq: _*)

  def get(key: String): Option[String] =  data.get(key)

  def set(key: String, value: String): Unit =  data.update(key, value)

  def delete(key: String): Unit = data -= key
}
