package com.yeahwell.scala.grammer.demoobj

/**
 * @author yeahwell
 */
object Season2 extends Enumeration {

  val SPRING = Value(0, "spring")
  val SUMMER = Value(1, "summer")
  val AUTUMN = Value(2, "autumn")
  val WINTER = Value(3, "winter")

  
  def main(args: Array[String]): Unit = {
    
    println(Season2(0))
    
    println(Season2.withName("spring"))
    
    for(ele <- Season2.values) {println(ele)}
  }
}