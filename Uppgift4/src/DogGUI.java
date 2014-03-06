import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Human human;
	private Dog dog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DogGUI frame = new DogGUI();
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
	public DogGUI() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 47, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 78, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		
		final JTextPane textPane = new JTextPane();
		textPane.setBounds(14, 177, 272, 55);
		contentPane.add(textPane);
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(14, 270, 272, 45);
		contentPane.add(textPane_1);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(15, 150, 46, 14);
		contentPane.add(lblInfo);
		
		JLabel lblErrorMessage = new JLabel("Error message");
		lblErrorMessage.setBounds(14, 254, 89, 14);
		contentPane.add(lblErrorMessage);
		
		JLabel lblDogsAndHumans = new JLabel("Dogs and Humans");
		lblDogsAndHumans.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDogsAndHumans.setBounds(81, 0, 138, 36);
		contentPane.add(lblDogsAndHumans);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()>=3){
			    textPane_1.setText("");
				human = new Human(textField.getText());				
				}else{
					textPane_1.setText("Human names need to be longer than or equal to 3 letters!");
				}
			}
		});
		btnNewHuman.setBounds(193, 46, 89, 23);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human!=null){
				textPane_1.setText("");
				dog = new Dog(textField_1.getText());
				human.buyDog(dog);
				}else{
					textPane_1.setText("Dogs need a human owner!");
				}
			}
			
		});
		btnBuyDog.setBounds(193, 77, 89, 23);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(human.getInfo());
			}
		});
		btnPrintInfo.setBounds(193, 111, 89, 23);
		contentPane.add(btnPrintInfo);
		
		
		

		
		
	}
}
