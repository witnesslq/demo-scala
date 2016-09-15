package com.yeahwell.scala.grammer.democlass

/**
 * @author yeahwell
 */
class Student5 {

  //如果将field使用private来修饰，那么代表这个field是类私有的，在类的方法中，可以直接访问类的其他对象的private field
  //这种情况下，如果不希望field被其他对象访问到，那么可以使用private[this]，意味着对象私有的field，只有本对象可以访问到
  private[this] var myAge = 0

  def age_= (newAge : Int){
    if(newAge > 0){
      myAge = newAge
    }else{
      println("illegal age")
    }
  }
  
  def age = myAge
  
  def older(s: Student4) = {
    //myAge > s.myAge 本行代码编译报错
    
  }
  

}