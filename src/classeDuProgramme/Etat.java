package classeDuProgramme;

public class Etat 
{
	//variable de la tortue
		private double x;
		private double y;
		private double angle;
		private int crayonbaisse;
		private int taillecrayon;
		private String couleur;
		public static final double tailleFeuille = 460.0 ;
		public static final double milieuF = (tailleFeuille/2) ;
		
		
		public Etat (double x , double y , double angle , int cbaisse , int tcrayon , String couleur)
		{
			this.x = x;
			this.y = y;
			this.angle = angle;
			this.crayonbaisse = cbaisse; // 1 si le crayon est baisse (la tortue écrit) ; 0 sinon
			this.taillecrayon = tcrayon;
			this.couleur = couleur;
		}
		
		public Etat ()
		{
			this(milieuF , milieuF , -90.0 , 1 , 1 , "Noir") ;
		}
		
		
		public Etat clone()
		{
			return new Etat (x, y, angle, crayonbaisse, taillecrayon , couleur) ;
		}
		
		// getters
		public final double getX () 
		{
			return this.x;
		}
		
		public final double getY () 
		{
			return this.y;
		}
		
		public final double getAngle () 
		{
			return this.angle;
		}
		
		public final String getCouleur () 
		{
			return this.couleur;
		}
		
		public final int getCrayonBaisse () 
		{
			return this.crayonbaisse;
		}
		
		public final int getTailleCrayon () 
		{
			return this.taillecrayon;
		}
		
		//setters
		public final void setX (double x) 
		{
			this.x = x;
		}
		
		public final void setY (double y) 
		{
			this.y = y ;
		}
		
		public final void setAngle (double angle) 
		{
			this.angle = angle;
		}
		
		public final void setCrayonBaisse (int cb) 
		{
			this.crayonbaisse = cb;
		}
		
		public final void setTailleCrayon (int tc) 
		{
			this.taillecrayon = tc;
		}
		
		public final void setCouleur (String couleur) 
		{
			this.couleur = couleur;
		}
		
		//pour ajouter directement
		public final void addToX (double x) 
		{
			this.x += x;
		}
		
		public final void addToY (double y) 
		{
			this.y += y ;
		}
		
		public final void addToAngle (double angle) 
		{
			this.angle += angle;
		}
	
		public String toString() {
			return ("couleur =  " + couleur +   "("+x+","+y+"), angle : " + angle + " taillecrayon : " + taillecrayon + " crayonbaisse : " + crayonbaisse ) ;
		}
}
