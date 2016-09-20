package com.yeahwell.scala.grammer.demoextends

/**
 * extends
 * @author yeahwell
 */
class Person {
  
  private var name = "leo"
  def getName = name
  
}

// Scala中，让子类继承父类，与Java一样，也是使用extends关键字
// 继承就代表，子类可以从父类继承父类的field和method；然后子类可以在自己内部放入父类所没有，子类特有的field和method；使用继承可以有效复用代码
// 子类可以覆盖父类的field和method；但是如果父类用final修饰，field和method用final修饰，则该类是无法被继承的，field和method是无法被覆盖的
class Student extends Person{
  
  private var score = "A"
  
  def getScore = score
 
  override def getName = "学生" + super.getName
  
}