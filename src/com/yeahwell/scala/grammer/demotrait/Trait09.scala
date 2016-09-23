package com.yeahwell.scala.grammer.demotrait

/**
 *  trait的构造机制
 * @author yeahwell
 */
// 在Scala中，trait也是有构造代码的，也就是trait中的，不包含在任何方法中的代码
// 而继承了trait的类的构造机制如下：1、父类的构造函数执行；2、trait的构造代码执行，多个trait从左到右依次执行；3、构造trait时会先构造父trait，如果多个trait继承同一个父trait，则父trait只会构造一次；4、所有trait构造完毕之后，子类的构造函数执行
class Person09 { println("Person's constructor!") }
trait Logger09 { println("Logger's constructor!") }
trait MyLogger09 extends Logger09 { println("MyLogger's constructor!") }
trait TimeLogger09 extends Logger09 { println("TimeLogger's constructor!") }
class Student09 extends Person09 with MyLogger09 with TimeLogger09 {
  println("Student's constructor!")
}
