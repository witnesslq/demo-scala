package com.yeahwell.scala.grammer

/**
 * @author yeahwell
 */
object Demo05 {
  
  def demoMap() : Unit = {
    //创建一个不可变的Map
    val ages = Map("Leo" -> 30, "Jen" -> 25, "Jack" -> 23)
//    ages("Leo") = 31
    
    //创建一个可变的Map
    val ages2 = scala.collection.mutable.Map("Leo" -> 30, "Jen" -> 25, "Jack" -> 23)
    ages2("Leo") = 31
    
    //使用另一种方式定义Map元素
    val ages3 = Map(("Leo", 30),("Jen", 25), ("Jack", 23))
    
    //创建一个空的HashMap
    val ages4 = new scala.collection.mutable.HashMap[String, Int]
    
    //获取指定key对应的value，如果key不存在，会报错
    val leoAge1 = ages2("Leo")
    val leoAge2 = ages2("leo")
    //使用contains函数是否存在
    val leoAge3 = if(ages2.contains("leo")) ages("leo") else 0
    //getOrElse函数
    val leoAge4 = ages2.getOrElse("leo", 0)
    
    //修改Map的元素
    val ages5 = scala.collection.mutable.Map("Leo" -> 30, "Jen" -> 25, "Jack" -> 23)
    ages5("Leo") = 31
    //增加多个元素
    ages5 += ("Mike" -> 35, "Tom" -> 40)
    //移除元素
    ages5 -= "Mike"
    //更新不可变的map
    val ages6 = ages + ("Mike" -> 36,  "Tom" -> 40)
    //移除不可变map的元素
    val ages7 = ages - "Tom"
    
    //遍历map的keySet
    for( (key, value) <- ages5 ) println(key + ":" + value)
    //遍历map的key
    for(key <- ages5.keySet) println(key)
    //遍历map的value
    for(value <- ages5.values) println(value)
    //生成新map，反转key和value
    for( (key, value) <- ages5) yield (value, key)
  }
  
  def demoMapSort(){
    //SortedMap可以自动对Map的key的排序
    val ages = scala.collection.immutable.SortedMap("leo"->30, "alice"->15, "jen"-> 35)
    //LinkedHashMap可以记住插入entry的顺序
    val ages2 = new scala.collection.mutable.LinkedHashMap[String, Int]
    ages2("leo") = 30
    ages2("alice") = 15
    ages2("jen") = 25
  }
  
  def demoTuple(){
    //简单的Tuple
    val t = ("leo", 30)
    //访问Tuple
    t._1
    //zip操作
    val names = Array("leo", "jack", "mike")
    val ages = Array(30, 24, 26)
    val nameAges = names.zip(ages)
    for((name, age) <- nameAges) println(name + ":" + age)
  }
  
  def main(args: Array[String]): Unit = {
    
  }
  
}