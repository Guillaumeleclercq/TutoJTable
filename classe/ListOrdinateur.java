package classe;

import java.util.ArrayList;

public class ListOrdinateur {
	private ArrayList<Ordinateur> listOrdi;
	public ListOrdinateur(){
		listOrdi = new ArrayList<Ordinateur>();		
	}
	public ListOrdinateur (ArrayList<Ordinateur>liste){
		listOrdi = new ArrayList<Ordinateur>();
		listOrdi.addAll(liste);		
	}
	public void ajouterJoueur(Ordinateur ordi){
		listOrdi.add(ordi);
	}
	public void suppLigne(int nbr){
		listOrdi.remove(nbr);
	}
	/**
	 * 
	 * @return les différents élements pour le JTable
	 */
	public Object [][] recupererDonnees(){
		Object[][] contenuListe = new String [listOrdi.size()][2];
		for(int i=0; i<listOrdi.size();i++){
			contenuListe[i] = listOrdi.get(i).recuperDonnees();
		}
		return contenuListe;
	}
	/**
	 * 
	 * @return le nom des colonnes
	 */
	public static Object [] recupererNomsColonnes(){
		return Ordinateur.recupererNomsColonnes();
	}
	public void vider(){
		listOrdi.clear();
	}


	public void ajoutList(ArrayList <Ordinateur> liste){
		listOrdi.addAll(liste);
	}
	public  void affList(){
		for(int i=0; i<listOrdi.size();i++){
			System.out.println(listOrdi.get(i).getMarque()+" "+listOrdi.get(i).getPrix());
		}
	}
	public  ArrayList <Ordinateur> getArrayListOrdinateur(){
		return listOrdi;
	}


}
