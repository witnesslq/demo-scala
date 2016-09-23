package com.yeahwell.scala.grammer.demoimplicconver

/**
 *  隐式转换
 * 
 * @author yeahwell
 */
object Conver01 {
  
  // 要实现隐式转换，只要程序可见的范围内定义隐式转换函数即可。Scala会自动使用隐式转换函数。隐式转换函数与普通函数唯一的语法区别就是，要以implicit开头，而且最好要定义函数返回类型。

// 案例：特殊售票窗口（只接受特殊人群，比如学生、老人等）
class SpecialPerson(val name: String)
class Student(val name: String)
class Older(val name: String)

implicit def object2SpecialPerson (obj: Object): SpecialPerson = {
  if (obj.getClass == classOf[Student]) { val stu = obj.asInstanceOf[Student]; new SpecialPerson(stu.name) }
  else if (obj.getClass == classOf[Older]) { val older = obj.asInstanceOf[Older]; new SpecialPerson(older.name) }
  else Nil
}

var ticketNumber = 0
def buySpecialTicket(p: SpecialPerson) = {
  ticketNumber += 1
  "T-" + ticketNumber
}

  
}