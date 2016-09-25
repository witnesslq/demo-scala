package com.yeahwell.scala.grammer.demo0925

/**
 * @author yeahwell
 */
class Man(val name : String)

class SuperMan(val name : String){
  def emitLaser = println("emit a laster!!!")
}

object ImplicitTest2 {
  
  implicit def manToSuperMan(man : Man) : SuperMan = new SuperMan(man.name)
  
  def main(args: Array[String]): Unit = {
    val man = new Man("xxx")
    man.emitLaser
    
    //SparkSQL
//    DataFrame
//    RDD -> DataFrame
//    val sqlContext = new SQLContext(sc)
//    import sqlContext.implicit._
    //MapReduce二次排序，自定义排序规则
    //rdd.top()
    
    
  }
  
}