package com.yeahwell.scala.grammer.democlass

/**
 * @author yeahwell
 */
class Student3 {

  //仅开放getter方法
  private var myName = "leo"

  def name = "your name is " + myName
  
  def updateName(newName : String){
    if(newName == "leo1"){
      myName = newName
    }else{
      println("not accept this new name")
    }
  }
  

}