package com.yeahwell.scala.grammer.actor

import scala.actors.Actor

class LeoTelephoneActor extends Actor{
  
  def act(){
    while(true){
      receive{
        case Message(content, sender) => {println("leo telephone = " + content)}
      }
    }
  }
  
}

case class Message(content : String, sender : Actor)
