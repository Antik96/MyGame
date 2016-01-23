import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ListIterator;

import javax.swing.ImageIcon;
import javax.swing.Timer;



public abstract class Player {
	
	Barriers b = Barriers.getBarriers();
	
	
	
			
	//===============метод возвращающий прямоугольник игрока=============
	public abstract Rectangle getRect();
			
	public abstract void keyPressed(KeyEvent e);
	
	public abstract void keyReleased(KeyEvent e);
	
	public abstract void move();

	public abstract int getX();
	
	public abstract int getY();
	
	public abstract Image getImg();
	
	public abstract boolean getIsDead();
	
	public abstract void setX(int x1);
	
	public abstract void setY(int y1);

	public abstract void setImg(Image i);
	
	public abstract void setIsDead();
	
	public abstract void setIsHited();
	
}
