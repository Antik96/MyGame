import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;


public class Bomb extends Thread{
	Image img;
	Image img1 = new ImageIcon("res/Bomb/bomb1.png").getImage();
	Image img2 = new ImageIcon("res/Bomb/bomb2.png").getImage();
	Image img3 = new ImageIcon("res/Bomb/bomb3.png").getImage();
	Image img4 = new ImageIcon("res/Bomb/bomb4.png").getImage();
	Image img5 = new ImageIcon("res/Bomb/bomb5.png").getImage();
	Image bomb_explode_centr;
	Image bomb_explode_centr1 = new ImageIcon("res/BombExplode/bomb_explode_centr1.png").getImage();
	Image bomb_explode_centr2 = new ImageIcon("res/BombExplode/bomb_explode_centr2.png").getImage();
	Image bomb_explode_centr3 = new ImageIcon("res/BombExplode/bomb_explode_centr3.png").getImage();
	Image bomb_explode_centr4 = new ImageIcon("res/BombExplode/bomb_explode_centr4.png").getImage();
	Image bomb_explode_centr5 = new ImageIcon("res/BombExplode/bomb_explode_centr5.png").getImage();
	Image bomb_explode_centr6 = new ImageIcon("res/BombExplode/bomb_explode_centr6.png").getImage();
	Image bomb_explode_centr7 = new ImageIcon("res/BombExplode/bomb_explode_centr7.png").getImage();
	Image bomb_explode_centr8 = new ImageIcon("res/BombExplode/bomb_explode_centr8.png").getImage();

	Image bomb_explode_down1 = new ImageIcon("res/BombExplode/bomb_explode_down1.png").getImage();
	Image bomb_explode_down2 = new ImageIcon("res/BombExplode/bomb_explode_down2.png").getImage();
	Image bomb_explode_down3 = new ImageIcon("res/BombExplode/bomb_explode_down3.png").getImage();
	Image bomb_explode_down4 = new ImageIcon("res/BombExplode/bomb_explode_down4.png").getImage();
	Image bomb_explode_down5 = new ImageIcon("res/BombExplode/bomb_explode_down5.png").getImage();
	Image bomb_explode_down6 = new ImageIcon("res/BombExplode/bomb_explode_down6.png").getImage();
	Image bomb_explode_down7 = new ImageIcon("res/BombExplode/bomb_explode_down7.png").getImage();
	Image bomb_explode_down8 = new ImageIcon("res/BombExplode/bomb_explode_down8.png").getImage();

	Image bomb_explode_left1 = new ImageIcon("res/BombExplode/bomb_explode_left1.png").getImage();
	Image bomb_explode_left2 = new ImageIcon("res/BombExplode/bomb_explode_left2.png").getImage();
	Image bomb_explode_left3 = new ImageIcon("res/BombExplode/bomb_explode_left3.png").getImage();
	Image bomb_explode_left4 = new ImageIcon("res/BombExplode/bomb_explode_left4.png").getImage();
	Image bomb_explode_left5 = new ImageIcon("res/BombExplode/bomb_explode_left5.png").getImage();
	Image bomb_explode_left6 = new ImageIcon("res/BombExplode/bomb_explode_left6.png").getImage();
	Image bomb_explode_left7 = new ImageIcon("res/BombExplode/bomb_explode_left7.png").getImage();
	Image bomb_explode_left8 = new ImageIcon("res/BombExplode/bomb_explode_left8.png").getImage();

	Image bomb_explode_right1 = new ImageIcon("res/BombExplode/bomb_explode_right1.png").getImage();
	Image bomb_explode_right2 = new ImageIcon("res/BombExplode/bomb_explode_right2.png").getImage();
	Image bomb_explode_right3 = new ImageIcon("res/BombExplode/bomb_explode_right3.png").getImage();
	Image bomb_explode_right4 = new ImageIcon("res/BombExplode/bomb_explode_right4.png").getImage();
	Image bomb_explode_right5 = new ImageIcon("res/BombExplode/bomb_explode_right5.png").getImage();
	Image bomb_explode_right6 = new ImageIcon("res/BombExplode/bomb_explode_right6.png").getImage();
	Image bomb_explode_right7 = new ImageIcon("res/BombExplode/bomb_explode_right7.png").getImage();
	Image bomb_explode_right8 = new ImageIcon("res/BombExplode/bomb_explode_right8.png").getImage();

