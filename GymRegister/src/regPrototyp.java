import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JDesktopPane;
import javax.swing.border.BevelBorder;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;


public class regPrototyp extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtSkNamn;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regPrototyp frame = new regPrototyp();
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
	public regPrototyp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 603);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSkNamn = new JTextField();
		txtSkNamn.setBounds(343, 205, 143, 20);
		txtSkNamn.setText("S\u00F6k namn...");
		contentPane.add(txtSkNamn);
		txtSkNamn.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 236, 501, 233);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setToolTipText("");
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{"Alpha Andersson", "Nummer"},
				{"Beta Bengtsson", "Nummer"},
				{"Charlie Carlsson", null},
				{"Delta Danielsson", null},
				{"Echo Ericsson", null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"", "New column"
			}
		));
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		scrollPane.setColumnHeaderView(mntmNewMenuItem);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(343, 205, 167, 20);
		comboBox.setToolTipText("S\u00F6k namn");
		contentPane.add(comboBox);
		
		JLabel lblTextMedlemsregister = DefaultComponentFactory.getInstance().createLabel("Text/header: MEDLEMSREGISTER");
		lblTextMedlemsregister.setBounds(132, 186, 167, 14);
		contentPane.add(lblTextMedlemsregister);
		
		JLabel lblHeader = DefaultComponentFactory.getInstance().createLabel("");
		lblHeader.setBackground(new Color(255, 204, 102));
		lblHeader.setBounds(10, 47, 515, 113);
		contentPane.add(lblHeader);
		lblHeader.setIcon(new ImageIcon(regPrototyp.class.getResource("/bildRegister/Orienteering_symbol_framed.png")));
		lblHeader.setLabelFor(this);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Arkiv");
		menuBar.setBounds(10, 11, 279, 21);
		contentPane.add(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmArkiv = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmArkiv);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmSkMedlem = new JMenuItem("S\u00F6k medlem");
		mnMedlem.add(mntmSkMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
