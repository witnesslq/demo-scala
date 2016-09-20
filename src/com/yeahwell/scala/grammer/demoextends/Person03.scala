package com.yeahwell.scala.grammer.demoextends

/**
 * override和super
 * @author yeahwell
 */
// Scala中，如果子类要覆盖一个父类中的非抽象方法，则必须使用override关键字
// override关键字可以帮助我们尽早地发现代码里的错误，比如：override修饰的父类方法的方法名我们拼写错了；比如要覆盖的父类方法的参数我们写错了；等等
// 此外，在子类覆盖父类方法之后，如果我们在子类中就是要调用父类的被覆盖的方法呢？那就可以使用super关键字，显式地指定要调用父类的方法
class Person03 {
  private var name = "leo"
  def getName = name
}

class Student03 extends Person03{
  private var score = "A"
  def getScore = score
  override def getName= "Hi, I'm " + super.getName
}