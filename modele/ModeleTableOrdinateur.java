package modele;

import javax.swing.table.AbstractTableModel;
import classe.ListOrdinateur;

public class ModeleTableOrdinateur  extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private Object[] nomColonnes;
	private Object[][] donnees;
	private ListOrdinateur listeOrdi; 

	public ModeleTableOrdinateur(ListOrdinateur listeOrdinateur){
		donnees = listeOrdinateur.recupererDonnees();
		nomColonnes = ListOrdinateur.recupererNomsColonnes();
		this.listeOrdi=listeOrdinateur;
	}
	public int getColumnCount(){
		return nomColonnes.length;
	}
	public int getRowCount(){
		return donnees.length;
	}
	public Object getValueAt(int row , int col){
		return donnees[row][col];
	}
	public String getColumnName(int col){
		return (String) nomColonnes[col];
	}
	public void mettreAjourDonnees(){
		donnees= listeOrdi.recupererDonnees();
	}
	public boolean isCellEditable(int row, int col){
		return false;
	}
	public void setValueAt(String val,int rowIndex, int columnIndex) {	      
		if(val!= null){			
			donnees[rowIndex][columnIndex]=val;        
			fireTableCellUpdated(rowIndex,columnIndex);

		}
	}	

}
