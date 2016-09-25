package com.yeahwell.scala.grammer.base

import scala.io.Source._
import java.io.IOException

/**
 * @author yeahwell
 */
object Demo03 {
  
  /**
   * 1. 过程：
   * 过程通常用于不需要返回值的函数
   */
  def sayHello(name: String) = "Hello, " + name
  
  def sayHello2(name: String) {
    println("Hello, " + name)
  }
  
  def sayHello3(name: String) : Unit = "Hello, " + name
  
  def demoLazy() :Unit = {
    lazy val lines = fromFile("/Users/yeahwell/Documents/workspace-for-scala/demo-scala/file/test.txt").mkString;
    println(lines)
    
    try{
      throw new IllegalArgumentException("参数错误异常")
    }catch{
      case _: IllegalArgumentException => println("参数错误异常")
    }finally{
      println("release io resources");
    }
    
    try{
      throw new IOException("IO异常")
    }catch{
      case e1: IllegalArgumentException => println("参数错误异常")
      case e2: IOException => println("IO异常")
    }finally{
      println("release io resources");
    }
  }
  
  def main(args: Array[String]): Unit = {
    demoLazy()
  }
  
}