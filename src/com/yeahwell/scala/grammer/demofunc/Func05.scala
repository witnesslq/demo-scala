package com.yeahwell.scala.grammer.demofunc

/**
 *  Scala的常用高阶函数
 * 
 * @author yeahwell
 */
object Func05 {

  // map: 对传入的每个元素都进行映射，返回一个处理后的元素
  Array(1, 2, 3, 4, 5).map(2 * _)

  // foreach: 对传入的每个元素都进行处理，但是没有返回值
  (1 to 9).map("*" * _).foreach(println _)

  // filter: 对传入的每个元素都进行条件判断，如果对元素返回true，则保留该元素，否则过滤掉该元素
  (1 to 20).filter(_ % 2 == 0)

  // reduceLeft: 从左侧元素开始，进行reduce操作，即先对元素1和元素2进行处理，然后将结果与元素3处理，再将结果与元素4处理，依次类推，即为reduce；reduce操作必须掌握！spark编程的重点！！！
  // 下面这个操作就相当于1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9
  (1 to 9).reduceLeft(_ * _)

  // sortWith: 对元素进行两两相比，进行排序
  Array(3, 2, 5, 4, 10, 1).sortWith(_ < _)

}