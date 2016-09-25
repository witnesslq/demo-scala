package com.yeahwell.scala.grammer.demo0925

/**
 * @author yeahwell
 */
object lesson02 {
  
  def judgeGrade(grade : String): Unit = {
    
    grade match{
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so ")
      case _ => println("come on")
    }
    
  }
  
  def judgeGrade(name : String, grade : String): Unit = {
		  
		  grade match{
		  case "A" => println("Excellent")
		  case "B" => println("Good")
		  case "C" => println("Just so so ")
		  case _ => println("come on")
		  }
		  
  }
  
  def main(args: Array[String]): Unit = {
    
    judgeGrade("A")
    judgeGrade("B")
    judgeGrade("E")
    
  }
  
}