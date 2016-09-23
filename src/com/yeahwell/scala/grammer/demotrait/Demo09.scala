package com.yeahwell.scala.grammer.demotrait

/**
 * @author yeahwell
 */
object Demo09 {
  
  def main(args: Array[String]): Unit = {
    // 将trait作为接口使用
    val p1 = new Person01("leo")
    val p2 = new Person01("babala")
    p1.sayHello("jack")
    p1.makeFriends(p2)
    
    // 在Trait中定义具体方法
    val p3 = new Person02("leo")
    val p4 = new Person02("jack")
    p3.makeFriends(p4)
    
    // 在Trait中定义具体字段
    val s1 = new Student03("kangkang")
    s1.sayHello
    
    //在Trait中定义抽象字段
    val p5 = new Person04("xingxing")
    val p6 = new Person04("chuanchuan")
    p5.makeFriends(p6)
    
    // 为实例混入trait
    val p7 = new Person05("p7")
    p7.sayHello
    val p8 = new Person05("p8") with MyLogger05
    p8.sayHello
    
    //trait调用链
    val p9 = new Person06("p9")
    p9.sayHello
   
    //trait的构造机制
    val p10 = new Student09
    
    //提前定义
    val p11 = new {
        val msg: String = "init"
    } with Person10 with SayHello10
    
  }
}
