package com.yeahwell.scala.grammer.demotrait

/**
 *  混合使用trait的具体方法和抽象方法
 * @author yeahwell
 */
// 在trait中，可以混合使用具体方法和抽象方法
// 可以让具体方法依赖于抽象方法，而抽象方法则放到继承trait的类中去实现
// 这种trait其实就是设计模式中的"模板设计模式"的体现
trait Valid08 {
  def getName: String
  
  def valid: Boolean = {
    getName == "leo"    
  }
  
}

class Person08(val name: String) extends Valid08 {
  println(valid)
  def getName = name
}

