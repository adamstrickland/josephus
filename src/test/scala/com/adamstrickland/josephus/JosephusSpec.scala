import org.specs2._
import com.adamstrickland.josephus._

class JosephusSpec extends Specification {
  def is = s2"""
  The Josephus Problem.

  Given 2 variables, n and k, where n is the number of participants and
  k is the interval, return the last position to be consumed.

  Note that the position returned is 1-indexed.

    If n = 7 and k = 3, the answer should be 4                        $c0

    When bad parameters are supplied:
      If n is 0, there is no group; throw                             $t2
      If k is 0, there is no interval; throw                          $t3

    For a 3-person circle:
      Killing every 2nd should result in position 3                   $s0

    For a 5-person circle:
      Killing every 1st should result in position 5                   $s1
      Killing every 2nd should result in position 3                   $s2
      Killing every 3rd should result in position 4                   $s3
      Killing every 4th should result in position 1                   $s4
      Killing every 5th should result in position 2                   $s5

    When n == k:
      For a 3-person circle, the result should be 2                   $q0
      For a 4-person circle, the result should be 2                   $q1
      For a 5-person circle, the result should be 2                   $q2
      For a 6-person circle, the result should be 4                   $q3
      For a 7-person circle, the result should be 5                   $q4
      For a 8-person circle, the result should be 4                   $q5

    The classic problem is from the myth:
      If there were 40 men and an interval of 7, the save spot is 24  $m1
      If there were 41 men and an interval of 7, the save spot is 31  $m2
      If there were 41 men and an interval of 5, the save spot is 21  $m3

  """
  def c0 = Josephus.solve(7, 3) mustEqual(4)

  def t2 = Josephus.solve(0, 2) must throwA[Exception]
  def t3 = Josephus.solve(2, 0) must throwA[Exception]

  def s0 = Josephus.solve(3, 2) mustEqual(3)

  def s1 = Josephus.solve(5, 1) mustEqual(5)
  def s2 = Josephus.solve(5, 2) mustEqual(3)
  def s3 = Josephus.solve(5, 3) mustEqual(4)
  def s4 = Josephus.solve(5, 4) mustEqual(1)
  def s5 = Josephus.solve(5, 5) mustEqual(2)

  def q0 = Josephus.solve(3, 3) mustEqual(2)
  def q1 = Josephus.solve(4, 4) mustEqual(2)
  def q2 = Josephus.solve(5, 5) mustEqual(2)
  def q3 = Josephus.solve(6, 6) mustEqual(4)
  def q4 = Josephus.solve(7, 7) mustEqual(5)
  def q5 = Josephus.solve(8, 8) mustEqual(4)

  def m1 = Josephus.solve(40, 7) mustEqual(24)
  def m2 = Josephus.solve(41, 7) mustEqual(31)
  def m3 = Josephus.solve(41, 5) mustEqual(21)
}
