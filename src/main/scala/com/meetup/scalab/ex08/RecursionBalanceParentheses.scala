package com.meetup.scalab.ex08

object RecursionBalanceParentheses {

  /**
    *
    Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String.
    For example, the function should return true for the following strings:

        (if (zero? x) max (/ 1 x))
        I told him (that it’s not (yet) done). (But he wasn’t listening)

    The function should return false for the following strings:

      :-)
      ())(

    The last example shows that it’s not enough to verify that a string contains the same number of opening and closing parentheses.

    Do this exercise by implementing the balance function.

    There are three methods on List[Char] that are useful for this exercise:

    chars.isEmpty: Boolean returns whether a list is empty
    chars.head: Char returns the first element of the list
    chars.tail: List[Char] returns the list without the first element
    Hint: you can define an inner function if you need to pass extra parameters to your function.

    Testing: You can use the toList method to convert from a String to aList[Char]: e.g. "(just an) example".toList.
    *
    */

  def balance(chars: List[Char]): Boolean = ???

}
