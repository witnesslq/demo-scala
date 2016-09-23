package com.yeahwell.scala.grammer.demotype

/**
 *  View Bounds
 * 
 * @author yeahwell
 */
object Type05 {
 
  // 上下边界Bounds，虽然可以让一种泛型类型，支持有父子关系的多种类型。但是，在某个类与上下边界Bounds指定的父子类型范围内的类都没有任何关系，则默认是肯定不能接受的。
// 然而，View Bounds作为一种上下边界Bounds的加强版，支持可以对类型进行隐式转换，将指定的类型进行隐式转换后，再判断是否在边界指定的类型范围内

//案例：跟小狗交朋友
class Person(val name: String) {
  def sayHello = println("Hello, I'm " + name)
  def makeFriends(p: Person) {
    sayHello
    p.sayHello
  }
}
class Student(name: String) extends Person(name)
class Dog(val name: String) { def sayHello = println("Wang, Wang, I'm " + name) }

implicit def dog2person(dog: Object): Person = if(dog.isInstanceOf[Dog]) {val _dog = dog.asInstanceOf[Dog]; new Person(_dog.name) } else Nil

class Party[T <% Person](p1: T, p2: T)

  
}