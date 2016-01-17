package advanced_type

abstract class ActionType
//object move extends ActionType
object turn extends ActionType
object show extends ActionType
object around extends ActionType
object then extends ActionType


class Bug2 {
	var location = 0
	var direction = 1
    
	def act(at: ActionType) = at match{
	  case _: turn.type => direction *= -1
	  case _: show.type =>  print(location + " ")
	  case _: around.type => direction *= -1
	  case _: then.type => None
	}
	
	def move(steps: Int):this.type = { location += (steps * direction);  this}
}

class FluentBug extends Bug2{
  def and(at: ActionType): this.type = { act(at); this }
  def turn(at: ActionType): this.type = { act(at); this }
}

object Exercise2 extends App{
  implicit def callFluentBug =  new FluentBug
  val bugsy = new FluentBug
   bugsy move 4 and show and then move 6 and show turn around move 5 and show
}