package hackerrank

// https://www.hackerrank.com/challenges/fp-list-length
object fpListLength {

  def f(arr: List[Int]): Int =  arr match {
   case Nil  => 0
   case head :: tail => 1 + f(tail)
  }                                               //> f: (arr: List[Int])Int
  
  // Tests
  val l1: List[Int]  = List(1,2,3,4)              //> l1  : List[Int] = List(1, 2, 3, 4)
  val l2: List[Int]  = List()                     //> l2  : List[Int] = List()
  f(l1)                                           //> res0: Int = 4
  f(l2)                                           //> res1: Int = 0
  
}