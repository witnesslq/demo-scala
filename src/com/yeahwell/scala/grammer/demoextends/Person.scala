package com.yeahwell.scala.grammer.demoextends

/**
 * @author yeahwell
 */
class Person {
  
  private var name = "leo"
  def getName = name
  
}

class Student extends Person{
  
  private var score = "A"
  
  def getScore = score
 
  override def getName = "学生" + super.getName
  
}