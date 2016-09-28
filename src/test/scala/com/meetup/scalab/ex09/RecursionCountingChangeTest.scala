package com.meetup.scalab.ex09

import org.scalatest.{ShouldMatchers, FlatSpec}
import RecursionCountingChange._

class RecursionCountingChangeTest extends FlatSpec with ShouldMatchers {

  "countChange" should "follow example given in instructions" in {
    countChange(4,List(1,2)) shouldBe 3
  }

  it should "calculate correctly with sorted CHF" in {
    countChange(300,List(5,10,20,50,100,200,500)) shouldBe 1022
  }

  it should "calculate correctly with no pennies" in {
    countChange(301,List(5,10,20,50,100,200,500)) shouldBe 0
  }

  it should "calculate correctly with unsorted CHF" in {
    countChange(300,List(500,5,50,100,20,200,10)) shouldBe 1022
  }

}
