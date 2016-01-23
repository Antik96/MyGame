import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ListIterator;

import javax.swing.ImageIcon;


public class Player1 extends Player{
	static WalkThread1 wt;
	private boolean isDead;
	private boolean isHited;
	private Image img = new ImageIcon("res/Player1/1.png").getImage();
	boolean isMoveUp = false;
	boolean isMoveRight = false;
	boolean isMoveDown = false;
	boolean isMoveLeft = false;
	private static int x = 875;
	private static int y = 75;	
	
	public Player1(){
		wt = new WalkThread1();
		wt.start();
	}
	
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_UP){
			isMoveUp = true;
		}
		if(key == KeyEvent.VK_RIGHT){
			isMoveRight = true;	
		}
		if(key == KeyEvent.VK_DOWN){
			isMoveDown = true;	
		}
		if(key == KeyEvent.VK_LEFT){
			isMoveLeft = true;
		}
		if(key == KeyEvent.VK_INSERT){
			b.plantBomb(this.x, this.y);
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP){
			isMoveUp = false;
		}
		if(key == KeyEvent.VK_RIGHT){
			isMoveRight = false;	
		}
		if(key == KeyEvent.VK_DOWN){
			isMoveDown = false;	
		}
		if(key == KeyEvent.VK_LEFT){
			isMoveLeft = false;
		}
	}
	
	public void move(){
		if(isDead || isHited)
			return;

		if(isMoveUp == true && this.getRect().intersects(b.r_up) == false){
			if(b.check_free(this.getRect()) == true){
				y-=2;
			}
			if(b.check_free(this.getRect()) == false){
				if(b.check_free(new Rectangle(x,y-25,25,50)) == false && b.check_free(new Rectangle(x-25,y-25,25,50)) == true){
					x-=2;
				}
				if(b.check_free(new Rectangle(x,y-25,25,50)) == true && b.check_free(new Rectangle(x-25,y-25,25,50)) == false){
					x+=2;
				}
				y+=2;
			}
		}
		
		
		if(isMoveRight == true && this.getRect().intersects(b.r_right) == false){
			if(b.check_free(this.getRect()) == true){
				x+=2;
			}
			if(b.check_free(this.getRect()) == false){
				if(b.check_free(new Rectangle(x-25,y-25,50,25)) == false && b.check_free(new Rectangle(x-25,y,50,25)) == true){
					y+=2;
				}
				if(b.check_free(new Rectangle(x-25,y-25,50,25)) == true && b.check_free(new Rectangle(x-25,y,50,25)) == false){
					y-=2;
				}
				x-=2;
			}
		}
		
		
		if(isMoveDown == true && this.getRect().intersects(b.r_down) == false){
			if(b.check_free(this.getRect()) == true){
				y+=2;
			}
			if(b.check_free(this.getRect()) == false){
				if(b.check_free(new Rectangle(x,y-25,25,50)) == false && b.check_free(new Rectangle(x-25,y-25,25,50)) == true){
					x-=2;
				}
				if(b.check_free(new Rectangle(x,y-25,25,50)) == true && b.check_free(new Rectangle(x-25,y-25,25,50)) == false){
					x+=2;
				}
				y-=2;
			}
		}
		if(isMoveLeft == true && this.getRect().intersects(b.r_left) == false){
			if(b.check_free(this.getRect()) == true){
				x-=2;
			}
			if(b.check_free(this.getRect()) == false){
				if(b.check_free(new Rectangle(x-25,y-25,50,25)) == false && b.check_free(new Rectangle(x-25,y,50,25)) == true){
					y+=2;
				}
				if(b.check_free(new Rectangle(x-25,y-25,50,25)) == true && b.check_free(new Rectangle(x-25,y,50,25)) == false){
					y-=2;
				}
				x+=2;
			}
		}
	}
	
	
	
	private class WalkThread1 extends Thread{
		Image down_1 = new ImageIcon("res/Player1/1.png").getImage();
		Image down_2 = new ImageIcon("res/Player1/2.png").getImage();
		Image down_3 = new ImageIcon("res/Player1/3.png").getImage();
		Image left_1 = new ImageIcon("res/Player1/4.png").getImage();
		Image left_2 = new ImageIcon("res/Player1/5.png").getImage();
		Image left_3 = new ImageIcon("res/Player1/6.png").getImage();
		Image up_1 = new ImageIcon("res/Player1/7.png").getImage();
		Image up_2 = new ImageIcon("res/Player1/8.png").getImage();
		Image up_3 = new ImageIcon("res/Player1/9.png").getImage();
		Image right_1 = new ImageIcon("res/Player1/10.png").getImage();
		Image right_2 = new ImageIcon("res/Player1/11.png").getImage();
		Image right_3 = new ImageIcon("res/Player1/12.png").getImage();
		Image dead_1 = new ImageIcon("res/Player1/d1.png").getImage();
		Image dead_2 = new ImageIcon("res/Player1/d2.png").getImage();
		Image dead_3 = new ImageIcon("res/Player1/d3.png").getImage();
		Image dead_4 = new ImageIcon("res/Player1/d4.png").getImage();
		Image dead_5 = new ImageIcon("res/Player1/d5.png").getImage();
		Image dead_6 = new ImageIcon("res/Player1/d6.png").getImage();
		Image dead_7 = new ImageIcon("res/Player1/d7.png").getImage();

		@Override
		public void run() {
			try {
				while (true) {

					for (int timer = 0; timer <= 520; timer++) {
						if (isHited == true) {
							setImg(dead_1);
							this.sleep(1300);
							setImg(dead_2);
							this.sleep(130);
							setImg(dead_3);
							this.sleep(130);
							setImg(dead_4);
							this.sleep(130);
							setImg(dead_5);
							this.sleep(130);
							setImg(dead_6);
							this.sleep(130);
							setImg(dead_7);
							this.sleep(130);
							setIsDead();
							return;
						}
						if (timer == 0) {
							if (isMoveUp == true)
								setImg(up_2);
							if (isMoveRight == true)
								setImg(right_2);
							if (isMoveDown == true)
								setImg(down_2);
							if (isMoveLeft == true)
								setImg(left_2);
						}
						if (timer == 130) {
							if (isMoveUp == true)
								setImg(up_1);
							if (isMoveRight == true)
								setImg(right_1);
							if (isMoveDown == true)
								setImg(down_1);
							if (isMoveLeft == true)
								setImg(left_1);
						}
						if (timer == 260) {
							if (isMoveUp == true)
								setImg(up_3);
							if (isMoveRight == true)
								setImg(right_3);
							if (isMoveDown == true)
								setImg(down_3);
							if (isMoveLeft == true)
								setImg(left_3);
						}
						if (timer == 390) {
							if (isMoveUp == true)
								setImg(up_1);
							if (isMoveRight == true)
								setImg(right_1);
							if (isMoveDown == true)
								setImg(down_1);
							if (isMoveLeft == true)
								setImg(left_1);
						}
						sleep(1);
					}

				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



	public Rectangle getRect(){
		return new Rectangle(x-23,y-23,46,46);
	}	
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public Image getImg(){
		return this.img;
	}
	@Override
	public boolean getIsDead() {
		return isDead;
	}
	public void setX(int x1){
		this.x = x1;
	}	
	public void setY(int y1){
		this.y = y1;
	}
	public void setImg(Image i){
		this.img = i;
	}	
	@Override
	public void setIsDead() {
		isDead = true;
	}
	@Override
	public void setIsHited() {
		isHited = true;
	}

}
