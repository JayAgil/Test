package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenetreAssurance;
import vue.FenetrePrincipale;

public class GestionFenetrePrincipale implements ActionListener {

    private FenetrePrincipale fenetre;

    public GestionFenetrePrincipale(FenetrePrincipale fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (((JButton) e.getSource()).getText()) {
        case "Quitter":
            fenetre.dispose();
            break;
        case "Assurance":
            FenetreAssurance assurance = new FenetreAssurance();
            fenetre.getLayeredPane().add(assurance);
            assurance.setVisible(true);
            break;
        case "Compteurs":

            break;
        case "Charges":

            break;
        case "+":

            break;
        }
    }

}
