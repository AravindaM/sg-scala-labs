package com.meetup.scalab.ex07

import org.scalatest.{ShouldMatchers, FlatSpec}
import RecursionPascal._

class RecursionPascalTest extends FlatSpec with ShouldMatchers {

  "pascal" should "return the proper pascal number" in {
    pascal(0, 2) shouldBe 1
    pascal(1, 2) shouldBe 2
    pascal(1, 3) shouldBe 3
  }

}
