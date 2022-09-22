package Traits

trait MyTrait{
    // abstract method
    def greeting{}
    // non-abstract method
    def display {
      println("this is scala trait")
    }
  }

// class needs to implement only abstract method
// no need to implement non-abstract method as it is already implemented
  class TestClass extends MyTrait{
    override def greeting: Unit = {
      println("Hello world")
    }
  }

object TraitUses extends App{
  val testClassObj = new TestClass
  testClassObj.greeting
  testClassObj.display
}
