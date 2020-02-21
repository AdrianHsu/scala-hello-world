class ColorCalculator(_brand: String) {
  // constructor
  val color: String = if(_brand == "ASUS") {
    "black"
  } else if(_brand == "ACER") {
    "blue"
  } else {
    "white"
  }

  val brand: String = _brand
  def add(m: Int, n: Int): Int = m + n
}
