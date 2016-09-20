package com.yeahwell.scala.grammer.demoextends

/**
 *  override field
 * @author yeahwell
 */
class Person02 {
  val name : String = "Person02"
  def age : Int = 0
}

// Scala中，子类可以覆盖父类的val field，而且子类的val field还可以覆盖父类的val field的getter方法；只要在子类中使用override关键字即可
class Student02 extends Person02{
  override val name : String = "jack"
  override val age : Int = 16;
}