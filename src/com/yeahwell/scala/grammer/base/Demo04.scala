package com.yeahwell.scala.grammer.base

import scala.collection.mutable.ArrayBuffer

/**
 * @author yeahwell
 */
object Demo04 {
  
  def demoArray() : Unit = {
    //数组初始化后，长度就固定下来了，而且元素全部根据其类型初始化
    val a = new Array[Int](10)
    val b = new Array[String](10)
    
    //可以直接使用Array()创建数组，元素类型自动推断
    val c = Array("hello", "world")
    c(0) = "hi"
    
  }
  
  /**
   * ArrayBuffer
   * Scala中，类似于Java中的ArrayList这种长度可变的集合类。
   */
  def demoArrayBuffer(){
    //使用ArrayBuffer()方式创建一个空的ArrayBuffer
    val a = ArrayBuffer[Int]()
    //使用+=操作符，可以添加一个元素，或者多个元素
    a += 1
    a += (2, 3, 4, 5, 6)
    //使用++=操作符，可以添加其他集合中的所有元素
    a ++= Array(6, 7, 8, 9, 10)
    //使用trimEnd()函数，可以从尾部截断指定个数的元素
    a.trimEnd(5)
  
    //遍历
    for(i <- 0 until a.length){
      print(a(i) + " ")
    }
    println()
    
    //跳跃遍历
    for(i <- 0 until (a.length, 2)){
      print(a(i) + " ")
    }
    println()
    
    //从尾部遍历
    for(i <- (0 until a.length).reverse ){
      print(a(i) + " ")
    }
    println()
    
    //使用"增强for循环
    for(e <- a){
      print(e + " ") 
    }
    println()
  
  }
  
  def demoArrayOpr(){
    //数组元素求和
    val a = Array(1, 2, 3, 4, 5)
    val sum = a.sum
    //获取数组的最大值
    val max = a.max
    //对数组进行排序
    scala.util.Sorting.quickSort(a);
    //获取数组中所有元素内容
    a.mkString
    a.mkString(",")
    a.mkString("<", ",", ">")
    //toString函数
    a.toString
  }
  
  def demoArrayConvert(){
    //对Array进行转换
    val a = Array(1, 2, 3, 4, 5)
    val a2 = for(ele <- a) yield ele * ele
    //对ArrayBuffer进行转换
    val b = ArrayBuffer[Int]()
    b += (1, 2, 3, 4, 5)
    val b2 = for(ele <- b) yield ele * ele
    //结合if守卫，仅转换需要的元素
    val a3 = for(ele <- a if ele % 2 == 0) yield ele * ele
    
    //使用函数式编程转换数组(通常使用第一种方式)
    a.filter(_% 2 == 0).map(2 * _)
    a.filter { _% 2 == 0 } map {2 * _}
  }
  
  def demoRemoveFirstNegative(){
    //构建数组
    val a = ArrayBuffer[Int]()
    a += (1, 2, 3, 4, 5, -1, -3, -5, -9)
    
    //每发现一个第一个负数之后的负数，
    var foundFirstNegative = false
    var arrayLength = a.length
    var index = 0
    while(index < arrayLength){
      if(a(index) >= 0){
        index += 1
      }else{
        //找到第一个负数
        if(!foundFirstNegative){
          foundFirstNegative = true
          index += 1
        }
        //不是第一个负数，且为负数
        else{
          a.remove(index)
          arrayLength -= 1
        }
      }
    }
  }
  
  
  def demoRemoveFirstNegative2(){
     //构建数组
    val a = ArrayBuffer[Int]()
    a += (1, 2, 3, 4, 5, -1, -3, -5, -9)
    var foundFirstNegative = false
    val keepIndexes = for(i <- 0 until a.length if !foundFirstNegative || a(i) >= 0) yield {
      if(a(i) < 0) foundFirstNegative = true
      i
    }
      
     for(i <- 0 until keepIndexes.length){ 
       a(i) = a(keepIndexes(i))}
     a.trimEnd(a.length - keepIndexes.length)
     
  }
  
  
  def main(args: Array[String]): Unit = {
    
//    demoArray()
    demoArrayBuffer()
    
  }
  
}