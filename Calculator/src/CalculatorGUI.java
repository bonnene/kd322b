import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;


public class CalculatorGUI extends JFrame {
	
	private Calculator calculator;

	private JPanel contentPane;
	private JTextField textField;

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
		
		calculator = new Calculator();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 1
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(1);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button.setBounds(9, 123, 83, 36);
		contentPane.add(button);
		
		// 2
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(2);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_1.setBounds(102, 123, 83, 36);
		contentPane.add(button_1);
		
		// 3
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculator.numberButtonPressed(3);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setBounds(196, 123, 83, 36);
		contentPane.add(button_2);
		
		// 4
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(4);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_3.setBounds(9, 170, 83, 36);
		contentPane.add(button_3);
		
		// 5
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(5);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_4.setBounds(102, 170, 83, 36);
		contentPane.add(button_4);
		
		// 6
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(6);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setBounds(196, 170, 83, 36);
		contentPane.add(button_5);
		
		// 7
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(7);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_6.setBounds(10, 217, 83, 36);
		contentPane.add(button_6);
		
		// 8
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(8);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_7.setBounds(102, 217, 83, 36);
		contentPane.add(button_7);
		
		// 9
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(9);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_8.setBounds(196, 217, 83, 36);
		contentPane.add(button_8);
		
		// 0
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(0);
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_9.setBounds(102, 264, 83, 36);
		contentPane.add(button_9);
		
		// Plus
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.plus();
				String i = calculator.getOperator();
				textField.setText(i);
			}
		});
		button_10.setBounds(9, 311, 83, 36);
		contentPane.add(button_10);
		
		// Subtract
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.minus();
				String i = calculator.getOperator();
				textField.setText(i);
			}
		});
		button_11.setBounds(102, 311, 83, 36);
		contentPane.add(button_11);
		
		// Multiply
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.mult();
				String i = calculator.getOperator();
				textField.setText(i);
			}
		});
		button_12.setBounds(196, 311, 83, 36);
		contentPane.add(button_12);
		
		// Clear
		JButton button_13 = new JButton("C");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.clear();
				int i = calculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_13.setBounds(10, 264, 83, 36);
		contentPane.add(button_13);
		
		// Equals
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.equals();
				int i = calculator.getResult();
				textField.setText(String.valueOf(i));
				
			}
		});
		button_14.setBounds(196, 264, 83, 36);
		contentPane.add(button_14);
		
		textField = new JTextField();
		textField.setBounds(6, 11, 273, 72);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
