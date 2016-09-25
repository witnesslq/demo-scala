package com.yeahwell.scala.grammer.demo0925

/**
 * 构造函数
 * @author yeahwell
 */

class Student(val name : String, val age : Int){
  
  println("..........begin...........")
  
  var school = "new dongfang"
  
  def this(name : String, age : Int, schoolName : String){
    this(name, age)
    school = schoolName
  }
  
  def this(){
    this("o2oscholl", 20, "kangkang")
  }
  
  println("..........end...........")
  
}

object ConstructorDemo {
  
  def main(args: Array[String]): Unit = {
    
    val student = new Student
    
  }
  
}