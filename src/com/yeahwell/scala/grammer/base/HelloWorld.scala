package com.yeahwell.scala.grammer.base

import scala.io.Source

/**
 * @author yanjiawei
 * <ul>
 * <li>Scala访问数组的语法是使用()而非[]</li>
 * <li>Scala使用[]来为数组指明类型化参数</li>
 * <li>Scala中所有的基本数据类型也是对象</li>
 * <li></li>
 *
 * <li>缺省情况Set为Immutable Set，如果你需要使用可修改的集合类（Set类型），你可以使用全路径来指明Set，比如 scala.collection.mutalbe.Set</li>
 * <li></li>
 * </ul>
 *
 * <h5>scala编程原则</h5>
 * <li>能不用Vars，尽量不用vars</li>
 * <li>能不用mutable变量，尽量不用mutable变量</li>
 * <li>能避免函数的副作用，尽量不产生副作用</li>
 * <ul>
 */
object HelloWorld {

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def greet() = println("Hello")
  greet(): Unit

  def demoWhile(): Unit = {
    var i = 0
    while (i < 6) {
      println("while--" + i)
      i += 1
    }
  }

  def demoGeneric(): Unit = {
    var greetStringArray = new Array[String](3)
    greetStringArray(0) = "I am "
    greetStringArray(1) = "...... writing "
    greetStringArray(2) = "poem\n"
    for (i <- 0 to 2)
      print(greetStringArray(i))
    greetStringArray.update(0, "You are")
    greetStringArray.update(1, "...... reading ")
    greetStringArray.update(2, "poem\n")
    for (i <- 0 to 2)
      print(greetStringArray(i))
  }

  def demoList(): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println("oneTwo plus threeFour is " + oneTwo + "\t" + threeFour + "=" + oneTwoThreeFour)
    val oneTwoThree = 1 :: 2 :: 3 :: Nil
    println("oneTwoThree=" + oneTwoThree)
    val oneTwoThree2 = Nil.::(3).::(2).::(1)
    println("oneTwoThree2=" + oneTwoThree2)
  }

  def demoTuples(): Unit = {
    val pair = (99, "小乌龟")
    println(pair._1)
    println(pair._2)
  }

  def demoSet(): Unit = {
    var jetSet = Set("Mari", "Jane")
    jetSet += "KangKang"
    println(jetSet.contains("KangKang"))
  }

  def demoMap(): Unit = {
    val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
    println(romanNumeral(4))
  }

  /**
   * 函数式编程
   */
  def printArgs(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg)

    args.foreach(println)
  }

  def demoReadFile(filePathName: String): Unit = {
    for (line <- Source.fromFile(filePathName).getLines())
      println(line.length() + " " + line)
  }

  def demoCal(): Unit = {
    println((5 ^ 2) + 2)
    println(5 ^ 3 + 2)
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")
    demoWhile()
    demoGeneric()
    demoList()
    demoTuples()
    demoSet()
    demoMap()
    //    demoReadFile("/Users/yeahwell/Documents/地址.txt");
    demoCal();
  }

}