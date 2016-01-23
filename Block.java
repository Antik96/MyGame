import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


public class Block {
	Image img = new ImageIcon("res/Block/block.png").getImage();
	private int x;
	private int y;
	private Rectangle r;
	
	public Block(int x1, int y1){
		x = x1;
		y = y1;
		r = new Rectangle(x,y,50,50);
	}
	
	public Rectangle getRect(){
		return r;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
