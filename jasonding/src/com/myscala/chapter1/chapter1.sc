val args = Array("a","b","c","d","e")

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



assert(formatArgs(args) == "a\nb\nc\nd\ne")

