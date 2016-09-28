package com.meetup.scalab.ex09

object RecursionCountingChange {

  /**
    * Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations.
    * For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.

      Do this exercise by implementing the countChange function.
      This function takes an amount to change, and a list of unique denominations for the coins.

      Once again, you can make use of functions isEmpty, head and tail on the list of integers coins.

      Hint: Think of the degenerate cases. How many ways can you give change for 0 CHF(swiss money)?
            How many ways can you give change for >0 CHF, if you have no coins?
    */

  def countChange(money: Int, coins: List[Int]): Int = ???

}
