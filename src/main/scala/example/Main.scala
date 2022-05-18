package example

import commons.Types.*

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
  lazy val nonEmptyGreeting = NonEmptyString("")
}
