package graphique;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.math.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import classeDuProgramme.Etat;

public class JCanvas extends JPanel {
    private Graphics2D g2d, gtortue;
    private ImageIcon tortueImg=new ImageIcon("TortueConceptuellePetit.png");
    private ImageIcon img = new ImageIcon("Background.jpg");
    private int width=460;
    private int height=460;
    private BufferedImage bimg=new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
    private BufferedImage btortue = new BufferedImage(width, height,  BufferedImage.TYPE_INT_ARGB);
    private Tortue tortue = new Tortue(230,230);
    private Etat etatCourant = new Etat();
    
    
    public JCanvas(){
    	g2d = bimg.createGraphics();
    	gtortue = btortue.createGraphics();
    	clear();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
                

        g.drawImage(new ImageIcon("Background.jpg").getImage(),0 , 0, null);
        g.drawImage(bimg, 0, 0, this);
        
		gtortue.setComposite(AlphaComposite.getInstance(AlphaComposite.CLEAR));
        gtortue.fillRect(0, 0, width, height);
		gtortue.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
        gtortue.rotate(-tortue.getAngle(), tortue.getX(), tortue.getY());
        gtortue.drawImage(tortueImg.getImage(),tortue.getX()-tortueImg.getIconWidth()/2, tortue.getY()-tortueImg.getIconWidth()/2, null);
        gtortue.rotate(tortue.getAngle(),tortue.getX(), tortue.getY());
        
        g.drawImage(btortue, 0, 0, this);   
    }

	public void clear() {
		//clear
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.CLEAR));
		g2d.fillRect(0,0,width,height);
		//reset composite
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
		tortue.moveTortue(230,230);
		tortue.setAngle(0);
		repaint();
		g2d.setStroke(new BasicStroke(1));
		setEtatCourant(new Etat());

		g2d.setColor(Color.BLACK);
    }	
	

    public void drawLine(int x, int y){
    	g2d.drawLine(tortue.getX(), tortue.getY(), x, y);
    	tortue.moveTortue( x, y);
    	repaint();
    }
    public void rotateTurtle(double angle){	
        tortue.setAngle(angle);
    }
    
    public void setPenSize(int size)
    {
    	g2d.setStroke(new BasicStroke(size));
    }
    
    public void changeColor(String string){
    	switch(string){
    	case "Noir":
    		g2d.setColor(Color.BLACK);
    		break;
    	case "Rouge":
    		g2d.setColor(Color.RED);
    		break;
    	case "Vert":
    		g2d.setColor(Color.GREEN);
    		break;
    	case "Bleu":
    		g2d.setColor(Color.BLUE);
    		break;
    	case "Rose":
    		g2d.setColor(Color.PINK);
    		break;
    	case "transparent":
    		g2d.setColor(new Color(0,0,0,0));
        default:
        	break;
        }
    }

	public Etat getEtatCourant() {
		return etatCourant;
	}

	public void setEtatCourant(Etat etatCourant) {
		this.etatCourant = etatCourant;
	}
}