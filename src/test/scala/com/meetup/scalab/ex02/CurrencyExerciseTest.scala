package com.meetup.scalab.ex02

import org.scalatest.{FlatSpec, ShouldMatchers}

class CurrencyExerciseTest extends FlatSpec with ShouldMatchers {

  "Exercise 1: Creating a Euro" should "be initialized correctly" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val e = new Euro(1, 5)
    //      e.euro shouldBe 1
    //      e.cents shouldBe 5
  }

  it should "have correct default value for cents" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val e = new Euro(2)
    //      e.euro shouldBe 2
    //      e.cents shouldBe 0
  }

  it should "convert amount correctly to cents" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val e = new Euro(2, 45)
    //      e.inCents shouldBe 245
  }

  it should "be created by cents" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val e = Euro.fromCents(245)
    //      e.euro shouldBe 2
    //      e.cents shouldBe 45
  }

  it should "add another euro correctly" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val res = new Euro(1, 50) + new Euro(2, 70)
    //      res.euro shouldBe 4
    //      res.cents shouldBe 20
  }

  it should "multiply correctly by a factor" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val res = new Euro(1, 50) * 3
    //      res.euro shouldBe 4
    //      res.cents shouldBe 50
  }

  "Exercise 2: an Euro" should "be a cubclass of Currency" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val e: Currency = new Euro(2, 5)
    //      e.symbol shouldBe "EUR"
  }

  it should "have correct toString representation" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val e = new Euro(2, 5)
    //      e.toString shouldBe "EUR: 2,05"
    //      val e2 = new Euro(2)
    //      e2.toString shouldBe "EUR: 2,--"
  }

  "Exercise 3: Euro with Order trait" should  "be correctly orderable" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      val e1 = new Euro(1, 5)
    //      val e2 = new Euro(4, 53)
    //      val e3 = new Euro(8, 10)
    //      e3 > e1 must beTrue
    //      val list = List(e2, e1, e3)
    //      list.sorted shouldBe List(e1, e2, e3)
  }

  "Exercise 4: Implicit class" should "add *(euro:Euro) (multiply) method to Int" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      implicit val defaultConverter = DefaultCurrencyConverter
    //      import Euro._
    //      val res = 3 * new Euro(2, 50)
    //      res.euro shouldBe 7
    //      res.cents shouldBe 50
  }

  it should "implicitly convert from euro to dollar" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      implicit val defaultConverter = DefaultCurrencyConverter
    //      val e: Euro = new Dollar(1, 5)
    //      e.euro shouldBe 1
    //      e.cents shouldBe 42
  }


  "Exercise 5: Implicit parameter" should "make currency converter plugable" in {
    fail("Remove that fail statement, uncomment below and fix")
    //      implicit object anotherConverter extends DefaultCurrencyConverter {
    //        override val conversionRate = 1.2
    //      }
    //      val e: Euro = new Dollar(1, 5)
    //      e.euro shouldBe 1
    //      e.cents shouldBe 26
  }

}
