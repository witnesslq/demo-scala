package com.yeahwell.scala.grammer.demofunc

/**
 * 将函数赋值给变量
 * @author yeahwell
 */
// Scala中的函数是一等公民，可以独立定义，独立存在，而且可以直接将函数作为值赋值给变量
// Scala的语法规定，将函数赋值给变量时，必须在函数后面加上空格和下划线
object Func01{
  
  def sayHello(name: String) { println("Hello, " + name) }
  val sayHelloFunc = sayHello _
  sayHelloFunc("leo")
  
}