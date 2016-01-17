package advanced_type

class Bug {
	var location = 0
	var direction = 1
    def move(steps: Int):this.type = { location += (steps * direction);  this}
	def turn():this.type = { direction *= -1; this}  
	def show(): this.type = { print(location + " "); this}
}

object Exercise1 extends App{
  val bugsy = new Bug
  bugsy.move(4).show().move(6).show().turn().move(5).show()
}