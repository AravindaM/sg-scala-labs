package com.meetup.scalab.ex04

import org.scalatest.{ShouldMatchers, FlatSpec}
import ListManipulation01._

/**
  * Scala basic Lists
  *
  * Your job is to implement the functions in object ListManipulationExercise01 and classes in
  * such a way that the tests in this suite all succeed.
  *
  * Hint:
  * - the methods in ListManipulation01 can all be implemented in various ways:
  *   -- 'built in' functionality in Scala's collection classes
  *   -- pattern matching
  *   -- 'functional' style, using recursion, and/or folds
  *
  */

class ListManipulation01Test extends FlatSpec with ShouldMatchers {

  val listOfStrings: List[String] = List("One", "Two", "Three")
  "A Scala List" should "get first Element in list" in {
      val result: String = firstElementInList(listOfStrings)
      "One" shouldBe result
  }

  it should "calculate sum of list" in {
      15 shouldBe sumOfList(List(1, 2, 3, 4, 5))
  }

  it should "get last element in list" in {
      "Three" shouldBe lastElementInList(listOfStrings)
      9 shouldBe lastElementInList(List(1, 6, 10, 33, 54, 9))
  }

  it should "get nth element in list" in {
      "One" shouldBe nthElementInList(0, listOfStrings)
      "Two" shouldBe nthElementInList(1, listOfStrings)
      "Three" shouldBe nthElementInList(2, listOfStrings)
  }

  it should "concat two lists" in {
      List("One", "Two", "Three", "Four", "Five") shouldBe concatLists(listOfStrings, List("Four", "Five"))
  }

  it should "contains One Two And Three" in {
      elementExists(listOfStrings, "One")
      elementExists(listOfStrings, "Two")
      elementExists(listOfStrings, "Three")
  }

  it should "sort list of strings" in {
      val l = List("Sjors", "Arjan", "Age", "Lieke", "J-Fall", "ScalaLabs")
      List("Age", "Arjan", "J-Fall", "Lieke", "ScalaLabs", "Sjors") shouldBe sortList(l)
  }

  it should "get list contains two odd elements" in {
      List(1, 3, 5) shouldBe oddElements(List(1, 2, 3, 4, 5))
  }

  it should "get tails of list" in {
      List(List(1, 2, 3, 4, 5), List(2, 3, 4, 5), List(3, 4, 5), List(4, 5), List(5), List()) shouldBe tails(List(1, 2, 3, 4, 5))
  }

}
