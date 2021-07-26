class School {
  type DB = Map[Int, Seq[String]]
  private var _database: DB = Map.empty

  def add(name: String, g: Int) = {
    val newVal = grade(g) match {
      case Nil => Seq(name)
      case x => x ++ Seq(name)
    }

    _database = db ++ Map(g -> newVal.sorted)
  }

  def db: DB = _database

  def grade(g: Int): Seq[String] = {
    db.getOrElse(g, Nil)
  }

  def sorted: DB = {
    db.toSeq.sortBy(_._1).toMap
  }
}

