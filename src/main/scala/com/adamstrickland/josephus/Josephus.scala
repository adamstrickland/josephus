package com.adamstrickland.josephus

object Josephus {
  object One {
    def unapply(i: Int) = if (i == 1) Some(1) else None
  }

  def solve(n: Int, k: Int): java.lang.Integer = n match {
    case One(n) => 0
    case _ => (solve(n - 1, k) + k) % n
  }
}
