package com.yeahwell.scala.grammer.demofunc

/**
 *  匿名函数
 * @author yeahwell
 */
// Scala中，函数也可以不需要命名，此时函数被称为匿名函数。
// 可以直接定义函数之后，将函数赋值给某个变量；也可以将直接定义的匿名函数传入其他函数之中
// Scala定义匿名函数的语法规则就是，(参数名: 参数类型) => 函数体
// 这种匿名函数的语法必须深刻理解和掌握，在spark的中有大量这样的语法，如果没有掌握，是看不懂spark源码的
object Func02 {
  
  val sayHelloFunc = (name : String) => println("Hello, " + name)
  
}