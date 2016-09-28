package com.meetup.scalab.ex03

import com.meetup.scalab.ex03.CollectionExercise02.Person
import org.scalatest.{ShouldMatchers, FlatSpec}

class CollectionExerciseTest extends FlatSpec with ShouldMatchers {

  "CollectionExercise01: GoogleCodeJam" should "get first Element in list" in {
      val in1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi"
      val in2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"
      val in3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv"
      val out1 = "our language is impossible to understand"
      val out2 = "there are twenty six factorial possibilities"
      val out3 = "so it is okay if you want to just give up"

      val result = CollectionExercise01.googleCodeJamGooglerese(in1, in2, in3)
      Seq(out1, out2, out3) should equal(result)
  }

  "CollectionExercise02:" should "group a list of adults by age group. Each group is sorted by name" in {
      val jack = new Person(14, "Jack")
      val duke = new Person(32, "Duke")
      val jeniffer = new Person(34, "Jeniffer")
      val erik = new Person(24, "Erik")
      val susy = new Person(40, "Susy")

      val result = CollectionExercise02.groupAdultsPerAgeGroup(Seq(jack, jeniffer, duke, erik, susy))
      Map(20 -> Seq(erik), 30 -> Seq(duke, jeniffer), 40 -> Seq(susy)) shouldBe result
  }

  "CollectionExercise03" should "check that each subsequent value in the sequence increases" in {
      CollectionExercise03.checkValuesIncrease(Seq(1, 2, 3)) shouldBe true
      CollectionExercise03.checkValuesIncrease(Seq(1)) shouldBe true
      CollectionExercise03.checkValuesIncrease(Seq(1, 2, 100)) shouldBe true
      CollectionExercise03.checkValuesIncrease(Seq(1, 2, 1)) shouldBe false
  }

  "CollectionExercise04:" should "calculate the length of the longest word in a list of sentences" in {
      val l1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pharetra lorem ut sem feugiat tristique. "
      val l2 = "Etiam id magna ut libero ullamcorperano scelerisque. "

      val result = CollectionExercise04.calcLengthLongestWord(l1, l2)
      "ullamcorperano".length() should equal(result)
  }

  "CollectionExercise05" should "use foldLeft for common higher order functions" in {
      val input = Seq(1, 2, 3)
      input.filter(_ % 2 == 0) shouldBe CollectionExercise05.filterWithFoldLeft(input)
      input.groupBy(_ % 2 == 0) shouldBe CollectionExercise05.groupByWithFoldLeft(input)
  }

}
