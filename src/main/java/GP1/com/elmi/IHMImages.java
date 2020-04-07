package GP1.com.elmi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IHMImages extends JFrame {
	
	public static void main(String[] args) {

	JFrame f = new JFrame("A window");
	 JButton bouton1 = new JButton("Enregistre");
	 
	 f.add(bouton1);

	f.setTitle("BIENVENU");
	f.setSize(550, 550);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLocationRelativeTo(null);
	f.getContentPane().setLayout(new FlowLayout());
	f.setResizable(false);
	f.setVisible(true);
		
	
	}
	
}
