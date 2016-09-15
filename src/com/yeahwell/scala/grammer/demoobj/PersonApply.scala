package com.yeahwell.scala.grammer.demoobj

/**
 * @author yeahwell
 */
class PersonApply(val name : String) {
  
}

/**
 * object中非常重要的一个特殊方法，就是apply方法
 * 通常在伴生对象中实现apply方法，并在其中实现构造伴生类的对象功能
 * 
 */
object PersonApply{
  def apply(name : String) = new PersonApply(name)
}
