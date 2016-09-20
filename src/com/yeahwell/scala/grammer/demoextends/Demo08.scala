package com.yeahwell.scala.grammer.demoextends

/**
 * @author yeahwell
 */
object Demo08 {
 
  def main(args: Array[String]): Unit = {
    
    val s = new Student
    println(s.getName + "," + s.getScore)
    
    println(s.getName + "," + s.getScore)
    
    val s2 = new Student02
    println(s2.name + "," + s2.age)
    
    /**
     * isInstanceOf和asInstanceOf
     */
    val p3: Person03 = new Student03
    println(p3)
    val s3 : Student03 = null
     //如果对象是null，则isInstanceOf一定返回false，asInstanceOf一定返回null
    //如果没有用isInstanceOf先判断对象是否为指定类的实例，就直接用asInstanceOf转换，则可能会抛出异常
    if(p3.isInstanceOf[Student03]){
      p3.asInstanceOf[Student03]
    }
    println(p3)
    
    /**
     * getClass和classOf
     * 
     */
    // isInstanceOf只能判断出对象是否是指定类以及其子类的对象，而不能精确判断出，对象就是指定类的对象
    // 如果要求精确地判断对象就是指定类的对象，那么就只能使用getClass和classOf了
    // 对象.getClass可以精确获取对象的类，classOf[类]可以精确获取类，然后使用==操作符即可判断
    println( p3.getClass == classOf[Person03] )
    println( p3.getClass == classOf[Student03] )
    
    /**
     * 使用模式匹配进行类型判断
     * 
     */
    // 但是在实际开发中，比如spark的源码中，大量的地方都是使用了模式匹配的方式来进行类型的判断，这种方式更加地简洁明了，而且代码得可维护性和可扩展性也非常的高
    // 使用模式匹配，功能性上来说，与isInstanceOf一样，也是判断主要是该类以及该类的子类的对象即可，不是精准判断的
    p3 match {
      case per : Person03 => println("It is Person03's object")
      case _ => println("unknown type")
    }
    
    /**
     * 匿名内部类
     */
    val p6 = new Person06("leo") {
      override def sayHello = "我是覆盖的sayHello " + name
    }
    println("外部打印结果"  + p6.sayHello)
    
    def greeting(p: Person06 { def sayHello: String }) {
      println(p.sayHello)
    }
    greeting(p6)
    
  }
  
}