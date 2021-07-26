object Leap {
  def leapYear(year: Int): Boolean = year match {
    case x if (year % 400 == 0 || year % 4 == 0) => true
    case x if (year % 100 == 0) => false 
    case _ => false  
  }
}
