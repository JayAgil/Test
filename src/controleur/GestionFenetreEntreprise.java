package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenetreEntreprise;

public class GestionFenetreEntreprise implements ActionListener {

    private FenetreEntreprise fenetre;

    public GestionFenetreEntreprise(FenetreEntreprise fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (((JButton) e.getSource()).getText()) {
        case "Ajouter":

            break;
        case "Annuler":
            fenetre.dispose();
            break;
        }
    }

}
