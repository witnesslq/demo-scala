package com.yeahwell.scala.grammer.demo0925

/**
 * 异常处理
 * @author yeahwell
 */
object ExceptionTest extends App{
  
  try{
//    val i = 1 / 0
    
    val arr = Array(1, 2, 3 , 4, 5)
    println(arr)
    
    println(arr(10))
    
    println(arr(2))
    
  }catch{
    case e1 : ArithmeticException => throw new RuntimeException("not zero")
    case e2: Exception => println(e2.getMessage)
  }finally{
    println("finally ...")
  }
  
  
  
}