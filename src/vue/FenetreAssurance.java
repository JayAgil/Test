package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controleur.GestionFenetreAssurance;

public class FenetreAssurance extends JInternalFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private GestionFenetreAssurance gestionClic;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FenetreAssurance frame = new FenetreAssurance();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public FenetreAssurance() {
        this.gestionClic = new GestionFenetreAssurance(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 308, 347);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout(0, 0));

        JPanel panelNorth = new JPanel();
        panel.add(panelNorth, BorderLayout.NORTH);

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
        comboBox.addActionListener(this);
        panelNorth.add(comboBox);
        comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
            "Assurance1", "Assurance2", "Assurance3", "THE_ASSURANCE" }));

        JPanel panelCenter = new JPanel();
        panel.add(panelCenter);
        panelCenter.setLayout(new GridLayout(4, 1, 0, 0));

        JPanel panelL1 = new JPanel();
        panelCenter.add(panelL1);

        JLabel labelNumAssurance_1 = new JLabel("Numéro de l'assurance :");
        panelL1.add(labelNumAssurance_1);
        labelNumAssurance_1.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel NumAssurance_1 = new JLabel("New label");
        panelL1.add(NumAssurance_1);

        JPanel panelL2 = new JPanel();
        panelCenter.add(panelL2);

        JLabel labelType_1 = new JLabel("Type de l'assurance :");
        panelL2.add(labelType_1);
        labelType_1.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel TypeAssurance_1 = new JLabel("New label");
        panelL2.add(TypeAssurance_1);

        JPanel panelL3 = new JPanel();
        panelCenter.add(panelL3);

        JLabel labelMontant_1 = new JLabel("Montant : ");
        panelL3.add(labelMontant_1);
        labelMontant_1.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel Montant_1 = new JLabel("New label");
        panelL3.add(Montant_1);

        JPanel panelL4 = new JPanel();
        panelCenter.add(panelL4);

        JLabel labelBat_1 = new JLabel("Batiments assurés :");
        panelL4.add(labelBat_1);
        labelBat_1.setHorizontalAlignment(SwingConstants.RIGHT);

        JLabel BatAssure_1 = new JLabel("New label");
        panelL4.add(BatAssure_1);

        JPanel panelSouth = new JPanel();
        panel.add(panelSouth, BorderLayout.SOUTH);

        JButton btnRetour = new JButton("Retour");
        btnRetour.addActionListener(this);
        panelSouth.add(btnRetour);

        JPanel panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.NORTH);
        panel_1.setLayout(new GridLayout(0, 1, 0, 0));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(214, 214, 214));
        panel_1.add(menuBar);

        JMenu mnProfil = new JMenu("Profil");
        menuBar.add(mnProfil);

        JMenuItem mntmDeconnecter = new JMenuItem("Déconnecter");
        mnProfil.add(mntmDeconnecter);

        JMenu mnBatiment = new JMenu("Batiment");
        menuBar.add(mnBatiment);

        JMenuItem mntmAjouterBat = new JMenuItem("Ajouter bâtiment");
        mnBatiment.add(mntmAjouterBat);

        JMenuItem mntmSupprimerBat = new JMenuItem("Supprimer bâtiment");
        mnBatiment.add(mntmSupprimerBat);

        JMenuItem mntmAssurance = new JMenuItem("Assurance");
        mnBatiment.add(mntmAssurance);

        JMenuItem mntmCompteur = new JMenuItem("Compteurs");
        mnBatiment.add(mntmCompteur);

        JMenuItem mntmCharge = new JMenuItem("Charges");
        mnBatiment.add(mntmCharge);

        JMenu mnBienLouable = new JMenu("Bien louable");
        menuBar.add(mnBienLouable);

        JMenuItem mntmContratLocation = new JMenuItem("Contrat location");
        mnBienLouable.add(mntmContratLocation);

        JMenuItem mntmCompteurBL = new JMenuItem("Compteurs");
        mnBienLouable.add(mntmCompteurBL);

        JMenuItem mntmTravaux = new JMenuItem("Travaux");
        mnBienLouable.add(mntmTravaux);

        JMenuItem mntmChargesBL = new JMenuItem("Charges");
        mnBienLouable.add(mntmChargesBL);

        JMenuItem mntmDiagnostic = new JMenuItem("Diagnostics");
        mnBienLouable.add(mntmDiagnostic);

        JMenuItem mntmLocataire = new JMenuItem("Locataires");
        mnBienLouable.add(mntmLocataire);

        JPanel panel_2 = new JPanel();
        contentPane.add(panel_2, BorderLayout.SOUTH);

        JPanel footerPanel = new JPanel();
        footerPanel.setPreferredSize(new Dimension(584, 30));
        footerPanel.setBorder(
            BorderFactory.createMatteBorder(1, 0, 0, 0, Color.LIGHT_GRAY));
        footerPanel.setBackground(new Color(214, 214, 214));
        panel_2.add(footerPanel);

        JLabel footerLabel = new JLabel(
            "Developpé par Koshua, Jay, Aneesa, Luca et Franck");
        footerPanel.add(footerLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.gestionClic.actionPerformed(e);
    }
}
