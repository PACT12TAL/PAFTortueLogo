package classeDuProgramme;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class JCanvas extends JPanel {
	
	private Graphics gimg ;
	private int width = 1000;
	private int height = 1000;
	private BufferedImage bimg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
	
	public JCanvas(){
		gimg = bimg.createGraphics();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bimg, 0, 0, this);
	}
		
		public void clear(){
			gimg.clearRect(0, 0, width, height);
			repaint();
		}
		
		public void drawLine(int x1, int y1, int x2, int y2){
			gimg.drawLine(x1, y1, x2, y2);
			repaint();
		}
	}