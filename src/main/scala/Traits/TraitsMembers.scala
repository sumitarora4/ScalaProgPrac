package Traits

object TraitsMembers extends App{

  trait MyTrait{
    // abstract members/fields
    var x: Int

    //non - abstract members/fields
    var y = 10
    val z = 20
  }

  class TestClass extends MyTrait{

    var x = 1

    // no need to override non-abstract var field
    y = 11

    // override non-abstract val field
    override val z = 21

    def display{
      println(x +":"+ y +":"+ z)
    }

  }

  val testClassObj = new TestClass
  testClassObj.display
}
