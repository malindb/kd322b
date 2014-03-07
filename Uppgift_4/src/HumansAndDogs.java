import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumansAndDogs extends JFrame {

	private JTextArea info;
	private JTextArea error;
	private JPanel contentPane;
	private JTextField humanname;
	private JTextField dogname;
	
	Dog dog;
	Human humans; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumansAndDogs frame = new HumansAndDogs();
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
	public HumansAndDogs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 483);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Humans and Dogs");
		label.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
		label.setForeground(Color.BLACK);
		label.setBounds(152, 26, 240, 49);
		contentPane.add(label);
		
		Button btnNewHuman = new Button("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (humanname.getText().length()>=3){
					humans = new Human (humanname.getText());
					error.setText("");	
				}
				
				else{
					error.setText("Invalid name for human");
				}
			}
			}
		);
		
		humanname = new JTextField();
		humanname.setBounds(30, 81, 155, 42);
		contentPane.add(humanname);
		humanname.setColumns(10);
		
		dogname = new JTextField();
		dogname.setColumns(10);
		dogname.setBounds(30, 141, 155, 42);
		contentPane.add(dogname);
		btnNewHuman.setBackground(new Color(51, 153, 255));
		btnNewHuman.setForeground(Color.WHITE);
		btnNewHuman.setBounds(252, 81, 140, 42);
		contentPane.add(btnNewHuman);
		
		Button btnBuyDog = new Button("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (humans!=null){
					dog = new Dog(); 
					dog.setName(dogname.getText());
					humans.buyDog(dog); 
					error.setText(" ");
		      } else {
		    	  error.setText("Dog needs to have a human");
			}
			}
		});
		btnBuyDog.setForeground(Color.WHITE);
		btnBuyDog.setBackground(SystemColor.textHighlight);
		btnBuyDog.setBounds(252, 141, 140, 42);
		contentPane.add(btnBuyDog);
		
		Button btnPrintInfo = new Button("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setText(humans.getInfo());
			}
		});
		btnPrintInfo.setForeground(Color.WHITE);
		btnPrintInfo.setBackground(SystemColor.textHighlight);
		btnPrintInfo.setBounds(252, 203, 140, 42);
		contentPane.add(btnPrintInfo);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(30, 264, 69, 20);
		contentPane.add(lblInfo);
		
		
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setBounds(30, 342, 124, 20);
		contentPane.add(lblErrormessage);
		
		info  = new JTextArea();
		info.setBounds(30, 285, 362, 37);
		contentPane.add(info);
		
		error = new JTextArea();
		error.setBounds(30, 374, 362, 37);
		contentPane.add(error);
		
	
		
	}
}