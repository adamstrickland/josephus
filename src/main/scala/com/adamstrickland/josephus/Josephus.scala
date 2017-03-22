package com.adamstrickland.josephus

object Josephus {
  case class Args(n: Int, k: Int)

  def solve(n: String, k: String): Int = solve(Integer.parseInt(n), Integer.parseInt(k))

  def solve(n: Int, k: Int): Int = Args(n, k) match {
    case Args(n, _) if n < 1=> throw new Exception("No group")
    case Args(_, k) if k < 1=> throw new Exception("No interval")
    case Args(1, _) => 1
    case _ => ((solve(n - 1, k) + k - 1) % n) + 1
  }

  def main(args: Array[String]): Unit = {
    val n = args(0)
    val k = args(1)
    val position = solve(n, k)
    println(s"For a circle of $n people, eliminating every $k-th person, the safe spot is $position")
  }
}
