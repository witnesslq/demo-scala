package com.yeahwell.scala.grammer.actor

import scala.actors.Actor

/**
 * @author yeahwell
 */
class HelloActor extends Actor{
  
  def act(){
    while(true){
      receive{
        case name:String => print("Hello, " + name)
      }
    }
  }
  
}

//val helloActor = new HelloActor
//helloActor.start()
//
//helloActor ! "hello"

