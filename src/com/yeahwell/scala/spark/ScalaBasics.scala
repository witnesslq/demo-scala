package com.yeahwell.scala.spark

import java.io.File

/**
 * @author yeahwell
 */
object ScalaBasics {

  def doWhile() {
    var line = ""
    do {
      line = readLine()
      println("Read : " + line)
    } while (line != "")

  }

  def looper(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def demoProcess(args : Array[String]){
    var file = if (!args.isEmpty) args(0) else "Spark.xml"
    println(file)
  }
  
  def demoloop() {
    for (i <- 1 to 10) {
      println("Number : " + i)
    }
    
    val files = (new File(".")).listFiles()
    for (file <- files){
      println(file)
    }
    
  }
  
  def demoException(){
    val n = 99
    val file = "Spark.txt"
    try{
      val half = if(n % 2 == 0) n / 2 else throw new RuntimeException("N must be even")
    }catch{
      case e : Exception => println("The exception is : " +  e.getMessage())
    }finally{
      
    }
  }

  def main(args: Array[String]): Unit = {

//    doWhile()
//    println(looper(100, 298))

//    demoloop();
    
    demoException();
  }

}