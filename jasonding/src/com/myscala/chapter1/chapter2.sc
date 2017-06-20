object Accounts{
  private var lastNumber = 0
  def newUniqueNumber() = {lastNumber += 1;lastNumber}
}
class Accounts{
  val id = Accounts.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) {balance += amount}
}

class Bar(foo:String)

object Bar {
  def apply(foo: String): Bar = new Bar(foo)
}
val bar = Bar("abc")

abstract class UndoableAction(val description:String){
  def undo():Unit
  def redo():Unit
}

object DoNothingAction extends UndoableAction("Do nothing"){
  override def undo(): Unit = {}
  override def redo(): Unit = {}
  val action = Map("open"-> DoNothingAction,"save"->DoNothingAction)
}

trait Debugger{
  def log(message:String): Unit ={
    println(message)
  }
}
class Child

val child = new Child with Debugger

child.log("aa")