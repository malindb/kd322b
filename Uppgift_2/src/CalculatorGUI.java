import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Calculator_1 myCalculator;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		myCalculator = new Calculator_1();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 5, 274, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton Button1 = new JButton("1");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				myCalculator.numberButtonPressed(1);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		Button1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Button1.setBounds(10, 56, 46, 40);
		contentPane.add(Button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalculator.numberButtonPressed(2);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button2.setBounds(67, 56, 46, 40);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(3);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button3.setBounds(127, 56, 46, 40);
		contentPane.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button4.setBounds(10, 105, 46, 40);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button5.setBounds(67, 105, 46, 40);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button6.setBounds(127, 105, 46, 40);
		contentPane.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(7);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button7.setBounds(10, 156, 46, 40);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button8.setBounds(67, 156, 46, 40);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button9.setBounds(126, 156, 46, 40);
		contentPane.add(button9);
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
			}
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnP.setBounds(10, 219, 46, 40);
		contentPane.add(btnP);
		
		JButton btnM = new JButton("-");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnM.setBounds(67, 219, 46, 40);
		contentPane.add(btnM);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX.setBounds(126, 219, 46, 40);
		contentPane.add(btnX);
		
		JButton btnE = new JButton("=");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
					int i = myCalculator. getResult ();
					textField.setText(String.valueOf(i));
			}
		});
		btnE.setBounds(200, 56, 63, 141);
		contentPane.add(btnE);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(200, 219, 46, 40);
		contentPane.add(btnC);
	}
}
