import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class diagram extends JFrame {

	private JPanel contentPane;
	private JTextField txtHouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diagram frame = new diagram();
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
	public diagram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHouse = new JTextField();
		txtHouse.setText("House");
		txtHouse.setBounds(87, 11, 246, 20);
		contentPane.add(txtHouse);
		txtHouse.setColumns(10);
		
		JTextPane txtpnYearintSizeintNbrofhousesint = new JTextPane();
		txtpnYearintSizeintNbrofhousesint.setText("- year:int\r\n- size:int\r\n- nbrOfHouses:int\r\n+ MIN_SIZE:int");
		txtpnYearintSizeintNbrofhousesint.setBounds(87, 31, 246, 69);
		contentPane.add(txtpnYearintSizeintNbrofhousesint);
		
		JTextPane txtpnHouseyearintSizeint = new JTextPane();
		txtpnHouseyearintSizeint.setText("+ House (year:int, size:int)\r\n\r\n+getNbrHouses()\r\ngetsize ():int\r\ngetyear():int\r\n\r\n");
		txtpnHouseyearintSizeint.setBounds(87, 100, 246, 100);
		contentPane.add(txtpnHouseyearintSizeint);
	}
}
