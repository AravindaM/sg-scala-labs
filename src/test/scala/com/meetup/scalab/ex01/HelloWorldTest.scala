package com.meetup.scalab.ex01

import org.scalatest.{FlatSpec, ShouldMatchers}

class HelloWorldTest extends FlatSpec with ShouldMatchers {

  /*
  * Scala Objects
  *
  * Your job is to implement the objects and classes in
  * such a way that the tests in this suite all succeed.
  */
  "Scala Objects" should "say hello and echo" in {
    // More info on scalatest Matchers at http://www.scalatest.org/user_guide/using_matchers
    HelloWorld.sayHello should equal("Hello from Scala")
    HelloWorld.echo("Echo") should equal("Echo")
  }

  /*
  * Scala inheritance with Traits
  *
  * Your job is to implement the objects and classes in
  * such a way that the tests in this suite all succeed.
  *
  * Hint:
  * - combine the methods in HelloTrait and Worldtrait to
  *   create a new message
  */
  "Scala Traits" should "say hello" in {
      "Hello World" shouldBe HelloWorldWithTraits.hello
  }

  /*==============================================================*/

  /*
  * Scala Classes and companion Objects
  *
  * Your job is to implement the objects and classes in
  * such a way that the tests in this suite all succeed.
  *
  * Hint:
  * - A Class may have a companion Ojbect by the same name, defined
  *   in the same source file
  * - An Object can be constructed using an apply method
  */
  "Scala Companion Object" should "serve as factory" in {
      val helloWorldInstance = HelloWorldClassAndObject("Hello")
      "Hello" shouldBe helloWorldInstance.echo
  }

}
