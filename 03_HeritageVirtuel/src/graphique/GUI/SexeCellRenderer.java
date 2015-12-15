package graphique.GUI;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class SexeCellRenderer extends DefaultTableCellRenderer {
	  private Icon manImage;
	    private Icon womanImage;
	 
	    public SexeCellRenderer() {
	        super();
	 
	        manImage = new ImageIcon("male.png");
	        womanImage = new ImageIcon("woman.png");
	    }
	    @Override
	    public Component getTableCellRendererComponent(JTable tableau, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	        super.getTableCellRendererComponent(tableau, value, isSelected, hasFocus, row, column);
	 
	        Boolean femme = (Boolean)value;
	 
	        this.setText("");
	 
	        if(femme){
	        	this.setText("Male");
	            //this.setIcon(manImage);
	        } else {
	            this.setText("Female");
	        }
	 
	        return this;
	    }
	}
