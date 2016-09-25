package com.yeahwell.scala.grammer.demo0925

/**
 * @author yeahwell
 */
class SpecialPerson(val name : String)
class Student03(val name : String)
class OlderPerson(val name : String)

object ImplicitTest {
  
  var ticketNumber = 0
 
  def main(args: Array[String]): Unit = {
     val stu = new Student03("zhangsan")
     val ticket = buySpecialTicket(stu)
     println("Buy ticket" + ticket)
  }
  
  
  def buySpecialTicket(p : SpecialPerson) : String = {
    ticketNumber += 1
    "T-" + ticketNumber
  }
  
  /**
   * 隐式转换函数
   * 在不知不觉中加强现有类型的功能
   */
  implicit def objectToSpeicalPerosn(obj : Object) : SpecialPerson = {
    //类型用[]
    //匹配用=>
    //集合用()
    //键值对->
    //_
    //*
    if(obj.getClass == classOf[Student03]){
      val stu = obj.asInstanceOf[Student03]
      new SpecialPerson(stu.name)
    }else if(obj.getClass == classOf[OlderPerson]){
      val older = obj.asInstanceOf[OlderPerson]
      new SpecialPerson(older.name)
    }
    else{
      new SpecialPerson("xxx")
    }
  }
  
}