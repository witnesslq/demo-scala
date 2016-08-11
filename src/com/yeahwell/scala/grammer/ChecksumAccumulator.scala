package com.yeahwell.scala.grammer

/**
 * @author yanjiawei
 */
class ChecksumAccumulator {
  private var sum = 0;
  def add(b : Byte) : Unit = {
    sum += b;
  }
  def checksum() : Int = ~(sum & 0xFF) + 1
}

/**
 * 类ChecksumAccumulator同名，这在Scala中把这个对象成为其同名的类的“伴侣”对象（Companion object)
 * 
 * 
 */
object ChecksumAccumulator {
  
  private val cache = Map [String, Int]()
  
  def calculate(s : String) : Int = 
    if(cache.contains(s))
      cache(s)
    else{
      val acc = new ChecksumAccumulator
      for( c <- s )
        acc.add(c.toByte)
      val cs = acc.checksum()
//      cache += (s -> cs)
      cs
    }
  
}

//println(ChecksumAccumulator.calculate("Welcome to Scala Chinese community"))

/**
 * Scala的trait 和Java 的Interface相比，可以有方法的实现（这点有点像抽象类,但如果是抽象类，就不会允许继承多个抽象类）。Scala的Trait支持类和Singleton对象和多个Trait混合（使用来自这些Trait中的方法，而不时不违反单一继承的原则）
 */
