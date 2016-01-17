package traits

import java.awt.geom.Ellipse2D

trait RectangleLike extends Ellipse2D.Double{
  def translate(tx:Int, ty: Int) {
    x = tx
    y = ty
  }
  
  def grow(gHeight: Int, gLength: Int){
    x = x - gHeight
    y = y - gLength    
    height = height +  gHeight
    width =  width +   gLength 
  }

}