package com.yeahwell.scala.grammer.demotrait

/**
 * @author yeahwell
 */
// 在Scala中，trait是没有接收参数的构造函数的，这是trait与class的唯一区别，
//但是如果需求就是要trait能够对field进行初始化，该怎么办呢？只能使用Scala中非常特殊的一种高级特性——提前定义
trait SayHello10 {
  val msg: String
  println(msg.toString)
}

class Person10

class Person11 extends {
  val msg: String = "init"
} with SayHello10 {}

// 另外一种方式就是使用lazy value
trait SayHello12 {
  lazy val msg: String = null
  println(msg.toString)
}
class Person12 extends SayHello12 {
  override lazy val msg: String = "init"
}


