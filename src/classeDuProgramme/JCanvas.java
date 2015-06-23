package classeDuProgramme;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JCanvas extends JPanel {
	
    private Graphics2D g2d;
    private int width=1000;
    private int height=700;
    private BufferedImage bimg=new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
    private ImageIcon tortueImg=new ImageIcon("TortueConceptuellePetit.png");
    private Tortue tortue = new Tortue(500,350);
    
    public JCanvas(){
    	g2d = bimg.createGraphics();
    	clear();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(new ImageIcon("Background.jpg").getImage(),0 , 0, null);
        g.drawImage(bimg, 0, 0, this);
        g.drawImage(tortueImg.getImage(),(tortue.getX()-tortueImg.getIconWidth()/2),tortue.getY()-tortueImg.getIconHeight()/2, null);
    }

	public void clear() {
		g2d.setColor(new Color(0, 0, 0, 0));
		g2d.fillRect(0, 0, width, height);
		repaint();
		
		g2d.setColor(Color.BLACK);
    }

    public void drawLine(int x, int y){
    	g2d.drawLine(tortue.getX(), tortue.getY(), x, y);
    	tortue.moveTortue( x, y);
    	repaint();
    }
    
    public void changeColor(String string){
    	switch(string){
    	case "red":
    		g2d.setColor(Color.RED);
    		break;
    	case "green":
    		g2d.setColor(Color.GREEN);
    		break;
    	case "blue":
    		g2d.setColor(Color.BLUE);
    		break;
    	case "pink":
    		g2d.setColor(Color.PINK);
    		break;
        default:
        	break;
        }
    }
}