//头等函数

object addOne extends Function1[Int,Int] {
  override def apply(m: Int): Int = m + 1
}


addOne(1)

class AddOne extends Function1[Double,Double] {
  override def apply(v1: Double): Double = v1 + 1
}

val plusOne = new AddOne

plusOne(1)

class AddTwo extends (Int => Int){
  def apply(m:Int):Int = m + 2
}

val addTwo = new AddTwo
addTwo(2)

//占位符简化
//高阶函数
def hf(f:String => Unit) = f("higer")
def aa(s:String)=println(s)
hf(s=>aa(s))

hf(aa(_))

hf(aa _)

hf(aa)