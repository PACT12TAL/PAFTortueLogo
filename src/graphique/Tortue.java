package graphique;

public class Tortue {
	private int x;
	private int y;
	
	public Tortue(int x, int y){
		this.x = x;
		this.y = y;	
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}

	public void moveTortue(int x1, int y1){
		this.x = x1;
		this.y = y1;
	}
}
