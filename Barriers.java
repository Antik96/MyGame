

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;


public class Barriers {
	Rectangle r_up = new Rectangle(0,0,950,51);
	Rectangle r_right = new Rectangle(899,50,51,550);
	Rectangle r_down = new Rectangle(0,599,950,51);
	Rectangle r_left = new Rectangle(0,50,51,550);
	Rectangle[][] r_mas = new Rectangle[5][8];
	public static ArrayList<Block> block_list;
	public static ArrayList<Bomb> bomb_list = new ArrayList<Bomb>();
	Random random = new Random();
	private static Barriers b;
	Player p1;
	Player p2;
	
	private Barriers(){
		block_list = new ArrayList<Block>();
		for(int i = 1; i < 12; i++){
			for(int j = 1; j < 18; j++){
				if((i==1 && j==1) || (i==1 && j==2) || (i==2 && j==1) ||
					(i==1 && j==16) || (i==1 && j==17) || (i==2 && j==17) ||
					(i==10 && j==1) || (i==11 && j==1) || (i==11 && j==2) ||
					(i==10 && j==17) || (i==11 && j==16) || (i==11 && j==17) ||
					(i%2==0 && j%2==0)){
					
				}else{
					if(random.nextBoolean()==true)
						block_list.add(new Block(50*j,50*i));
				}
			}
		}
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 8; j++){
				r_mas[i][j] = new Rectangle(100+100*j,100+100*i,50,50);
			}
		}
	}
	
	public static Barriers getBarriers(){
        if (b == null){
            b = new Barriers();
        }
        return b;
    }
	
	//============метод удаляющий блок===================================
	public boolean deleteBlock(int x, int y){
		for(int i = 0; i < block_list.size(); i++){
			if(new Rectangle(x,y,1,1).intersects(block_list.get(i).getRect())){
				block_list.remove(i);
				return true;
			}
		}
		return false;
	}

	//========метод взрывающий бомбу другой бомбой=======================
	public boolean explodeBomb(int x, int y){
		for(int i = 0; i < bomb_list.size(); i++){
			if(new Rectangle(x,y,1,1).intersects(bomb_list.get(i).getRect())){
				bomb_list.get(i).setUnex_explosed(true);
				return true;
			}
		}
		return false;
	}
	
	//======метод проверки столкновения с нерушимыми блоками=============
	public boolean check_free_const(Rectangle r){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 8; j++){
				if(r.intersects(r_mas[i][j])){
					return false;
				}
			}
		}
		return true;
	}
		
	//======метод проверки столкновения с деревянными коробками==========
	public boolean check_free_block(Rectangle r){
		for(int i = 0; i < block_list.size(); i++){
			if(r.intersects(block_list.get(i).getRect())){
				return false;
			}
		}
		return true;
	}
			
	//=============метод проверки столкновения с бомбами===================
	public boolean check_free_bomb(Rectangle r){
		for(int i = 0; i < bomb_list.size(); i++){
			if(r.intersects(bomb_list.get(i).getRect())){
				return false;
			}
		}
		return true;
	}
	
	//==================метод проверки столкновений вцелом=================
	public boolean check_free(Rectangle r){
		if(check_free_const(r)==true && check_free_block(r)==true && check_free_bomb(r)){
			return true;
		}
		return false;
	}

	//=======================метод ставящий бомбу==========================
	public void plantBomb(int x, int y){
		for(int i = 0; i < bomb_list.size(); i++){
			if(new Rectangle(x,y,5,5).intersects(new Rectangle(bomb_list.get(i).getX()-25,bomb_list.get(i).getY()-25,50,50))){
				return;
			}
		}
		Bomb curr = new Bomb(x,y);
		bomb_list.add(curr);
		curr.start();
		
	}
	
	//===============мтод делающий бомбу припятствием для игрока===========
	public void enableBomb(Player p1, Player p2){
		for (ListIterator iterator = bomb_list.listIterator(); iterator.hasNext(); ) {
			Bomb bomb = (Bomb) iterator.next();
			if(!p1.getRect().intersects(new Rectangle(bomb.getX()-25,bomb.getY()-25,50,50))){
				if(!p2.getRect().intersects(new Rectangle(bomb.getX()-25,bomb.getY()-25,50,50))){
					bomb.setRect();
				}
			}
		}
	}

	//==============метод делающий игроков препядствиями для бомб==========
	public void setPlayerBarriers(Player pl1, Player pl2){
		p1=pl1;
		p2=pl2;
	}

	public void killPlayer(int x, int y){
		if(new Rectangle(x-10,y-10,20,20).intersects(p1.getRect())){
			p1.setIsHited();
		}
		if(new Rectangle(x-10,y-10,20,20).intersects(p2.getRect())){
			p2.setIsHited();
		}
	}
}
