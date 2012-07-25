package main;
import java.util.ArrayList;

import classe.Ordinateur;

import interfaceGraph.Fenetre;



public class mainProjet {

	public static void main (String args[])
	  { 
		ArrayList<Ordinateur> ordi = new ArrayList<Ordinateur>();
		ordi.add(new Ordinateur("marque1",599.9));
		ordi.add(new Ordinateur("marque2",989));
		
	    Fenetre fen = new Fenetre(ordi) ;
	    fen.setVisible(true) ;

	  }
}
