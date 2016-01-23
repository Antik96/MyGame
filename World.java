import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ListIterator;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class World extends JPanel implements ActionListener {
	Image img = new ImageIcon("res/bg.png").getImage();
	Image img_b = new ImageIcon("res/block/блок.png").getImage();
	static Player p1 = new Player1();
	static Player p2 = new Player2();
	Barriers b = Barriers.getBarriers();
	private static World w;
	Timer mainTimer = new Timer(10, this);

	private World() {
		mainTimer.start();
		addKeyListener(new MyKeyAdapter());
		setFocusable(true);
		b.setPlayerBarriers(p1, p2);
	}
	
	
	
	private class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (p1 != null)
				p1.keyPressed(e);
			if (p2 != null)
				p2.keyPressed(e);
		}

		public void keyReleased(KeyEvent e) {
			if (p1 != null)
				p1.keyReleased(e);
			if (p2 != null)
				p2.keyReleased(e);
		}
	}
		
	//==========метод рисующий все елементы========
	public void paint(Graphics g){
		g = (Graphics2D) g;
		
		g.drawImage(img,0,0,null); //рисует фон
		
		
		
		for (ListIterator iterator = b.bomb_list.listIterator(); iterator.hasNext(); ) {
			Bomb bomb = (Bomb) iterator.next();
			if (bomb.explosed()) {
				iterator.remove();
			}else{
				
				g.drawImage(bomb.img, bomb.getX()-25, bomb.getY()-25, null);
				int n = bomb.getRange();
				if(bomb.explode_up!=null 
&& bomb.explode_down!=null 
&& bomb.explode_left!=null 
&& bomb.explode_right!=null){
					g.drawImage(bomb.bomb_explode_centr, bomb.getX()-25, bomb.getY()-25, null);
					for(int i=0; i<bomb.explode_up.size(); i++){
						g.drawImage(bomb.explode_up.get(i), bomb.getX()-25, bomb.getY()-25-50*(i+1), null);
					}
					for(int i=0; i<bomb.explode_right.size(); i++){
						g.drawImage(bomb.explode_right.get(i), bomb.getX()-25+50*(i+1), bomb.getY()-25, null);
					}
					for(int i=0; i<bomb.explode_down.size(); i++){
						g.drawImage(bomb.explode_down.get(i), bomb.getX()-25, bomb.getY()-25+50*(i+1), null);
					}
					for(int i=0; i<bomb.explode_left.size(); i++){
						g.drawImage(bomb.explode_left.get(i), bomb.getX()-25-50*(i+1), bomb.getY()-25, null);
					}
				}
			}	
		}
		
		for(Block block : b.block_list){ //рисует деревянные коробки
			g.drawImage(block.img, block.getX(), block.getY()-12, null);
		}
		
		for(int i = 0; i < 5; i++){ //рисует нерушимые блоки
			for(int j = 0; j < 8; j++){
				g.drawImage(img_b,100+100*j,88+100*i,null);
			}
		}
		
		if(!p1.getIsDead()){
			g.drawImage(p1.getImg(),p1.getX()-14,p1.getY()-50,null); //рисует игрока 1
		}
		if(!p2.getIsDead()){
			g.drawImage(p2.getImg(),p2.getX()-14,p2.getY()-50,null); //рисует игрока 2
		}
	}

	public void actionPerformed(ActionEvent e){
		b.enableBomb(p1, p2);
		if(p1 != null | !p1.getIsDead()){
			p1.move();
		}else{
			p1 = null;
		}
		if(p1 != null | !p2.getIsDead()){
			p2.move();
		}else{
			p2 = null;
		}
		
		repaint();
	}
	
	public static World getWorld()
    {
        if (w == null){
            w = new World();
        }
        return w;
    }
}
