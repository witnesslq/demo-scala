package com.yeahwell.scala.grammer.demotype

/**
 *  泛型类
 * 
 * @author yeahwell
 */
object Type01 {
 
  // 泛型类，顾名思义，其实就是在类的声明中，定义一些泛型类型，然后在类内部，比如field或者method，就可以使用这些泛型类型。
// 使用泛型类，通常是需要对类中的某些成员，比如某些field和method中的参数或变量，进行统一的类型限制，这样可以保证程序更好的健壮性和稳定性。
// 如果不使用泛型进行统一的类型限制，那么在后期程序运行过程中，难免会出现问题，比如传入了不希望的类型，导致程序出问题。
// 在使用类的时候，比如创建类的对象，将类型参数替换为实际的类型，即可。
// Scala自动推断泛型类型特性：直接给使用了泛型类型的field赋值时，Scala会自动进行类型推断。

//案例：新生报到，每个学生来自不同的地方，id可能是Int，可能是String

class Student[T](val localId: T) {
  def getSchoolId(hukouId: T) = "S-" + hukouId + "-" + localId
}

val leo = new Student[Int](111)

  
}