package com.yeahwell.scala.grammer

import scala.util.control.Breaks._

/**
 * @author yeahwell
 */
object Demo02 {

  def sayHello(name : String, age: Int) = {
    if(age > 18){
      printf("%s，你是成年人\n", name)
      age
    }else{
      printf("%s，你是未成年人\n", name)
      age
    }
  }
  
  def sayHello(name : String) = printf("Hello, " + name + "\n")

  /**
   * 有返回值必须有 = 
   */
  def sum(n : Int) = {
    var result = 0
    for(i <- 1 to n){
      result += i
    }
    result
  }
  
  /**
   * 如果在函数体内递归调用函数自身，则必须手动给出函数的返回类型
   */
  def fab(n : Int) : Int = {
    if(n <= 1)
      1
    else
      fab(n - 1) + fab(n - 2)
  }
  
  def sayHelloByDefault(firstName: String, middleName: String = "", lastName: String = "") = println(firstName + "\t" + middleName + "\t" + lastName)
  
  def checkAge(name : String, age : Int = 20){
    println("你好" + name + "年龄" + age)
  }
  
  /**
   * 变长参数
   */
  def sum(nums: Int*) = {
    var result = 0
    for(num <- nums){
      result += num
    }
    result
  }
  
  def sum2(nums : Int*) : Int = {
    if(nums.length == 0)
       0
    else
      //tail表示截取
      nums.head + sum2(nums.tail:_*)
  }
  
  
  
  def main(args: Array[String]): Unit = {
    sayHello("Leo", 30)
    sayHello("Mike")
    println(sum(10))
    fab(10);
    
    sayHelloByDefault("John")
    sayHelloByDefault("John", "Jackson")
    sayHelloByDefault("John", "Jackson", "danzel")
    
    checkAge("babala")
    checkAge("babala", 23)
  
    //带名参数
    checkAge(age = 30, name = "yeahwell")
    sayHelloByDefault("Mick", lastName = "Nina", middleName = "Jack")
    
    //变长参数
    println(sum(1, 2, 3, 4, 5))
    //将一个已有的序列直接调用变长参数函数，此时需要使用scala特殊的语法将参数定义为序列
    println(sum(1 to 5:_*))
    
    
  }
  
  

}