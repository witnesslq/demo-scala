package com.yeahwell.scala.grammer.demotype

/**
 *  Manifest Context Bounds
 * 
 * @author yeahwell
 */
object Type07 {
  
  // 在Scala中，如果要实例化一个泛型数组，就必须使用Manifest Context Bounds。也就是说，如果数组元素类型为T的话，需要为类或者函数定义[T: Manifest]泛型类型，这样才能实例化Array[T]这种泛型数组。

//案例：打包饭菜（一种食品打成一包）
class Meat(val name: String)
class Vegetable(val name: String)

def packageFood[T: Manifest] (food: T*) = {
  val foodPackage = new Array[T](food.length)
  for(i <- 0 until food.length) foodPackage(i) = food(i)
  foodPackage 
}

  
}