package com.yeahwell.scala.grammer.demotrait

/**
 *  在Trait中定义具体字段
 * @author yeahwell
 */
trait Person03 {
  
  val eyeNum: Int = 2
  
}

// Scala中的Triat可以定义具体field，此时继承trait的类就自动获得了trait中定义的field
// 但是这种获取field的方式与继承class是不同的：如果是继承class获取的field，实际是定义在父类中的；而继承trait获取的field，就直接被添加到了类中
class Student03(val name : String) extends Person03{
  def sayHello = println("Hi, I'm" + name + ", I have " + eyeNum + " eyes")
}