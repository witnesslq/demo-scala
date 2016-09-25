package com.yeahwell.scala.grammer.demo0925

/**
 * @author yeahwell
 */
class Person

case class Teacher(name: String, subject : String) extends Person

case class Student02(name : String, classroom : String) extends Person

object CaseMatchTest {

  def judgeIdentify(p : Person) : Unit = {
    p match{
      case Teacher(name, subject) => println("Teacher " + name  + ", " + subject)
      case Student02(name, classroom) => println("Studnet " + name + "," + classroom)
      case _ => println("illegal access")
    }
  }
  
  def getGrade(name : String): Unit = {
    val grades = Map("xx" -> "A", "yy" -> "B", "zz" -> "C")
    val grade = grades.get(name)
    
    grade match{
      case Some(course) => println("your grade is " + course)
      case None => println("not found")
    }
  }
  
  def main(args: Array[String]): Unit = {
    
    //测试case match
    val person01 = new Teacher("xuanyu", "spark")
    judgeIdentify(person01)
    val person02 = new Student02("yeahwell", "1001")
    judgeIdentify(person02)
    judgeIdentify(new Person)
    
    //Option
    getGrade("xx")
    getGrade("lala")
    
  }
  
}