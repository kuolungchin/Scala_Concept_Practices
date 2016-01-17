package inheritance

abstract class Item {
  def price: Int
  def description: String
}

class SimpleItem(override val price: Int, override val description: String) extends Item


import scala.collection.mutable.ArrayBuffer

class Bundle(var items: ArrayBuffer[Item] = new ArrayBuffer[Item]()) extends Item{
  def addItem(item: Item) = items += item
  
  override def price = items.map(x=>x.price).sum
  override def description = items.map(x=>x.description).mkString(" , ")
}