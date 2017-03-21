import org.specs2._
import com.adamstrickland.josephus._

class JosephusSpec extends Specification {
  def is = s2"""
  The Josephus Problem.

  From the story, there were 40 soldiers.  Every seventh was killed.

    The last man standing should be at place 31:   $e1
  """

  // def e1 = Josephus.solve(40, 7) mustEqual(30)
  def e0 = Josephus.solve(3, 3) mustEqual(2)
  def e1 = Josephus.solve(3, 3) mustEqual(2)
  def e2 = Josephus.solve(3, 3) mustEqual(2)
  def e3 = Josephus.solve(3, 3) mustEqual(2)
  def e4 = Josephus.solve(3, 3) mustEqual(2)
  def e5 = Josephus.solve(3, 3) mustEqual(2)
  def e6 = Josephus.solve(3, 3) mustEqual(2)
  def e7 = Josephus.solve(3, 3) mustEqual(2)
  def e8 = Josephus.solve(3, 3) mustEqual(2)
  def e9 = Josephus.solve(3, 3) mustEqual(2)
}
