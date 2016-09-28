package com.meetup.scalab.ex06

import org.scalatest.{ShouldMatchers, FlatSpec}
import OptionExercise01._

class OptionExerciseTest extends FlatSpec with ShouldMatchers {

  val rooms = Map(1 -> Some("12"), 2 -> None, 3 -> Some("locked"), 4 -> Some("14"), 5 -> Some("8"), 6 -> Some("locked"))

  "OptionExercise01" should "correctly show the state of filled room (e.g. Some(12))" in {
      roomState(rooms, 1) shouldBe "12"
  }

  it should "correctly show the state of an empty room (None)" in {
      roomState(rooms, 2) shouldBe "empty"
  }

  it should "correctly show the state of a room that is not available (Some(locked))" in {
      roomState(rooms, 3) shouldBe "not available"
    }

  it should "correctly show the state of a room that does not exist (no entry in Map)" in {
      roomState(rooms, 100) shouldBe "not existing"
  }

  "OptionExercise02" should "calculate total amount of people in rooms" in {
      OptionExercise02.totalPeopleInRooms(rooms) shouldBe 34
  }


}
