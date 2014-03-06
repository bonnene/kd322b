import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class BikeWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private BikeStore bikeStore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeWindow frame = new BikeWindow();
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
	public BikeWindow() {
		
		bikeStore = new BikeStore();
				
		bikeStore.startingBikes();		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(338, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(338, 57, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(338, 88, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 318, 240);
		contentPane.add(textArea);
		
		JButton btnAddBike = new JButton("Add bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bikeStore.addBike(textField.getText(),Integer.valueOf(textField_1.getText()),Integer.valueOf(textField_2.getText()));
				textArea.setText("");
				textArea.append(bikeStore.getAllBikes());

			}
		});
		btnAddBike.setBounds(335, 139, 89, 23);
		contentPane.add(btnAddBike);
		
		textArea.append(bikeStore.getAllBikes());

	}
}
