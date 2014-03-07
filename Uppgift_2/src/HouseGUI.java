import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;


public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private int year;
	private int size;
	private static int nbrOfHouses;
	public static final int MIN_SIZE = 10; 	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(40, 40, 364, 200);
		contentPane.add(textArea);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		lblNewJgoodiesLabel.setIcon(new ImageIcon(HouseGUI.class.getResource("/Bilder/houses-street.jpg")));
		lblNewJgoodiesLabel.setBounds(-37, 0, 491, 292);
		contentPane.add(lblNewJgoodiesLabel);
		House hus1 = new House (1991, 100);
		House hus2 = new House (1995, 51);
		House hus3 = new House (2000, 82);
		House [] ar = new House [10] ;
		ar [0] = hus1;
		ar [1] = hus2;
		ar [2] = hus3;		
		for (int a = 0; a < ar.length ; a++) {
			if (ar[a] != null) {
			textArea.append("Storleken på detta hus är "+ar[a].getSize()+" och är byggt detta år "+ar[a].getYear()+"\n");
			}
		}
		textArea.append("Det finns " + House.getNbrHouses()+" hus");
	}
}