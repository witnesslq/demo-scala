package com.yeahwell.scala.grammer.actor

/**
 * @author yeahwell
 */
object Actor01 {
  
  // 默认情况下，消息都是异步的；但是如果希望发送的消息是同步的，即对方接受后，一定要给自己返回结果，那么可以使用!?的方式发送消息。即val reply = actor !? message。

// 如果要异步发送一个消息，但是在后续要获得消息的返回值，那么可以使用Future。即!!语法。
//  val future = actor !! message。val reply = future()

  
}