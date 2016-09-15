package com.yeahwell.scala.grammer.democlass

/**
 * @author yeahwell
 */
class Student2 {

  //自定义getter与setter方法
  private var myName = "leo"

  def name = "your name is " + myName

  def name_= (newValue: String) {
    println("your cannot edit your name")
  }
  

  

}