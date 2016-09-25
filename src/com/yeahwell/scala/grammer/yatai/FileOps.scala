package com.yeahwell.scala.grammer.yatai

import scala.io.Source

/**
 * @author yeahwell
 */
object FileOps {
  
  def main(args: Array[String]): Unit = {
    
    //val file = Source.fromFile("file/test.txt")
    val file = Source.fromURL("http://spark.apache.org/")
    
    for(line <- file.getLines()){
      println(line)
    }
    
  }
  
}