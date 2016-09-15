package com.yeahwell.scala.grammer.democlass

/**
 * @author yeahwell
 */
object Demo06 {

  def main(args: Array[String]): Unit = {
    
    val helloWorld = new HelloWorld
    helloWorld.sayHello()
    //也可以不加括号，如果定义方法时不带括号，则调用方法时也不能带括号
    println(helloWorld.getName)
    
    //自定义
    val student = new Student
    println(student.name)
    student.name = "jack"
    println(student.name)
    
    val student2 = new Student2
    println("" + student2.name)
    student2.name = "jack"
    
    val s1 = new Student4
    s1.age = 20
    val s2 = new Student4
    s2.age = 25
    println(s1.older(s2))
    
    val student6 = new Student6
    student6.setName("babala")
    println(student6.getName())
    
    val student7 = new Student6
    student7.setName("kangkang")
    println(student7.getName())
    
    val student9 = new Student9
    println(student.name + "\t" + student9.age)
    
    //Scala中，同样可以在类中定义内部类；但是与java不同的是，每个外部类的对象的内部类，都是不同的类
    val c1 = new InnerClass
    val s10 = c1.getStudent("babala")
    c1.students += s10
    val c2 = new InnerClass
    val s11 = c2.getStudent("jack")
//    c1.students += s11
    
    
  }

}