	Image bomb_explode_up1 = new ImageIcon("res/BombExplode/bomb_explode_up1.png").getImage();
	Image bomb_explode_up2 = new ImageIcon("res/BombExplode/bomb_explode_up2.png").getImage();
	Image bomb_explode_up3 = new ImageIcon("res/BombExplode/bomb_explode_up3.png").getImage();
	Image bomb_explode_up4 = new ImageIcon("res/BombExplode/bomb_explode_up4.png").getImage();
	Image bomb_explode_up5 = new ImageIcon("res/BombExplode/bomb_explode_up5.png").getImage();
	Image bomb_explode_up6 = new ImageIcon("res/BombExplode/bomb_explode_up6.png").getImage();
	Image bomb_explode_up7 = new ImageIcon("res/BombExplode/bomb_explode_up7.png").getImage();
	Image bomb_explode_up8 = new ImageIcon("res/BombExplode/bomb_explode_up8.png").getImage();

	Image bomb_explode_line_horizontal1 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal1.png").getImage();
	Image bomb_explode_line_horizontal2 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal2.png").getImage();
	Image bomb_explode_line_horizontal3 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal3.png").getImage();
	Image bomb_explode_line_horizontal4 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal4.png").getImage();
	Image bomb_explode_line_horizontal5 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal5.png").getImage();
	Image bomb_explode_line_horizontal6 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal6.png").getImage();
	Image bomb_explode_line_horizontal7 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal7.png").getImage();
	Image bomb_explode_line_horizontal8 = new ImageIcon("res/BombExplode/bomb_explode_line_horizontal8.png").getImage();

	Image bomb_explode_line_vertical1 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical1.png").getImage();
	Image bomb_explode_line_vertical2 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical2.png").getImage();
	Image bomb_explode_line_vertical3 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical3.png").getImage();
	Image bomb_explode_line_vertical4 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical4.png").getImage();
	Image bomb_explode_line_vertical5 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical5.png").getImage();
	Image bomb_explode_line_vertical6 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical6.png").getImage();
	Image bomb_explode_line_vertical7 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical7.png").getImage();
	Image bomb_explode_line_vertical8 = new ImageIcon("res/BombExplode/bomb_explode_line_vertical8.png").getImage();

	public ArrayList<Image> explode_up;
	public ArrayList<Image> curr_explode_up1 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_up2 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_up3 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_up4 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_up5 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_up6 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_up7 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_up8 = new ArrayList<Image>();
	public ArrayList<Image> explode_right;
	public ArrayList<Image> curr_explode_right1 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_right2 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_right3 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_right4 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_right5 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_right6 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_right7 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_right8 = new ArrayList<Image>();
	public ArrayList<Image> explode_down;
	public ArrayList<Image> curr_explode_down1 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_down2 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_down3 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_down4 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_down5 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_down6 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_down7 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_down8 = new ArrayList<Image>();
	public ArrayList<Image> explode_left;
	public ArrayList<Image> curr_explode_left1 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_left2 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_left3 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_left4 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_left5 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_left6 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_left7 = new ArrayList<Image>();
	public ArrayList<Image> curr_explode_left8 = new ArrayList<Image>();
	private int x;
	private int y;
	private int range;
	private int timer;
	private int number = 1;
	private Rectangle r = new Rectangle();
	private boolean explosed = false;
	Barriers b = Barriers.getBarriers();
	
	
	public Bomb(int x1, int y1){
		for(int i = 1; i < 12; i++){
			for(int j = 1; j < 18; j++){
				if(x1<50+50*j && y1<50+50*i){
					x=50*j+25;
					y=50*i+25;
					range = 5;
					
					return;
				}
			}
		}
		
	}
	
