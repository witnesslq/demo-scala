package com.yeahwell.scala.grammer.demotrait

/**
 *  trait继承class
 *
 * @author yeahwell
 */
// 在Scala中，trait也可以继承自class，此时这个class就会成为所有继承该trait的类的父类
class MyUtil13 {
  def printMessage(msg: String) = println(msg)
}

trait Logger13 extends MyUtil13 {
  def log(msg: String) = printMessage("log: " + msg)
}

class Person13(val name: String) extends Logger13 {
  def sayHello {
    log("Hi, I'm " + name)
    printMessage("Hi, I'm " + name)
  }
}
