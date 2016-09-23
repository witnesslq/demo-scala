package com.yeahwell.scala.grammer.actor

import scala.actors.Actor

/**
 * @author yeahwell
 */
class UserManagerActor extends Actor{
  
  def act(){
    while(true){
      receive {
        case Login(username, password) => println("login, username")
        case Register(username, password) => println("register, username")
      }
    }
  }
  
}

//val userManagerActor = new UserManagerActor
//userManagerActor.start()
//userManagerActor ! Register("leo", "1234")
//userManagerActor ! Login("leo", "1234")


case class Login(username : String, password : String)
case class Register(username : String, password : String)