package Traits

class Animal

trait Philosophical {

  def philosophize() {
    println("I consume memory, therefore I am2")
  }
}

class  Frog extends  Animal with Philosophical{
  override def toString: String = "green"

  override def philosophize() {
    println("Its ain't easy being "+ toString +"!")
  }
}





