package com.yeahwell.scala.grammer.base

/**
 * @author yanjiawei
 */
class Rational(n: Int, d: Int) {
  
  require(d != 0)
  
  private val g = gcd(n.abs, d.abs)
  
  var number = n
  var denom = d
  
  override def toString = number + "/" + denom
  
  /**
   * 定义运算符
   */
  def +(that : Rational) : Rational = {
    new Rational(number * that.denom + that.denom * denom, denom * that.denom)
  }
  
  /**
   * 方法重载
   */
  def +(i : Int) : Rational = {
    new Rational(number + i * denom, denom)
  }
  
  def *(that : Rational) : Rational = {
    new Rational(number * that.number, denom * that.denom)
  }
  
  /**
   * 隐含类型转换
   */
  implicit def intToRational(x:Int) = new Rational(x)
  
  def add(that : Rational) : Rational = {
    new Rational(number * that.denom + that.denom * denom, denom * that.denom)
  }
  
  def lessThan(that : Rational) =
    this.number * that.denom < this.denom * that.number
    
  def max(that : Rational) = {
    if(lessThan(that))
      that
    else
      this
  }
  
  def this(n : Int) = this(n, 1)
  
  private def gcd(a : Int, b : Int) : Int = 
    if(b == 0)
      a
    else
      gcd(b, a % b)
      
}

object Rational {
  
  def main(args: Array[String]): Unit = {
    val r = new Rational(1, 2)
    println(r)
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf add twoThirds)
    println(twoThirds.denom)
    //new Rational(5, 0)
    val x = new Rational(1, 2)
    val y = new Rational(3, 4)
    println(x + y)
    println(x + x * y)
  }
  
}
