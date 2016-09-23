package com.yeahwell.scala.grammer.actor

import com.yeahwell.scala.grammer.actor.Message
import scala.actors.Actor

class JackTelephoneActor(val leoTelephoneActor : Actor) extends Actor{
  
  def act(){
    
    leoTelephoneActor ! Message("Hello. Leo. I am Jack", this)
      
      receive{
        case response : String => println("jack telephone : " + response)
      }
  }
  
}

//val leoActor = new LeoTelephoneActor
//val jackActor = new JackTelephoneActor(leoActor)
//leoActor.start()
//jackActor.start()

//同步消息
//val reply = actor !? message
//异步消息，后续获取消息的返回值
//val future = actor !! meeeage
//val reply = future()