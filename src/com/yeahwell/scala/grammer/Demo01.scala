package com.yeahwell.scala.grammer

import scala.util.control.Breaks._

/**
 * @author yeahwell
 */
object Demo01 {
  
  def demoReadLine(): Unit = {
    val name = readLine("欢迎进入游戏厅, 请输入您的姓名")

    println("您好, " + name)

    val age = readInt()

    if (age > 18) {
      printf("成年人，欢迎享受游戏")
    } else {
      printf("对不起，未满18岁不能进入")
    }
  }
  
  def demoWhile() : Unit = {
    var n = 10
    while(n > 0){
      print(n + " ")
      n -= 1
    }
    
  }
  
  def demoFor() : Unit = {
    var n = 10
    //简易版for语句
    for(i <- 1 to n) print(i + " ")
    println
    //使用until，表达式不达到上限
    for(i <- 1 until n) print(i + " ")
    println
    //对字符串进行遍历，类似于java的增强for循环
    for(c <- "Hello World") print(c)
    println
    
    //高级for循环
    //多重for循环：九九乘法表
    for(i <- 1 to 9; j<- 1 to 9){
      if(j == 9){
        println(i + "*" + j + "=" + i * j)
      }else{
        print(i + "*" + j + "=" + i * j + " ")
      }
    }
    //if守卫：取偶数
    for(i <- 1 to 100 if i % 2 == 0) println(i)
    //for推导式
    for(i <- 1 to 10) yield i
    
  }
  
  def demoBreak() : Unit = {
    
    breakable{
      var n = 10
      for(c <- "Hello World"){
        if(n == 5) break;
         print(c) 
         n -= 1
      }
    }
    
  }
  

  def main(args: Array[String]): Unit = {
    
//    demoReadLine
//    demoWhile
    demoFor
//    demoBreak
    
  }

}