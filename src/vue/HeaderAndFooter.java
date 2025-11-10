package vue;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;

public class HeaderAndFooter extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                HeaderAndFooter frame = new HeaderAndFooter();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public HeaderAndFooter() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 500);
        setLocationRelativeTo(null);
        setTitle("Application Gestion");

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(214, 214, 214));
        setJMenuBar(menuBar);

        JMenu mnProfil = new JMenu("Profil");
        menuBar.add(mnProfil);
        JMenuItem mntmDeconnecter = new JMenuItem("Déconnecter");
        mnProfil.add(mntmDeconnecter);

        JMenu mnBatiment = new JMenu("Bâtiment");
        menuBar.add(mnBatiment);
        mnBatiment.add(new JMenuItem("Ajouter bâtiment"));
        mnBatiment.add(new JMenuItem("Supprimer bâtiment"));
        mnBatiment.add(new JMenuItem("Assurance"));
        mnBatiment.add(new JMenuItem("Compteurs"));
        mnBatiment.add(new JMenuItem("Charges"));

        JMenu mnBienLouable = new JMenu("Bien louable");
        menuBar.add(mnBienLouable);
        mnBienLouable.add(new JMenuItem("Contrat location"));
        mnBienLouable.add(new JMenuItem("Compteurs"));
        mnBienLouable.add(new JMenuItem("Travaux"));
        mnBienLouable.add(new JMenuItem("Charges"));
        mnBienLouable.add(new JMenuItem("Diagnostics"));
        mnBienLouable.add(new JMenuItem("Locataires"));

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());

        contentPane.add(mainPanel, BorderLayout.CENTER);

        JPanel footerPanel = new JPanel();
        footerPanel.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.LIGHT_GRAY));
        footerPanel.setBackground(new Color(214, 214, 214));
        footerPanel.setPreferredSize(new Dimension(584, 30));

        JLabel footerLabel = new JLabel("Développé par Koshua, Jay, Aneesa, Luca et Franck");
        footerPanel.add(footerLabel);

        contentPane.add(footerPanel, BorderLayout.SOUTH);
    }
}
