package com.yeahwell.scala.grammer.democlass

import scala.collection.mutable.ArrayBuffer

/**
 * @author yeahwell
 */
class InnerClass{

  //Scala中，同样可以在类中定义内部类；但是与java不同的是，每个外部类的对象的内部类，都是不同的类
  class StudentInner(val name : String){}
  
  val students = new ArrayBuffer[StudentInner]()
  
  def getStudent(name : String) = {
    new StudentInner(name)
  }
  
}

