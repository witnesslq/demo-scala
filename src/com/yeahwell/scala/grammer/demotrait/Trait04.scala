package com.yeahwell.scala.grammer.demotrait

/**
 *  在Trait中定义抽象字段
 *
 * @author yeahwell
 */
trait SayHello {
  val msg: String
  def sayHello(name: String) = println(msg + ", " + name)
}

// Scala中的Triat可以定义抽象field，而trait中的具体方法则可以基于抽象field来编写
// 但是继承trait的类，则必须覆盖抽象field，提供具体的值
class Person04(val name: String) extends SayHello {
  val msg: String = "hello"
  def makeFriends(p: Person04) {
    sayHello(p.name)
    println("I'm " + name + ", I want to make friends with you!" + p.name)
  }
}
