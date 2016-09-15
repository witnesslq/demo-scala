package com.yeahwell.scala.grammer.demoobj

/**
 * @author yeahwell
 */
class Person (val name: String, val age : Int){
  
  //如果有一个class，还有一个与class同名的object，那么就称这个object是class的伴生对象，class是object的伴生类
  //伴生类和伴生对象必须存放在一个.scala文件之中
  //伴生类和伴生对象，最大的特点就在于，互相可以访问private field
  def sayHello = println("Hi, " + name + ", I guess yuor age is " + age + "你有" + Person.eyeNum + "只眼睛")
  
}

object Person{
  private val eyeNum = 2
  def getEyeNum = eyeNum
}