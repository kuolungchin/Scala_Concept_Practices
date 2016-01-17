package objects

object HelloWorld extends App {
  if(args.length > 0) {
    for(arg <- args.reverse) print(arg + " ")
  }else{
    println("Do not have commandline args")
  }
}