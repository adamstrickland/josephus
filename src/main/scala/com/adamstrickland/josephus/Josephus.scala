package com.adamstrickland.josephus

object Josephus {
  case class Args(n: Int, k: Int)

  def solve(n: Int, k: Int): java.lang.Integer = Args(n, k) match {
    case Args(0, _) => throw new Exception("No group")
    case Args(_, 0) => throw new Exception("No interval")
    case Args(1, _) => 1
    case _ => (solve(n - 1, k) + k - 1) % n + 1
  }
}
