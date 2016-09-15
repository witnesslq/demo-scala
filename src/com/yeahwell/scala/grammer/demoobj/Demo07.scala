package com.yeahwell.scala.grammer.demoobj

/**
 * @author yeahwell
 */
object Demo07 {
 
  def main(args: Array[String]): Unit = {
    
    println(PersonObj.getEyeNum)
    println(PersonObj.getEyeNum)
    
    //伴生类
    val p = new Person("kangkang", 23)
    p.sayHello
    
    //apply方法
    val p1 = new PersonApply("leo")
    val p2 = PersonApply("michale jack")
    println(p2.name)
    
  }
  
}