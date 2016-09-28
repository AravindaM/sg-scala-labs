package com.meetup.scalab.ex05

import com.meetup.scalab.ex05.ListManipulation02.Person
import ListManipulation02._
import org.scalatest.{ShouldMatchers, FlatSpec}

/**
  * Scala advanced Lists
  *
  * Your job is to implement the objects and classes in
  * such a way that the tests in this suite all succeed.
  *
  * One exercise consists of rewriting imperatively written code to a style that is more functional.
  */

class ListManipulation02Test extends FlatSpec with ShouldMatchers {

  "A Scala List" should "find max int in list" in {
      9 shouldBe maxElementInList(List(1, 9, 4, 9, 8))
      25 shouldBe maxElementInList(List(1, 7, 5, 17, 25, 24, 22, 19))
  }

  it should "calc sum of same positioned elements in two lists" in {
      List(2, 8, 14) shouldBe sumOfTwo(List(1, 5, 9), List(1, 3, 5))
      //if one of the lists is empty return the ones with values
      List(1, 2, 3) shouldBe sumOfTwo(List(1, 2, 3), List())
      List(1, 2, 3) shouldBe sumOfTwo(List(), List(1, 2, 3))
  }

  it should "calc sum of same positioned elements in many lists" in {
      List(12, 15, 18) shouldBe sumOfMany(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
  }

  it should "rewrite imperative to functional" in {
      //This unit test succeeds! But, the code that is called is written 'Java style',
      //it contains a lot of boilerplate code. Your job is to rewrite the code, get rid of the
      //loops and variables, and use only functions.
      val anton1 = Person(15, "Anton1", "Jansen")
      val anton2 = Person(17, "Anton2", "Janssen")
      val anton3 = Person(18, "Anton3", "Jansssen")
      val peter1 = Person(17, "Peter1", "Peterson")
      val peter2 = Person(19, "Peter2", "Petersson")
      val jason = Person(21, "Jason", "Jasonsson")

      val result = separateTheMenFromTheBoys(List(jason, anton1, anton2, anton3, peter1, peter2))

      List(List("Anton1", "Anton2", "Peter1"), List("Anton3", "Peter2", "Jason")) shouldBe result
    }

}
