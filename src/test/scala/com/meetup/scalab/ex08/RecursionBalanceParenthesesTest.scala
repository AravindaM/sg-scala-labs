package com.meetup.scalab.ex08

import RecursionBalanceParentheses._
import org.scalatest.{ShouldMatchers, FlatSpec}

class RecursionBalanceParenthesesTest extends FlatSpec with ShouldMatchers {

  "balance" should "return true when a String has a balanced number of parens" in {
    balance("(if (zero? x) max (/ 1 x))".toList) shouldBe true
    balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList)  shouldBe true
  }

  it should "return false when a String has an unbalanced number of parens" in {
    balance(":-)".toList) shouldBe false
    balance("())(".toList)  shouldBe false
  }

}
