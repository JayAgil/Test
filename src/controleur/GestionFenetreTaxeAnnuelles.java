package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenetreTaxeAnnuelles;

public class GestionFenetreTaxeAnnuelles implements ActionListener{
	
	private FenetreTaxeAnnuelles fenetreTaxeAnnuelles;
	
	
	
	public GestionFenetreTaxeAnnuelles(FenetreTaxeAnnuelles fenetre) {
        this.fenetreTaxeAnnuelles = fenetre;
    }
	public void actionPerformed(ActionEvent e) {
        switch (((JButton) e.getSource()).getText()) {
        case "Quitter":
            fenetreTaxeAnnuelles.dispose();
            break;
        }
    }
}
