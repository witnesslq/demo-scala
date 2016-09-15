package com.yeahwell.scala.grammer.democlass

/**
 * @author yeahwell
 */
class Student {
  
  //定义不带private的field的var field, 此时scala生成的面向JVM的类时，会定义为private的name字段，并提供getter和setter方法
  //调用getter和setter方法，分别叫做name和name_=
  var name = "leo"
  
  //如果使用private修饰field，则生成的getter和setter方法也是private的
  private var age = 24
  
  //如果不希望生成setter和getter方法时，则将field声明为private[this]
  
  
}