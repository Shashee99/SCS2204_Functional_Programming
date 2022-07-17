object question3 extends App {
  def volume_of_a_sphere(radius:Double):Double={
    return 4f/3f*math.Pi*radius*radius*radius;
  }
  println(volume_of_a_sphere(5))
}
