package com.yeahwell.scala.grammer.demoobj

/**
 * @author yeahwell
 */
abstract class Hello(var message : String) {
  
  def sayHello(name : String) : Unit
  
}

/**
 * 让object继承抽象类
 * object也可以继承抽象类，并覆盖抽象类中的方法
 */
object HelloImpl extends Hello("leo"){
  
  override def sayHello(name : String) = {
    println(message + "," + name)
  }
  
  def main(args: Array[String]): Unit = {
    HelloImpl.sayHello("fuck ")
    HelloImpl.sayHello("hello ")
  }
  
}