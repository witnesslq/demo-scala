package com.yeahwell.scala.grammer.demotype

/**
 *  下边界Bounds
 * 
 * @author yeahwell
 */
object Type04 {
  
  // 除了指定泛型类型的上边界，还可以指定下边界，即指定泛型类型必须是某个类的父类

//案例：领身份证
class Father(val name: String) 
class Child(name: String) extends Father(name)

def getIDCard[R >: Child](person: R) {
  if (person.getClass == classOf[Child]) println("please tell us your parents' names.")
  else if (person.getClass == classOf[Father]) println("sign your name for your child's id card.")
  else println("sorry, you are not allowed to get id card.")
}

  
}