package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controleur.GestionFenetrePrincipale;

public class FenetrePrincipale extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public JTable getTableBienLouable() {
        return getTableBienLouable();
    }

    private GestionFenetrePrincipale gestionClic;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FenetrePrincipale frame = new FenetrePrincipale();
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
    public FenetrePrincipale() {
        this.gestionClic = new GestionFenetrePrincipale(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750, 496);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panelSouth = new JPanel();
        contentPane.add(panelSouth, BorderLayout.SOUTH);
        panelSouth.setLayout(new BorderLayout(0, 0));

        JPanel panelSouthWest = new JPanel();
        panelSouth.add(panelSouthWest, BorderLayout.WEST);

        JButton btnQuitter = new JButton("Quitter");
        panelSouthWest.add(btnQuitter);
        btnQuitter.addActionListener(this);

        JPanel panelSouthEast = new JPanel();
        panelSouth.add(panelSouthEast, BorderLayout.EAST);

        JButton btnCharges = new JButton("Charges");
        panelSouthEast.add(btnCharges);

        JButton btnCompteurs = new JButton("Compteurs");
        panelSouthEast.add(btnCompteurs);

        JButton btnAssurance = new JButton("Assurance");
        panelSouthEast.add(btnAssurance);
        btnAssurance.addActionListener(this);
        btnCompteurs.addActionListener(this);
        btnCharges.addActionListener(this);

        JPanel panelCenter = new JPanel();
        contentPane.add(panelCenter);
        panelCenter.setLayout(new BorderLayout(0, 0));

        JPanel panelCenterCenter = new JPanel();
        panelCenter.add(panelCenterCenter);
        panelCenterCenter.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane = new JScrollPane();
        panelCenterCenter.add(scrollPane);

        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] { { null, null, null, null },
                { null, null, null, null }, { null, null, null, null },
                { null, null, null, null }, { null, null, null, null },
                { null, null, null, null }, { null, null, null, null },
                { null, null, null, null }, { null, null, null, null },
                { null, null, null, null }, },
            new String[] { "Contrat Location", "Date", "Bien Louable",
                "Locataire R\u00E9f\u00E9rent" }) {
            Class[] columnTypes = new Class[] { String.class, String.class,
                String.class, String.class };

            @Override
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        scrollPane.setViewportView(table);

        JPanel panelCenterNorth = new JPanel();
        panelCenter.add(panelCenterNorth, BorderLayout.NORTH);
        panelCenterNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JComboBox<String> cbBatiment = new JComboBox<String>();
        cbBatiment.addActionListener(this);
        cbBatiment.setModel(
            new DefaultComboBoxModel(new String[] { "Bat1", "Bat2", "Bat3" }));
        panelCenterNorth.add(cbBatiment);

        JButton btnAjouterBatiment = new JButton("Ajouter");
        btnAjouterBatiment.addActionListener(this);
        btnAjouterBatiment.setFont(new Font("Tahoma", Font.PLAIN, 10));
        panelCenterNorth.add(btnAjouterBatiment);

        JButton btnSupprimerBatiment = new JButton("Supprimer");
        btnSupprimerBatiment.addActionListener(this);
        panelCenterNorth.add(btnSupprimerBatiment);

        JPanel panelWest = new JPanel();
        contentPane.add(panelWest, BorderLayout.WEST);

        JPanel panelEast = new JPanel();
        contentPane.add(panelEast, BorderLayout.EAST);

        JPanel panelNorth = new JPanel();
        contentPane.add(panelNorth, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        gestionClic.actionPerformed(arg0);
    }
}
