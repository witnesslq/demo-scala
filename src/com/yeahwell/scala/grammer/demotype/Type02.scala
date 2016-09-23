package com.yeahwell.scala.grammer.demotype

/**
 *  泛型函数
 * 
 * @author yeahwell
 */
object Type02 {
 
  // 泛型函数，与泛型类类似，可以给某个函数在声明时指定泛型类型，然后在函数体内，多个变量或者返回值之间，就可以使用泛型类型进行声明，从而对某个特殊的变量，或者多个变量，进行强制性的类型限制。
// 与泛型类一样，你可以通过给使用了泛型类型的变量传递值来让Scala自动推断泛型的实际类型，也可以在调用函数时，手动指定泛型类型。

//案例：卡片售卖机，可以指定卡片的内容，内容可以是String类型或Int类型
def getCard[T](content: T) = {
  if(content.isInstanceOf[Int]) "card: 001, " + content
  else if(content.isInstanceOf[String]) "card: this is your card, " + content
  else "card: " + content
}

getCard[String]("hello world")

  
}