package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  //trait TestSets {

  //}

  //new TestSets {
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s4 = union(s1,s2)
  val s5 = union(s1,s3)
    println(contains(s4, 3))
    println(contains(s4, 1))
    println(contains(s4, 2))
    val s6=intersect(s4,s5) // must give 1
    //println(contains(s6, 1))
    val s7=diff(s4,s5) // must give 2
    println(contains(s7, 2))
    val s8=union(s4,s5)
    println(contains(s8, 1))
    println(contains(s8, 3))
    println(contains(s8, 2))
    println(contains(s8, 4))
    val s9=filter(s8, x=> x==3)
    println(contains(s9, 3))
    println(contains(s9, 1))

    printSet(s9)
    printSet(s7)
    printSet(s8)

      println(exists(s8,x=> x>=3)) //true
      println(exists(s8,x=> x>3))  //false
      println(forall(s8, x=>x<=3)) //true
      println(forall(s8, x=>x<3)) //false

  println("map test")
      val s10= map(s8,x=>x*x)
      printSet(s8)
      printSet(s10)
  //}


}
