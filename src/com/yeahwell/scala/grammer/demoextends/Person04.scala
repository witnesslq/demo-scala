package com.yeahwell.scala.grammer.demoextends

/**
 * @author yeahwell
 */
class Person04 {
  protected var name: String = "leo"
  protected[this] var hobby: String = "game"
}

class Student04 extends Person04 {
  
  // 跟java一样，scala中同样可以使用protected关键字来修饰field和method，这样在子类中就不需要super关键字，直接就可以访问field和method
  def sayHello = println("Hello, " + name)
  
  // 还可以使用protected[this]，则只能在当前子类对象中访问父类的field和method，无法通过其他子类对象访问父类的field和method
  def makeFriends(s: Student04) {
//    println("my hobby is " + hobby + ", your hobby is " + s.hobby)
  }
  
}
