
import Chapter3.Person
import org.scalatest.{Matchers, WordSpec}

class MainSpec extends WordSpec with Matchers{

  "A person" should {
    "be instantiated with name and age " in {
      val p1 = Person("Sumit", "Arora", 37)

      p1.firstName should be ("Sumit")
      p1.lastName should be ("Arora")
      p1.age should be (37)
    }
  }

  "Get a human readable representation of a person" in {
    val paul = Person(firstName = "Paul", lastName = "Smith", age = 42)
    paul.description should be("Paul Smith is 42 years old")
  }

  "The person companion object" should {
    val (akira, peter, nick) = (
      Person(firstName = "Akira", lastName = "Sakura", age = 12),
      Person(firstName = "Peter", lastName = "Müller", age = 34),
      Person(firstName = "Nick", lastName = "Tagart", age = 52)
    )

    "return a list of adult person" in {
      val ref = List(akira, peter, nick)
      Person.filterAdult(ref) should be(List(peter, nick))
    }

    "return an empty list if no adult is available" in {
      val ref = List(akira)
      Person.filterAdult(ref) should be(List.empty[Person])
    }
  }
}
