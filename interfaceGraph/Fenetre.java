package interfaceGraph;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import classe.ListOrdinateur;
import classe.Ordinateur;

import modele.ModeleTableOrdinateur;


public class Fenetre  extends JFrame {

	private static final long serialVersionUID = 1L;
	private Container cont;
	private JScrollPane listeDeroulanteOrdi;
	private JTable tableOrdi;
	private ModeleTableOrdinateur modeleTableOrdi;
	private ListOrdinateur listeOrdi;
	public Fenetre(ArrayList<Ordinateur> listOrdi){
		listeOrdi= new ListOrdinateur(listOrdi);
		setTitle("Tuto");
		this.setSize((int)getToolkit().getScreenSize().getWidth(), ((int)getToolkit().getScreenSize().getHeight() - 40));
		cont = getContentPane();
		cont.setLayout(new BorderLayout()); 
		cont.add(getListeDeroulanteOrdinateur(),BorderLayout.NORTH);
	}
	
	public JScrollPane getListeDeroulanteOrdinateur() {
		if(listeDeroulanteOrdi == null){
			listeDeroulanteOrdi = new JScrollPane(this.getTableJou());
			listeDeroulanteOrdi.setMaximumSize(new Dimension (750,100));
		}
		return listeDeroulanteOrdi;
	}
	
	public JTable getTableJou() {
		if(tableOrdi == null){
			modeleTableOrdi =new ModeleTableOrdinateur(listeOrdi);
			tableOrdi = new JTable (modeleTableOrdi);
			tableOrdi.setFillsViewportHeight(true);
			
		}
		return tableOrdi;
	}
}
