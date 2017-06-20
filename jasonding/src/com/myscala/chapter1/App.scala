package com.myscala.chapter1

object App {
  def main(args: Array[String]): Unit = {
    val app = new App
    app.printArgs1(args)
    app.printArgs2(args)
    app.printArgs3(args)
  }

}
class App {
  //使用var的指令式风格
  def printArgs1(args: Array[String]): Unit = {
    var i = 0;
    while(i < args.length){
      println(args(i))
      i += 1
    }
  }
  //函数式风格
  def printArgs2(args: Array[String]): Unit = {
    for(arg <- args)
      println(arg)
  }
  //或者
  def printArgs3(args: Array[String]): Unit = {
    args.foreach(println)
  }
  def formatArgs(args:Array[String]) = args.mkString("\n")
}
