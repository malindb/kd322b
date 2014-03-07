import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BikeShop extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSize;
	private JTextField textFieldColour;
	private JTextField textFieldPrice;
	private JTextArea textArea; 

	BikeStore bikeStore = new BikeStore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeShop frame = new BikeShop();
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
	public BikeShop() {

		bikeStore.addBike("Black", 28, 2000);
		bikeStore.addBike("Red", 22, 5000);
		bikeStore.addBike("Blue", 15, 500);
		bikeStore.addBike("Beige", 18, 9000);
		bikeStore.addBike("White", 24, 2000);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 337);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 212, 171);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textArea.setText(bikeStore.getAllBikes());
		

		JLabel lblBikeAvailabilty = new JLabel("Bike availabilty");
		lblBikeAvailabilty.setForeground(Color.LIGHT_GRAY);
		lblBikeAvailabilty.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBikeAvailabilty.setBounds(177, 11, 128, 23);
		contentPane.add(lblBikeAvailabilty);

		JLabel lblSize = new JLabel("Size:");
		lblSize.setForeground(Color.LIGHT_GRAY);
		lblSize.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSize.setBounds(238, 115, 74, 20);
		contentPane.add(lblSize);

		JLabel lblColour = new JLabel("Colour:");
		lblColour.setForeground(Color.LIGHT_GRAY);
		lblColour.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColour.setBounds(238, 78, 74, 20);
		contentPane.add(lblColour);

		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setForeground(Color.LIGHT_GRAY);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrice.setBounds(238, 151, 74, 27);
		contentPane.add(lblPrice);
		
				textFieldColour = new JTextField();
				textFieldColour.setColumns(10);
				textFieldColour.setBounds(300, 80, 171, 20);
				contentPane.add(textFieldColour);

		textFieldSize = new JTextField();
		textFieldSize.setBounds(300, 117, 170, 20);
		contentPane.add(textFieldSize);
		textFieldSize.setColumns(10);

		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(300, 156, 172, 20);
		contentPane.add(textFieldPrice);

		JButton btnAddBike = new JButton("Add bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int size;
				int price;
				try {
					size = Integer.parseInt(textFieldSize.getText());
					price = Integer.parseInt(textFieldPrice.getText());
					bikeStore.addBike(textFieldColour.getText(), size, price);
					textArea.setText(bikeStore.getAllBikes());
				} catch (NumberFormatException e) {
				}
			}

		});
		btnAddBike.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAddBike.setBounds(338, 204, 89, 23);
		contentPane.add(btnAddBike);
		

	}
}
