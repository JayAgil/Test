package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FentreAjouterBatiment extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FentreAjouterBatiment frame = new FentreAjouterBatiment();
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
    public FentreAjouterBatiment() {
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);

        JLabel lblAdresse = new JLabel("Adresse : ");
        lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
        lblAdresse.setBounds(28, 45, 141, 16);
        getContentPane().add(lblAdresse);

        textField = new JTextField();
        textField.setBounds(168, 44, 96, 19);
        getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblDateConstruction = new JLabel("Date de construction : ");
        lblDateConstruction.setHorizontalAlignment(SwingConstants.RIGHT);
        lblDateConstruction.setBounds(28, 72, 141, 16);
        getContentPane().add(lblDateConstruction);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(168, 71, 96, 19);
        getContentPane().add(textField_1);

        JLabel lblAdresse_2 = new JLabel("Adresse : ");
        lblAdresse_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblAdresse_2.setBounds(28, 99, 141, 16);
        getContentPane().add(lblAdresse_2);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(168, 98, 96, 19);
        getContentPane().add(textField_2);

        JLabel lblAdresse_3 = new JLabel("Adresse : ");
        lblAdresse_3.setHorizontalAlignment(SwingConstants.RIGHT);
        lblAdresse_3.setBounds(28, 126, 141, 16);
        getContentPane().add(lblAdresse_3);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(168, 125, 96, 19);
        getContentPane().add(textField_3);

    }
}
