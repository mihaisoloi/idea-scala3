package example

class MySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    assertEquals(obtained, expected)
  }

  test("The Hello object says hello") {
    assertEquals(Hello.greeting, "hello")
  }

  test("NonEmptyGreeting can't be empty") {
    assertEquals(Hello.nonEmptyGreeting, Left("did not satisfy nonEmptyString()"))
  }
}
