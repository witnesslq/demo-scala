package com.yeahwell.scala.grammer.yatai

/**
 * @author yeahwell
 */
object TupleOps {

  def main(args: Array[String]): Unit = {

    //数组
    val array = Array(1, 2, 3, 4, 5)
    for(i <- 0 until array.length){
      println(array(i))
    }
    println("增强for循环")
    for(elem <- array){
      println(elem)
    }
    
    //键值对
    val ageMap = Map("Rocky" -> 27, "Spark" -> 5)
    
    for ( (k, v) <- ageMap){
      println("Key=" + k + ",Value=" + v)
    }
    //占位符_
    for ( (k, _) <- ageMap){
      println("key=" + k)
    }
    
    //元组
    val tuple = (100, "Scala", "Spark")
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    
    

  }

}