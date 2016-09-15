package com.yeahwell.scala.grammer.demoextends

/**
 * @author yeahwell
 */
class Person02 {
  val name : String = "Person02"
  def age : Int = 0
}

class Student02 extends Person02{
  override val name : String = "jack"
  override val age : Int = 16;
}