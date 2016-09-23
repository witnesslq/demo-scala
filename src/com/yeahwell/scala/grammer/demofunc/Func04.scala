package com.yeahwell.scala.grammer.demofunc

/**
 *  高阶函数的类型推断
 *
 * @author yeahwell
 */
// 高阶函数可以自动推断出参数类型，而不需要写明类型；而且对于只有一个参数的函数，还可以省去其小括号；如果仅有的一个参数在右侧的函数体内只使用一次，则还可以将接收参数省略，并且将参数用_来替代
// 诸如3 * _的这种语法，必须掌握！！spark源码中大量使用了这种语法！
object Func04 {

  def greeting(func: (String) => Unit, name: String) { func(name) }
  greeting((name: String) => println("Hello, " + name), "leo")
  greeting((name) => println("Hello, " + name), "leo")
  greeting(name => println("Hello, " + name), "leo")

  def triple(func: (Int) => Int) = { func(3) }
  triple(3 * _)

}