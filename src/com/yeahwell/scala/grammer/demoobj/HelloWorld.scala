package com.yeahwell.scala.grammer.demoobj

/**
 * @author yeahwell
 */
object HelloWorld extends App{
  
  println("hello world")
  
  //App Trait的工作原理为：AppTrait继承自DelayedInit Trait，scalac命令进行编译时，
  //会把继承App Trait的objet的construct代码都放到DelayedInit Trait的delayedInit方法中执行
  
}