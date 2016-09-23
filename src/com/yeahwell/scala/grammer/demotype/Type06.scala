package com.yeahwell.scala.grammer.demotype

/**
 *  Context Bounds
 * 
 * @author yeahwell
 */
object Type06 {
  
  // Context Bounds是一种特殊的Bounds，它会根据泛型类型的声明，比如“T: 类型”要求必须存在一个类型为“类型[T]”的隐式值。其实个人认为，Context Bounds之所以叫Context，是因为它基于的是一种全局的上下文，需要使用到上下文中的隐式值以及注入。

//案例：使用Scala内置的比较器比较大小
class Calculator[T: Ordering] (val number1: T, val number2: T) {
  def max(implicit order: Ordering[T]) = if(order.compare(number1, number2) > 0) number1 else number2
}

  
}