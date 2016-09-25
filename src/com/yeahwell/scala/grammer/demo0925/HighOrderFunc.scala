package com.yeahwell.scala.grammer.demo0925

/**
 * @author yeahwell
 */
object HighOrderFunc {
  
  val sayHelloFunc = (name : String) => println("Hello, " + name)
  
  //高阶函数：函数的参数也是一个函数
  def greeting(func : (String) => Unit, name : String){
    func(name)
  }
  
  def main(args: Array[String]): Unit = {
    //超级自由的高阶函数，把实现作为一个能力传入
    //相当于把某个技能传输给另一个人
		//匿名函数：(name : String) => println(name + ",好")
    greeting((name : String) => println(name + ",好") , "张总")
    greeting((name : String) => println(name + ", 早") , "小明")
    //简化一：高阶函数可以依据函数的定义，自动推断参数类型
    greeting((name) => println(name + "早"), "kangkan")
    //简化二：如果只有一个参数，可以省略()
    greeting(name => println(name + "早"), "kangkan")
    //简化三：如果只有一个
    val list = List(1, 2, 3, 4, 5)
    list.map { x  => x * x }
    
    list.map((x: Int) => x * x)
    list.map((x) => x * x)
    list.map(x => x * x)
    list.map(2 * _)
    
//    def map(f : (A) => B) : List
    //泛型(高级)[A1 >: A]
//    def reduce[A1 >: A]
//  def reduce[A1 >: A](op: (A1, A1) => A1): A1 = reduceLeft(op)
    list.reduce((a, b) => a + b)
//    a = 1, b = 2
//    a = 3, b = 3
//    a = 6 , b = 4
//    a = 10, b = 5
    list.reduce(_ + _)
    list.reduce(_ - _)
    list.reduce(_ * _)
    
    (1 to 20).filter(_ % 2 == 0)
    
    val str = "hadoop,hive,spark,yarn,rdd,hadodp,spark;babala,kangkang,micheal"
    val arr = str.split(";")
    //map和flatMap
    arr.map(line => line.split(","))
    arr.flatMap(line => line.split(","))
  }
  
}