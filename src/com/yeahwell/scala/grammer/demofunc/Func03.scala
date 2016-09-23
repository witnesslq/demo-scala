package com.yeahwell.scala.grammer.demofunc

/**
 *  高阶函数
 * @author yeahwell
 */
// Scala中，由于函数是一等公民，因此可以直接将某个函数传入其他函数，作为参数。这个功能是极其强大的，也是Java这种面向对象的编程语言所不具备的。
// 接收其他函数作为参数的函数，也被称作高阶函数（higher-order function）
object Func03 {

  val sayHelloFunc = (name: String) => println("Hello, " + name)

  def greeting(func: (String) => Unit, name: String) { func(name) }

  greeting(sayHelloFunc, "leo")

  Array(1, 2, 3, 4, 5).map((num: Int) => num * num)

  // 高阶函数的另外一个功能是将函数作为返回值
  def getGreetingFunc(msg: String) = (name: String) => println(msg + ", " + name)
  val greetingFunc = getGreetingFunc("hello")
  greetingFunc("leo")

}