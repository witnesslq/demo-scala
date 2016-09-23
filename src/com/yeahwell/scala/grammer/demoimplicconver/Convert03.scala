package com.yeahwell.scala.grammer.demoimplicconver

/**
 *  隐式转换函数作用域与导入
 * 
 * @author yeahwell
 */
// Scala默认会使用两种隐式转换，一种是源类型，或者目标类型的伴生对象内的隐式转换函数；一种是当前程序作用域内的可以用唯一标识符表示的隐式转换函数。

// 如果隐式转换函数不在上述两种情况下的话，那么就必须手动使用import语法引入某个包下的隐式转换函数，比如import test._。通常建议，仅仅在需要进行隐式转换的地方，比如某个函数或者方法内，用iimport导入隐式转换函数，这样可以缩小隐式转换函数的作用域，避免不需要的隐式转换。

object Convert03 {
  
}