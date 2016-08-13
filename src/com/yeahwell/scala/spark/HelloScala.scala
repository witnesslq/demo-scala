package com.yeahwell.scala.spark

/**
 * @author yeahwell
 */
object HelloScala {
  
  def main(args: Array[String]): Unit = {
    
    println("Hello Scala, A new World")
    
    for(arg <- args)
      println(arg);
    
  }
  
}