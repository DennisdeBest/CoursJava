import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TestPixel extends JFrame {
	
	public TestPixel(){
		setSize(300,150);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel nom = new JLabel("Nom : ");
		Dimension dimJLNom = nom.getPreferredSize();
		nom.setBounds(10, 10, dimJLNom.width, dimJLNom.height);
		panel.add(nom);
		
		JTextField Tnom = new JTextField(10);
		Dimension dimJLTNom = Tnom.getPreferredSize();
		Tnom.setBounds( 100, 10, dimJLTNom.width, dimJLTNom.height);
		panel.add(Tnom);
		
		JLabel prenom = new JLabel("Prenom : ");
		Dimension dimJLpreNom = prenom.getPreferredSize();
		prenom.setBounds(10, 50, dimJLpreNom.width, dimJLpreNom.height);
		panel.add(prenom);
		
		JTextField Tprenom = new JTextField(10);
		Dimension dimJLTpreNom = Tprenom.getPreferredSize();
		Tprenom.setBounds( 100, 50, dimJLTpreNom.width, dimJLTpreNom.height);
		panel.add(Tprenom);
		
		
		this.add(panel);
	}
	
	
	
	

	public static void main(String[] args) {
	
		TestPixel tp = new TestPixel();
		tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tp.setVisible(true);
	}

}
