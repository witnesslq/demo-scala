package com.yeahwell.scala.grammer.demoimplicconver

/**
 *  隐式转换的发生时机
 * 
 * @author yeahwell
 */
object Convert04 {
  
  // 1、调用某个函数，但是给函数传入的参数的类型，与函数定义的接收参数类型不匹配（案例：特殊售票窗口）
// 2、使用某个类型的对象，调用某个方法，而这个方法并不存在于该类型时（案例：超人变身）
// 3、使用某个类型的对象，调用某个方法，虽然该类型有这个方法，但是给方法传入的参数类型，与方法定义的接收参数的类型不匹配（案例：特殊售票窗口加强版）

// 案例：特殊售票窗口加强版
class TicketHouse {
  var ticketNumber = 0
  
//  def buySpecialTicket(p: SpecialPerson) = {
//    ticketNumber += 1
//    "T-" + ticketNumber
//  }
}

  
}