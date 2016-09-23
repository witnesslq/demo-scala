package com.yeahwell.scala.grammer.demotrait

/**
 *  为实例混入trait
 *
 * @author yeahwell
 */
// 有时我们可以在创建类的对象时，指定该对象混入某个trait，这样，就只有这个对象混入该trait的方法，而类的其他对象则没有
trait Logged05 {
  def log(msg: String) {}
}

trait MyLogger05 extends Logged05 {
  override def log(msg: String) { println("log: " + msg) }
}

class Person05(val name: String) extends Logged05 {

  def sayHello {
    println("Hi, I'm " + name);
    log("sayHello is invoked!")
  }

}

