package com.yeahwell.scala.grammer.democlass

/**
 * @author yeahwell
 */
class Student4 {

  private var myAge = 0

  def age_= (newAge : Int){
    if(newAge > 0){
      myAge = newAge
    }else{
      println("illegal age")
    }
  }
  
  def age = myAge
  
  def older(s: Student4) = {
    myAge > s.myAge
  }
  

}