	public void explode(){
		
		explode_up = new ArrayList<Image>();
		explode_right = new ArrayList<Image>();
		explode_down = new ArrayList<Image>();
		explode_left = new ArrayList<Image>();
		
		for(int i = 1; i <= range; i++){	
			if(new Rectangle(x,y-50*i,5,5).intersects(b.r_up) == true){
				if(i!=1){
					curr_explode_up1.set(i-2, bomb_explode_up1);
					curr_explode_up2.set(i-2, bomb_explode_up2);
					curr_explode_up3.set(i-2, bomb_explode_up3);
					curr_explode_up4.set(i-2, bomb_explode_up4);
					curr_explode_up5.set(i-2, bomb_explode_up5);
					curr_explode_up6.set(i-2, bomb_explode_up6);
					curr_explode_up7.set(i-2, bomb_explode_up7);
					curr_explode_up8.set(i-2, bomb_explode_up8);
				}
				break;
			}
			if(b.check_free_const(new Rectangle(x,y-50*i,5,5)) == false){
				break;
			}
			if(b.check_free_block(new Rectangle(x,y-50*i,5,5)) == false){
				curr_explode_up1.add(bomb_explode_up1);
				curr_explode_up2.add(bomb_explode_up2);
				curr_explode_up3.add(bomb_explode_up3);
				curr_explode_up4.add(bomb_explode_up4);
				curr_explode_up5.add(bomb_explode_up5);
				curr_explode_up6.add(bomb_explode_up6);
				curr_explode_up7.add(bomb_explode_up7);
				curr_explode_up8.add(bomb_explode_up8);
				break;
			}
			if(i!=range){
				curr_explode_up1.add(bomb_explode_line_vertical1);
				curr_explode_up2.add(bomb_explode_line_vertical2);
				curr_explode_up3.add(bomb_explode_line_vertical3);
				curr_explode_up4.add(bomb_explode_line_vertical4);
				curr_explode_up5.add(bomb_explode_line_vertical5);
				curr_explode_up6.add(bomb_explode_line_vertical6);
				curr_explode_up7.add(bomb_explode_line_vertical7);
				curr_explode_up8.add(bomb_explode_line_vertical8);
			}else{
				curr_explode_up1.add(bomb_explode_up1);
				curr_explode_up2.add(bomb_explode_up2);
				curr_explode_up3.add(bomb_explode_up3);
				curr_explode_up4.add(bomb_explode_up4);
				curr_explode_up5.add(bomb_explode_up5);
				curr_explode_up6.add(bomb_explode_up6);
				curr_explode_up7.add(bomb_explode_up7);
				curr_explode_up8.add(bomb_explode_up8);
			}
		}

		for(int i = 1; i <= range; i++){
			if(new Rectangle(x+50*i,y,5,5).intersects(b.r_right) == true){
				if(i!=1){
					curr_explode_right1.set(i-2, bomb_explode_right1);
					curr_explode_right2.set(i-2, bomb_explode_right2);
					curr_explode_right3.set(i-2, bomb_explode_right3);
					curr_explode_right4.set(i-2, bomb_explode_right4);
					curr_explode_right5.set(i-2, bomb_explode_right5);
					curr_explode_right6.set(i-2, bomb_explode_right6);
					curr_explode_right7.set(i-2, bomb_explode_right7);
					curr_explode_right8.set(i-2, bomb_explode_right8);
				}
				break;
			}
			if(b.check_free_const(new Rectangle(x+50*i,y,5,5)) == false){
				break;
			}
			if(b.check_free_block(new Rectangle(x+50*i,y,5,5)) == false){
				curr_explode_right1.add(bomb_explode_right1);
				curr_explode_right2.add(bomb_explode_right2);
				curr_explode_right3.add(bomb_explode_right3);
				curr_explode_right4.add(bomb_explode_right4);
				curr_explode_right5.add(bomb_explode_right5);
				curr_explode_right6.add(bomb_explode_right6);
				curr_explode_right7.add(bomb_explode_right7);
				curr_explode_right8.add(bomb_explode_right8);
				break;
			}
			if(i!=range){
				curr_explode_right1.add(bomb_explode_line_horizontal1);
				curr_explode_right2.add(bomb_explode_line_horizontal2);
				curr_explode_right3.add(bomb_explode_line_horizontal3);
				curr_explode_right4.add(bomb_explode_line_horizontal4);
				curr_explode_right5.add(bomb_explode_line_horizontal5);
				curr_explode_right6.add(bomb_explode_line_horizontal6);
				curr_explode_right7.add(bomb_explode_line_horizontal7);
				curr_explode_right8.add(bomb_explode_line_horizontal8);
			}else{
				curr_explode_right1.add(bomb_explode_right1);
				curr_explode_right2.add(bomb_explode_right2);
				curr_explode_right3.add(bomb_explode_right3);
				curr_explode_right4.add(bomb_explode_right4);
				curr_explode_right5.add(bomb_explode_right5);
				curr_explode_right6.add(bomb_explode_right6);
				curr_explode_right7.add(bomb_explode_right7);
				curr_explode_right8.add(bomb_explode_right8);
			}
		}
		
		for(int i = 1; i <= range; i++){
			if(new Rectangle(x,y+50*i,5,5).intersects(b.r_down) == true){
				if(i!=1){
					curr_explode_down1.set(i-2, bomb_explode_down1);
					curr_explode_down2.set(i-2, bomb_explode_down2);
					curr_explode_down3.set(i-2, bomb_explode_down3);
					curr_explode_down4.set(i-2, bomb_explode_down4);
					curr_explode_down5.set(i-2, bomb_explode_down5);
					curr_explode_down6.set(i-2, bomb_explode_down6);
					curr_explode_down7.set(i-2, bomb_explode_down7);
					curr_explode_down8.set(i-2, bomb_explode_down8);
				}
				break;
			}
			if(b.check_free_const(new Rectangle(x,y+50*i,5,5)) == false){
				break;
			}
			if(b.check_free_block(new Rectangle(x,y+50*i,5,5)) == false){
				curr_explode_down1.add(bomb_explode_down1);
				curr_explode_down2.add(bomb_explode_down2);
				curr_explode_down3.add(bomb_explode_down3);
				curr_explode_down4.add(bomb_explode_down4);
				curr_explode_down5.add(bomb_explode_down5);
				curr_explode_down6.add(bomb_explode_down6);
				curr_explode_down7.add(bomb_explode_down7);
				curr_explode_down8.add(bomb_explode_down8);
				break;
			}
			if(i!=range){
				curr_explode_down1.add(bomb_explode_line_vertical1);
				curr_explode_down2.add(bomb_explode_line_vertical2);
				curr_explode_down3.add(bomb_explode_line_vertical3);
				curr_explode_down4.add(bomb_explode_line_vertical4);
				curr_explode_down5.add(bomb_explode_line_vertical5);
				curr_explode_down6.add(bomb_explode_line_vertical6);
				curr_explode_down7.add(bomb_explode_line_vertical7);
				curr_explode_down8.add(bomb_explode_line_vertical8);
			}else{
				curr_explode_down1.add(bomb_explode_down1);
				curr_explode_down2.add(bomb_explode_down2);
				curr_explode_down3.add(bomb_explode_down3);
				curr_explode_down4.add(bomb_explode_down4);
				curr_explode_down5.add(bomb_explode_down5);
				curr_explode_down6.add(bomb_explode_down6);
				curr_explode_down7.add(bomb_explode_down7);
				curr_explode_down8.add(bomb_explode_down8);
			}
		}
		
		for(int i = 1; i <= range; i++){	
			if(new Rectangle(x-50*i,y,5,5).intersects(b.r_left) == true){
				if(i!=1){
					curr_explode_left1.set(i-2, bomb_explode_left1);
					curr_explode_left2.set(i-2, bomb_explode_left2);
					curr_explode_left3.set(i-2, bomb_explode_left3);
					curr_explode_left4.set(i-2, bomb_explode_left4);
					curr_explode_left5.set(i-2, bomb_explode_left5);
					curr_explode_left6.set(i-2, bomb_explode_left6);
					curr_explode_left7.set(i-2, bomb_explode_left7);
					curr_explode_left8.set(i-2, bomb_explode_left8);
				}
				break;
			}
			if(b.check_free_const(new Rectangle(x-50*i,y,5,5)) == false){
				break;
			}
			if(b.check_free_block(new Rectangle(x-50*i,y,5,5)) == false){
				curr_explode_left1.add(bomb_explode_left1);
				curr_explode_left2.add(bomb_explode_left2);
				curr_explode_left3.add(bomb_explode_left3);
				curr_explode_left4.add(bomb_explode_left4);
				curr_explode_left5.add(bomb_explode_left5);
				curr_explode_left6.add(bomb_explode_left6);
				curr_explode_left7.add(bomb_explode_left7);
				curr_explode_left8.add(bomb_explode_left8);
				break;
			}
			if(i!=range){
				curr_explode_left1.add(bomb_explode_line_horizontal1);
				curr_explode_left2.add(bomb_explode_line_horizontal2);
				curr_explode_left3.add(bomb_explode_line_horizontal3);
				curr_explode_left4.add(bomb_explode_line_horizontal4);
				curr_explode_left5.add(bomb_explode_line_horizontal5);
				curr_explode_left6.add(bomb_explode_line_horizontal6);
				curr_explode_left7.add(bomb_explode_line_horizontal7);
				curr_explode_left8.add(bomb_explode_line_horizontal8);
			}else{
				curr_explode_left1.add(bomb_explode_left1);
				curr_explode_left2.add(bomb_explode_left2);
				curr_explode_left3.add(bomb_explode_left3);
				curr_explode_left4.add(bomb_explode_left4);
				curr_explode_left5.add(bomb_explode_left5);
				curr_explode_left6.add(bomb_explode_left6);
				curr_explode_left7.add(bomb_explode_left7);
				curr_explode_left8.add(bomb_explode_left8);
			}
		}
		
		change_explode_image();
		for(int i = 1; i<=explode_up.size(); i++){
			b.deleteBlock(x, y-50*i);
			b.explodeBomb(x, y-50*i);
			b.killPlayer(x, y-50*i);
			
		}
		for(int i = 1; i<=explode_right.size(); i++){
			b.deleteBlock(x+50*i, y);
			b.explodeBomb(x+50*i, y);
			b.killPlayer(x+50*i, y);
		}
		for(int i = 1; i<=explode_down.size(); i++){
			b.deleteBlock(x, y+50*i);
			b.explodeBomb(x, y+50*i);
			b.killPlayer(x, y+50*i);
		}
		for(int i = 1; i<=explode_left.size(); i++){
			b.deleteBlock(x-50*i, y);
			b.explodeBomb(x-50*i, y);
			b.killPlayer(x-50*i, y);
		}
		b.killPlayer(x, y);

		
		try {
			this.sleep(45);
			for (int i = 0; i < 7; i++) {
				this.change_explode_image();
				this.sleep(45);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		explosed = true;
		explode_up = null;
		explode_right = null;
		explode_down = null;
		explode_left = null;
		
	}

	public void change_explode_image() {
		if (number == 1) {
			bomb_explode_centr = bomb_explode_centr1;
			explode_up = curr_explode_up1;
			explode_right = curr_explode_right1;
			explode_down = curr_explode_down1;
			explode_left = curr_explode_left1;
			number++;
			return;
		}
		if (number == 2) {
			bomb_explode_centr = bomb_explode_centr2;
			explode_up = curr_explode_up2;
			explode_right = curr_explode_right2;
			explode_down = curr_explode_down2;
			explode_left = curr_explode_left2;
			number++;
			return;
		}
		if (number == 3) {
			bomb_explode_centr = bomb_explode_centr3;
			explode_up = curr_explode_up3;
			explode_right = curr_explode_right3;
			explode_down = curr_explode_down3;
			explode_left = curr_explode_left3;
			number++;
			return;
		}
		if (number == 4) {
			bomb_explode_centr = bomb_explode_centr4;
			explode_up = curr_explode_up4;
			explode_right = curr_explode_right4;
			explode_down = curr_explode_down4;
			explode_left = curr_explode_left4;
			number++;
			return;
		}
		if (number == 5) {
			bomb_explode_centr = bomb_explode_centr5;
			explode_up = curr_explode_up5;
			explode_right = curr_explode_right5;
			explode_down = curr_explode_down5;
			explode_left = curr_explode_left5;
			number++;
			return;
		}
		if (number == 6) {
			bomb_explode_centr = bomb_explode_centr6;
			explode_up = curr_explode_up6;
			explode_right = curr_explode_right6;
			explode_down = curr_explode_down6;
			explode_left = curr_explode_left6;
			number++;
			return;
		}
		if (number == 7) {
			bomb_explode_centr = bomb_explode_centr7;
			explode_up = curr_explode_up7;
			explode_right = curr_explode_right7;
			explode_down = curr_explode_down7;
			explode_left = curr_explode_left7;
			number++;
			return;
		}
		if (number == 8) {
			bomb_explode_centr = bomb_explode_centr8;
			explode_up = curr_explode_up8;
			explode_right = curr_explode_right8;
			explode_down = curr_explode_down8;
			explode_left = curr_explode_left8;
			number++;
			return;
		}
	}
	
	@Override
    public void run(){
		try {
			img = img1;
			for(timer = 0; timer <= 1500; timer++){
				if(timer == 300)
					img = img2;
				if(timer == 600)
					img = img3;
				if(timer == 900)
					img = img4;
				if(timer == 1200)
					img = img5;
				if(timer == 1500 && explosed == false)
					this.explode();
				this.sleep(1);
			}
					
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Rectangle getRect(){
		return r;
	}	
	public int getX(){
		return this.x;
	}	
	public int getY(){
		return this.y;
	}
	public int getRange(){
		return this.range;
	}
	public boolean explosed(){
		return explosed;
	}
	public void setUnex_explosed(boolean b){
		timer = 1499;
	}
	public void setRect(){
		r = new Rectangle(x-5,y-5,10,10);
	}
}
