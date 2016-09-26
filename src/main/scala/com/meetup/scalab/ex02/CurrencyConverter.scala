package com.meetup.scalab.ex02

trait CurrencyConverter {
  def toEuroCents(dollarCents: Int): Int
}

trait DefaultCurrencyConverter extends CurrencyConverter {
  val conversionRate = 1.3598
  def toEuroCents(dollarCents: Int): Int =
    (dollarCents.toDouble * conversionRate).toInt
}

object DefaultCurrencyConverter extends DefaultCurrencyConverter
