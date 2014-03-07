import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class GymMember extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtAdressSportgatana;
	private JTextField txtTel;
	private JTextField txtMailAlphaaaamailsport;
	private JTextField txtSportstaden;
	private JTextField txtSportstaden_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GymMember frame = new GymMember();
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
	public GymMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(180, 227, 69, 23);
		contentPane.add(btnSpara);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAlphaAndersson = DefaultComponentFactory.getInstance().createLabel("ALPHA ANDERSSON");
		lblAlphaAndersson.setBounds(164, 5, 96, 14);
		panel.add(lblAlphaAndersson);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 68, 133, 170);
		contentPane.add(panel_1);
		
		JLabel lblBildPMedlem = DefaultComponentFactory.getInstance().createLabel("Bild p\u00E5 medlem");
		panel_1.add(lblBildPMedlem);
		
		textField = new JTextField();
		textField.setText("1982-04-09");
		textField.setBounds(211, 68, 133, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtAdressSportgatana = new JTextField();
		txtAdressSportgatana.setText("Sportgatan 9a");
		txtAdressSportgatana.setBounds(211, 99, 133, 20);
		contentPane.add(txtAdressSportgatana);
		txtAdressSportgatana.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setText(" 0700077700");
		txtTel.setBounds(211, 165, 115, 20);
		contentPane.add(txtTel);
		txtTel.setColumns(10);
		
		txtMailAlphaaaamailsport = new JTextField();
		txtMailAlphaaaamailsport.setText("alphaaaa@mail.sport");
		txtMailAlphaaaamailsport.setBounds(211, 196, 115, 20);
		contentPane.add(txtMailAlphaaaamailsport);
		txtMailAlphaaaamailsport.setColumns(10);
		
		txtSportstaden = new JTextField();
		txtSportstaden.setText("999 88");
		txtSportstaden.setBounds(211, 120, 133, 20);
		contentPane.add(txtSportstaden);
		txtSportstaden.setColumns(10);
		
		txtSportstaden_1 = new JTextField();
		txtSportstaden_1.setText(" Sportstaden");
		txtSportstaden_1.setBounds(211, 140, 133, 20);
		contentPane.add(txtSportstaden_1);
		txtSportstaden_1.setColumns(10);
		
		JButton btnAvsluta = new JButton("Avsluta");
		btnAvsluta.setBounds(271, 227, 73, 23);
		contentPane.add(btnAvsluta);
		
		JLabel lblFdd = new JLabel("F\u00F6dd:");
		lblFdd.setBounds(155, 68, 46, 14);
		contentPane.add(lblFdd);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(155, 102, 46, 14);
		contentPane.add(lblAdress);
		
		JLabel lblNummer = new JLabel("Nummer:");
		lblNummer.setBounds(155, 168, 46, 14);
		contentPane.add(lblNummer);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(155, 196, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblBackgrund = DefaultComponentFactory.getInstance().createTitle("Backgrund");
		lblBackgrund.setIcon(new ImageIcon(GymMember.class.getResource("/bildRegister/Orienteering_symbol_framed.png")));
		lblBackgrund.setBounds(0, 0, 434, 261);
		contentPane.add(lblBackgrund);
	}
}
