package classe;

public class Ordinateur {

	private String marque;
	private double prix;
	public Ordinateur(String marque,double prix){
		this.marque=marque;
		this.prix=prix;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public static Object[] recupererNomsColonnes(){
		Object [] listeColonnes = {"Marque","Prix"};
		return listeColonnes;
	}
	/**
	 * 
	 * @return les differents elements pour le JTable
	 */
	public Object[] recuperDonnees(){
		String [] util  = new String[2];
		util[0] = ""+getMarque();
		util[1] = ""+getPrix();		
		return util;
	}	
}
