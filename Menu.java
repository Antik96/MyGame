import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Menu{
	static JFrame f;
	public static void main(String[] args) {
		f = new JFrame("Bomberman");;
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(new Dimension(956,679));
		f.add(World.getWorld());
		f.setVisible(true);
		f.setLocationRelativeTo(null);
	}
}
