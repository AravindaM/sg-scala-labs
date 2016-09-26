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
      // The === operator used below is not an operator at all but a method in the
      // JUnitSuite super class, which is part of the ScalaTest library. it behaves
      // as a traditional assertEquals but produces very clear assertion errors when
      // values don't match. In Scala, methods can be used as if they were operators.
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
      "Hello" === helloWorldInstance.echo
  }

}
